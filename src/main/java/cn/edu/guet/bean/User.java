package cn.edu.guet.bean;

public class User {
    private String empId;
    private String empPassword;
    private String postId;
    private String empPhoneNumber;
    public User(){

    }

    public User(String empId, String empPassword, String postId, String empPhoneNumber) {
        this.empId = empId;
        this.empPassword = empPassword;
        this.postId = postId;
        this.empPhoneNumber = empPhoneNumber;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public void setEmpPhoneNumber(String empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }
}
