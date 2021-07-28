package cn.edu.guet.bean;


import java.sql.Date;

public class EmployeesInfo {
    private String EMP_ID;
    private String DEPT_ID;
    private String POST_ID;
    private String EMP_NAME;
    private String EMP_SEX;

    public EmployeesInfo(String EMP_PHONE_NUMBER, String EMP_E_MAIL, String EMP_LOCATION) {
        this.EMP_PHONE_NUMBER = EMP_PHONE_NUMBER;
        this.EMP_E_MAIL = EMP_E_MAIL;
        this.EMP_LOCATION = EMP_LOCATION;
    }

    private String EMP_STATE;
    private Date EMP_ENTRY_TIME;
    private String EMP_IDENTIFY_TYPE;
    private String EMP_IDENTIFY_NUMBER;
    private String EMP_PHONE_NUMBER;
    private String EMP_E_MAIL;
    private String EMP_NATION;
    private String EMP_NATIVE_PLACE;
    private String EMP_BIRTHDAY;
    private String EMP_LOCATION;
    private String EMP_EDU_BGD;
    private String EMP_ENTRY_WAY;
    private String EMP_EDU_SCHOOL;

    public EmployeesInfo(){

    }

    public EmployeesInfo(String EMP_ID, String DEPT_ID, String POST_ID, String EMP_NAME, String EMP_SEX, String EMP_STATE, Date EMP_ENTRY_TIME, String EMP_IDENTIFY_TYPE, String EMP_IDENTIFY_NUMBER, String EMP_PHONE_NUMBER, String EMP_E_MAIL, String EMP_NATION, String EMP_NATIVE_PLACE, String EMP_BIRTHDAY, String EMP_LOCATION, String EMP_EDU_BGD, String EMP_ENTRY_WAY, String EMP_EDU_SCHOOL) {
        this.EMP_ID = EMP_ID;
        this.DEPT_ID = DEPT_ID;
        this.POST_ID = POST_ID;
        this.EMP_NAME = EMP_NAME;
        this.EMP_SEX = EMP_SEX;
        this.EMP_STATE = EMP_STATE;
        this.EMP_ENTRY_TIME = EMP_ENTRY_TIME;
        this.EMP_IDENTIFY_TYPE = EMP_IDENTIFY_TYPE;
        this.EMP_IDENTIFY_NUMBER = EMP_IDENTIFY_NUMBER;
        this.EMP_PHONE_NUMBER = EMP_PHONE_NUMBER;
        this.EMP_E_MAIL = EMP_E_MAIL;
        this.EMP_NATION = EMP_NATION;
        this.EMP_NATIVE_PLACE = EMP_NATIVE_PLACE;
        this.EMP_BIRTHDAY = EMP_BIRTHDAY;
        this.EMP_LOCATION = EMP_LOCATION;
        this.EMP_EDU_BGD = EMP_EDU_BGD;
        this.EMP_ENTRY_WAY = EMP_ENTRY_WAY;
        this.EMP_EDU_SCHOOL = EMP_EDU_SCHOOL;
    }

    public String getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(String EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(String DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public String getPOST_ID() {
        return POST_ID;
    }

    public void setPOST_ID(String POST_ID) {
        this.POST_ID = POST_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public String getEMP_SEX() {
        return EMP_SEX;
    }

    public void setEMP_SEX(String EMP_SEX) {
        this.EMP_SEX = EMP_SEX;
    }

    public String getEMP_STATE() {
        return EMP_STATE;
    }

    public void setEMP_STATE(String EMP_STATE) {
        this.EMP_STATE = EMP_STATE;
    }

    public Date getEMP_ENTRY_TIME() {
        return EMP_ENTRY_TIME;
    }

    public void setEMP_ENTRY_TIME(Date EMP_ENTRY_TIME) {
        this.EMP_ENTRY_TIME = EMP_ENTRY_TIME;
    }

    public String getEMP_IDENTIFY_TYPE() {
        return EMP_IDENTIFY_TYPE;
    }

    public void setEMP_IDENTIFY_TYPE(String EMP_IDENTIFY_TYPE) {
        this.EMP_IDENTIFY_TYPE = EMP_IDENTIFY_TYPE;
    }

    public String getEMP_IDENTIFY_NUMBER() {
        return EMP_IDENTIFY_NUMBER;
    }

    public void setEMP_IDENTIFY_NUMBER(String EMP_IDENTIFY_NUMBER) {
        this.EMP_IDENTIFY_NUMBER = EMP_IDENTIFY_NUMBER;
    }

    public String getEMP_PHONE_NUMBER() {
        return EMP_PHONE_NUMBER;
    }

    public void setEMP_PHONE_NUMBER(String EMP_PHONE_NUMBER) {
        this.EMP_PHONE_NUMBER = EMP_PHONE_NUMBER;
    }

    public String getEMP_E_MAIL() {
        return EMP_E_MAIL;
    }

    public void setEMP_E_MAIL(String EMP_E_MAIL) {
        this.EMP_E_MAIL = EMP_E_MAIL;
    }

    public String getEMP_NATION() {
        return EMP_NATION;
    }

    public void setEMP_NATION(String EMP_NATION) {
        this.EMP_NATION = EMP_NATION;
    }

    public String getEMP_NATIVE_PLACE() {
        return EMP_NATIVE_PLACE;
    }

    public void setEMP_NATIVE_PLACE(String EMP_NATIVE_PLACE) {
        this.EMP_NATIVE_PLACE = EMP_NATIVE_PLACE;
    }

    public String getEMP_BIRTHDAY() {
        return EMP_BIRTHDAY;
    }

    public void setEMP_BIRTHDAY(String EMP_BIRTHDAY) {
        this.EMP_BIRTHDAY = EMP_BIRTHDAY;
    }

    public String getEMP_LOCATION() {
        return EMP_LOCATION;
    }

    public void setEMP_LOCATION(String EMP_LOCATION) {
        this.EMP_LOCATION = EMP_LOCATION;
    }

    public String getEMP_EDU_BGD() {
        return EMP_EDU_BGD;
    }

    public void setEMP_EDU_BGD(String EMP_EDU_BGD) {
        this.EMP_EDU_BGD = EMP_EDU_BGD;
    }

    public String getEMP_ENTRY_WAY() {
        return EMP_ENTRY_WAY;
    }

    public void setEMP_ENTRY_WAY(String EMP_ENTRY_WAY) {
        this.EMP_ENTRY_WAY = EMP_ENTRY_WAY;
    }

    public String getEMP_EDU_SCHOOL() {
        return EMP_EDU_SCHOOL;
    }

    public void setEMP_EDU_SCHOOL(String EMP_EDU_SCHOOL) {
        this.EMP_EDU_SCHOOL = EMP_EDU_SCHOOL;
    }
}
