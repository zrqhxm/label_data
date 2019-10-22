package com.zrq.entity;

import java.util.Date;

public class Brand {

    private Integer brandId;

    private String brandName;

    private String brandChName;

    private String brandAbbrName;

    private Date createTime;

    private Date updateTime;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandChName() {
        return brandChName;
    }

    public void setBrandChName(String brandChName) {
        this.brandChName = brandChName == null ? null : brandChName.trim();
    }

    public String getBrandAbbrName() {
        return brandAbbrName;
    }

    public void setBrandAbbrName(String brandAbbrName) {
        this.brandAbbrName = brandAbbrName == null ? null : brandAbbrName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}