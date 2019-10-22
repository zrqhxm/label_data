package com.zrq.mapper;

import com.zrq.entity.TagDict;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagDictMapper {

    List<TagDict> findAll();

    int insert(TagDict record);

    int insertSelective(TagDict record);

    int deleteByKey(@Param("tagId") String tagId);

    int deleteTagDict(@Param("tagId") String tagId);

    TagDict findOne(@Param("tagId") String tagId);
}