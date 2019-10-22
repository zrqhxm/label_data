package com.zrq.mapper;

import com.zrq.entity.Tag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapper {

    List<Tag> findAll();

    int insert(Tag record);

    int deleteByKey(@Param("tagId") String tagId);

    int updateByPrimaryKey(Tag tag);
}