package com.zrq.service.impl;

import com.zrq.entity.Brand;
import com.zrq.entity.Tag;
import com.zrq.entity.TagDict;
import com.zrq.mapper.BrandMapper;
import com.zrq.mapper.TagDictMapper;
import com.zrq.mapper.TagMapper;
import com.zrq.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private TagMapper tagMapper;

    @Autowired
    private TagDictMapper tagDictMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }

    /**
     * 通过品牌主键ID删除品牌并且删除对应的字典数据
     * @param brandId
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer brandId) {
        Brand brand = brandMapper.selectByPrimaryKey(brandId);
        String abbrName = brand.getBrandAbbrName();
        List<Tag> tagList = tagMapper.findAll();
        for (Tag tag : tagList) {
            tagDictMapper.deleteTagDict(abbrName+"_"+tag.getTagId());
        }
        return brandMapper.deleteByPrimaryKey(brandId);
    }

    @Override
    public int deleteByAbbrName(String abbrName) {
        Brand brand = brandMapper.findByAbbrName(abbrName);
        if(brand != null){
            List<Tag> tagList = tagMapper.findAll();
            for (Tag tag : tagList) {
                //物理删除
                tagDictMapper.deleteTagDict(abbrName+"_"+tag.getTagId());
            }
            return brandMapper.deleteByAbbrName(abbrName);
        }else{
            return 0;
        }
    }

    @Override
    public Brand findByAbbrName(String abbrName) {
        return null;
    }

    public int insert(Brand brand) {
        List<Tag> tagList = tagMapper.findAll();
        TagDict tagDict = null;
        String tagDictId = null;
        if(tagList != null){
            for (Tag tag:tagList) {
                tagDict = new TagDict();
                tagDictId = brand.getBrandAbbrName()+"_"+tag.getTagId();
                if(tagDictId != null) {
                    tagDict.setTagId(tagDictId);
                    tagDict.setBrandName(brand.getBrandName());
                    tagDict.setTagCode(tag.getTagCode());
                    tagDict.setTagChName(tag.getTagChName());
                    tagDict.setTagName(tag.getTagName());
                    tagDict.setBrandId(brand.getBrandId());
                    tagDict.setRemark(brand.getBrandChName()+ ' '+tag.getRemark());
                    tagDict.setIsDelete(0);
                    tagDictMapper.insert(tagDict);
                }else{
                    System.out.println("标签表中已存在该标签："+tagDictId);
                }
            }
        }
        return brandMapper.insert(brand);
    }


}
