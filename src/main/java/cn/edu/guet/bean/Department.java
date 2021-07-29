package cn.edu.guet.bean;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Department {
    private String deptId;
    private String deptName;
    private String deptBossId;
    private String deptInfo;
    private String deptFoundingTime;

    public Department(){
    }

    public Department(String deptId, String deptName, String deptBossId, String deptInfo, String deptFoundingTime) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptBossId = deptBossId;
        this.deptInfo = deptInfo;
        this.deptFoundingTime = deptFoundingTime;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptBossId() {
        return deptBossId;
    }

    public void setDeptBossId(String deptBossId) {
        this.deptBossId = deptBossId;
    }

    public String getDeptInfo() {
        return deptInfo;
    }

    public void setDeptInfo(String deptInfo) {
        this.deptInfo = deptInfo;
    }

    public String getDeptFoundingTime() {
        return deptFoundingTime;
    }

    public void setDeptFoundingTime(String deptFoundingTime) {
        this.deptFoundingTime = deptFoundingTime;
    }
}
