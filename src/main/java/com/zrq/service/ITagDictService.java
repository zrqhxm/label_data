package com.zrq.service;

import com.zrq.entity.TagDict;

import java.util.List;

public interface ITagDictService {
    List<TagDict> findAll();

    int insert(TagDict record);

    int insertSelective(TagDict record);

    /**
     * 逻辑删除标签   set is_delete = 1
     * @param tagId
     * @return
     */
    int deleteByKey(String tagId);

    /**
     * 物理删除标签 delete
     * @param tagId
     * @return
     */
    int deleteTagDict(String tagId);

    TagDict findOne(String tagId);
}
