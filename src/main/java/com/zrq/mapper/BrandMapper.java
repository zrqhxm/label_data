package com.zrq.mapper;

import com.zrq.entity.Brand;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandMapper {

    List<Brand> findAll();

    int deleteByPrimaryKey(Integer brandId);

    Brand findByAbbrName(@Param("abbrName") String abbrName);

    int deleteByAbbrName(@Param("abbrName") String abbrName);

    int insert(Brand record);

    Brand selectByPrimaryKey(Integer brandId);


}