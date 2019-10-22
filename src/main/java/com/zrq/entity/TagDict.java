package com.zrq.entity;

public class TagDict {

    private String tagId;

    private String tagCode;

    private String tagName;

    private String brandName;

    private String tagChName;

    private Integer brandId;

    private String remark;

    private Integer isDelete;

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }

    public String getTagCode() {
        return tagCode;
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode == null ? null : tagCode.trim();
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getTagChName() {
        return tagChName;
    }

    public void setTagChName(String tagChName) {
        this.tagChName = tagChName == null ? null : tagChName.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TagDict{" +
                "tagId='" + tagId + '\'' +
                ", tagCode='" + tagCode + '\'' +
                ", tagName='" + tagName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", tagChName='" + tagChName + '\'' +
                ", brandId=" + brandId +
                ", remark='" + remark + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}