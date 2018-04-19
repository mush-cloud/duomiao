package com.duomiao.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class EnterpriseInfo {
    private String id;

    private String eniname;
//简要概述，一句话介绍，字数20字以内
    private String resume;
//公司图像地址
    private String imgUrl;

    private String address;

    private String tel;

    private Integer employeenum;
//行业方向，领域
    private String industry;

    private String uniscid;
    @DateTimeFormat
    private Date regtime;
//注册资本
    private String regCapital;
//企业审核状态，0未审核 1审核
    private String status;

    //详细介绍
    private String introduction;
    //企业福利
    private String welfare;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare == null ? null : welfare.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEniname() {
        return eniname;
    }

    public void setEniname(String eniname) {
        this.eniname = eniname == null ? null : eniname.trim();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getEmployeenum() {
        return employeenum;
    }

    public void setEmployeenum(Integer employeenum) {
        this.employeenum = employeenum;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getUniscid() {
        return uniscid;
    }

    public void setUniscid(String uniscid) {
        this.uniscid = uniscid == null ? null : uniscid.trim();
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital == null ? null : regCapital.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}