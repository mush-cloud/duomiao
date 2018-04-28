package com.duomiao.entity;

import java.io.Serializable;
import java.util.Date;

public class EntResume implements Serializable{
    private String id;

    private String entId;

    private String pjId;

    private String riId;

    private Date addTime;

    private String sex;

    private String age;

    private String academic;

    private String isdel;

    private Date delTime;

    private PublishJob publishJob;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }

    public String getPjId() {
        return pjId;
    }

    public void setPjId(String pjId) {
        this.pjId = pjId == null ? null : pjId.trim();
    }

    public String getRiId() {
        return riId;
    }

    public void setRiId(String riId) {
        this.riId = riId == null ? null : riId.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic == null ? null : academic.trim();
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }

    public Date getDelTime() {
        return delTime;
    }

    public void setDelTime(Date delTime) {
        this.delTime = delTime;
    }

    public PublishJob getPublishJob() {
        return publishJob;
    }

    public void setPublishJob(PublishJob publishJob) {
        this.publishJob = publishJob;
    }
}