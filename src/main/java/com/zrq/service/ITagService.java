package com.zrq.service;

import com.zrq.entity.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITagService {

    List<Tag> findAll();

    int insert(Tag record);

    int deleteByKey(@Param("tagId") String tagId);

    int updateByPrimaryKey(Tag tag);
}
