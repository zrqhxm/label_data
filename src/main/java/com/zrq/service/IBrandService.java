package com.zrq.service;

import com.zrq.entity.Brand;

import java.util.List;

public interface IBrandService {
    List<Brand> findAll();

    int deleteByAbbrName(String abbrName);

    int insert(Brand record);

    Brand findByAbbrName(String abbrName);

    int deleteByPrimaryKey(Integer brandId);
}
