package com.zrq.service.impl;

import com.zrq.entity.Brand;
import com.zrq.entity.Tag;
import com.zrq.entity.TagDict;
import com.zrq.mapper.BrandMapper;
import com.zrq.mapper.TagDictMapper;
import com.zrq.mapper.TagMapper;
import com.zrq.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements ITagService {

    @Autowired
    private TagMapper tagMapper;

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private TagDictMapper tagDictMapper;

    @Override
    public List<Tag> findAll() {
        return tagMapper.findAll();
    }

    /**
     * 新增一条标签和品牌关联获取标签字典
     * @param
     * @return
     */
    @Override
    public int insert(Tag tag) {
        List<Brand> brandList = brandMapper.findAll();
        TagDict tagDict;
        String tagId;
        int insertTag = tagMapper.insert(tag);
        if(brandList != null){
            for (Brand brand:brandList) {
                tagId = brand.getBrandAbbrName()+"_"+tag.getTagId();
                TagDict tagDict1 = tagDictMapper.findOne(tagId);
                if(tagDict1 == null){
                    tagDict = new TagDict();
                    tagDict.setTagCode(tag.getTagCode());
                    tagDict.setTagName(tag.getTagName());
                    tagDict.setTagChName(tag.getTagChName());
                    tagDict.setBrandName(brand.getBrandName());
                    tagDict.setTagId(tagId);
                    tagDict.setBrandId(brand.getBrandId());
                    tagDict.setRemark(brand.getBrandChName()+ ' '+tag.getRemark());
                    tagDict.setIsDelete(0);
                    System.out.println(tagDict.toString());
                    tagDictMapper.insert(tagDict);
                }else{
                    System.out.println("标签表中已存在标签："+tagDict1.toString());
                }
            }
        }
        return insertTag;
    }

    @Override
    public int deleteByKey(String tagId){
        int i = tagMapper.deleteByKey(tagId);
        List<Brand> brandList = brandMapper.findAll();
        for (Brand brand:brandList) {
            String tagDictId = brand.getBrandAbbrName()+"_"+tagId;
            tagDictMapper.deleteTagDict(tagDictId);
            System.out.println("已删除标签字典ID:"+tagDictId);
        }
        return i;
    }

    @Override
    public int updateByPrimaryKey(Tag tag) {

        return 0;
    }


}
