package com.zrq.service.impl;

import com.zrq.entity.TagDict;
import com.zrq.mapper.TagDictMapper;
import com.zrq.service.ITagDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TagDictService  implements ITagDictService {

    @Autowired
    private TagDictMapper tagDictMapper;

    @Override
    public List<TagDict> findAll() {
        return tagDictMapper.findAll();
    }

    @Override
    public int insert(TagDict record) {
        return 0;
    }

    @Override
    public int insertSelective(TagDict record) {
        return 0;
    }

    @Override
    public int deleteTagDict(String tagId) {
        return tagDictMapper.deleteTagDict(tagId);
    }

    @Override
    public TagDict findOne(String tagId) {
        return tagDictMapper.findOne(tagId);
    }

    @Override
    public int deleteByKey(String tagId) {
        return tagDictMapper.deleteByKey(tagId);
    }
}
