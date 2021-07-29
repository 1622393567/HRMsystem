package cn.edu.guet.bean;

public class EmpSalary {
    private String EMP_ID;
    private String EMP_BASIC_SALARY;
    private String EMP_BONUS;
    private String EMP_ADDWORK;
    private String EMP_PUNISH;
    private String EMP_INSURANCE;
    private String EMP_TAX;
    private String EMP_SHOULD_SALARY;
    private String EMP_REAL_SALARY;
    private String DATE;

    public EmpSalary(String EMP_ID, String EMP_BASIC_SALARY, String EMP_BONUS, String EMP_ADDWORK, String EMP_PUNISH, String EMP_INSURANCE, String EMP_TAX, String EMP_SHOULD_SALARY, String EMP_REAL_SALARY, String DATE) {
        this.EMP_ID = EMP_ID;
        this.EMP_BASIC_SALARY = EMP_BASIC_SALARY;
        this.EMP_BONUS = EMP_BONUS;
        this.EMP_ADDWORK = EMP_ADDWORK;
        this.EMP_PUNISH = EMP_PUNISH;
        this.EMP_INSURANCE = EMP_INSURANCE;
        this.EMP_TAX = EMP_TAX;
        this.EMP_SHOULD_SALARY = EMP_SHOULD_SALARY;
        this.EMP_REAL_SALARY = EMP_REAL_SALARY;
        this.DATE = DATE;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }



    public EmpSalary(){

    }

    public String getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(String EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_BASIC_SALARY() {
        return EMP_BASIC_SALARY;
    }

    public void setEMP_BASIC_SALARY(String EMP_BASIC_SALARY) {
        this.EMP_BASIC_SALARY = EMP_BASIC_SALARY;
    }

    public String getEMP_BONUS() {
        return EMP_BONUS;
    }

    public void setEMP_BONUS(String EMP_BONUS) {
        this.EMP_BONUS = EMP_BONUS;
    }

    public String getEMP_ADDWORK() {
        return EMP_ADDWORK;
    }

    public void setEMP_ADDWORK(String EMP_ADDWORK) {
        this.EMP_ADDWORK = EMP_ADDWORK;
    }

    public String getEMP_PUNISH() {
        return EMP_PUNISH;
    }

    public void setEMP_PUNISH(String EMP_PUNISH) {
        this.EMP_PUNISH = EMP_PUNISH;
    }

    public String getEMP_INSURANCE() {
        return EMP_INSURANCE;
    }

    public void setEMP_INSURANCE(String EMP_INSURANCE) {
        this.EMP_INSURANCE = EMP_INSURANCE;
    }

    public String getEMP_TAX() {
        return EMP_TAX;
    }

    public void setEMP_TAX(String EMP_TAX) {
        this.EMP_TAX = EMP_TAX;
    }

    public String getEMP_SHOULD_SALARY() {
        return EMP_SHOULD_SALARY;
    }

    public void setEMP_SHOULD_SALARY(String EMP_SHOULD_SALARY) {
        this.EMP_SHOULD_SALARY = EMP_SHOULD_SALARY;
    }

    public String getEMP_REAL_SALARY() {
        return EMP_REAL_SALARY;
    }

    public void setEMP_REAL_SALARY(String EMP_REAL_SALARY) {
        this.EMP_REAL_SALARY = EMP_REAL_SALARY;
    }




}
