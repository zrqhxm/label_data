package com.zrq.controller;

import com.zrq.entity.Brand;
import com.zrq.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private IBrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }

    /**
     * 新增品牌，自动新增标签字典
     * @param brand
     * @return
     */
    @RequestMapping("/addBrand")
    public int addBrand(@RequestBody Brand brand){
        brand.setCreateTime(new Date());
        brand.setUpdateTime(new Date());
        return brandService.insert(brand);
    }

    @RequestMapping("/delByAbbrName")
    public String deleteByAbbrName(String abbrName){
        int i = brandService.deleteByAbbrName(abbrName);
        if(i == 1){
            return "删除品牌成功,"+abbrName;
        }else{
            return "删除品牌失败,"+abbrName;
        }

    }
}
