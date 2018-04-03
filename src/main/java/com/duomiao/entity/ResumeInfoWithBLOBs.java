package com.duomiao.entity;

public class ResumeInfoWithBLOBs extends ResumeInfo {
    private String education;

    private String certReward;

    private String skill;

    private String workExperience;

    private String proExperience;

    private String valuation;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getCertReward() {
        return certReward;
    }

    public void setCertReward(String certReward) {
        this.certReward = certReward == null ? null : certReward.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience == null ? null : workExperience.trim();
    }

    public String getProExperience() {
        return proExperience;
    }

    public void setProExperience(String proExperience) {
        this.proExperience = proExperience == null ? null : proExperience.trim();
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation == null ? null : valuation.trim();
    }
}