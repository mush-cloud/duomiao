package com.duomiao.entity;

public class EnterpriseInfoWithBLOBs extends EnterpriseInfo {
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
}