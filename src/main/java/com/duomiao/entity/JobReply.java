package com.duomiao.entity;

import java.util.Date;

public class JobReply {
    private String id;

    private String hrId;

    private String intId;

    private String mainInfo;

    private Date replyTime;

    private String jobId;

    private String parentId;

    private String replyNum;

    private String agreeNum;

    private String clickUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId == null ? null : hrId.trim();
    }

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId == null ? null : intId.trim();
    }

    public String getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(String mainInfo) {
        this.mainInfo = mainInfo == null ? null : mainInfo.trim();
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(String replyNum) {
        this.replyNum = replyNum == null ? null : replyNum.trim();
    }

    public String getAgreeNum() {
        return agreeNum;
    }

    public void setAgreeNum(String agreeNum) {
        this.agreeNum = agreeNum == null ? null : agreeNum.trim();
    }

    public String getClickUser() {
        return clickUser;
    }

    public void setClickUser(String clickUser) {
        this.clickUser = clickUser == null ? null : clickUser.trim();
    }
}