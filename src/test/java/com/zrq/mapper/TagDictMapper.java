package com.zrq.mapper;

import com.zrq.entity.TagDict;

public interface TagDictMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_dict
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_dict
     *
     * @mbggenerated
     */
    int insert(TagDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_dict
     *
     * @mbggenerated
     */
    int insertSelective(TagDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_dict
     *
     * @mbggenerated
     */
    TagDict selectByPrimaryKey(String tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_dict
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TagDict record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tag_dict
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TagDict record);
}