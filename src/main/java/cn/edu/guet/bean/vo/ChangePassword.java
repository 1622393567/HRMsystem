package cn.edu.guet.bean.vo;

public class ChangePassword {
    private String name;
    private String oldpassword;
    private String newpassword;
    private String again;

    public ChangePassword(String name, String oldpassword, String newpassword, String again) {
        this.name = name;
        this.oldpassword = oldpassword;
        this.newpassword = newpassword;
        this.again = again;
    }

    public ChangePassword() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldpassword() {
        return oldpassword;
    }

    public void setOldpassword(String oldpassword) {
        this.oldpassword = oldpassword;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getAgain() {
        return again;
    }

    public void setAgain(String again) {
        this.again = again;
    }

    @Override
    public String toString() {
        return "ChangePassword{" +
                "name='" + name + '\'' +
                ", oldpassword='" + oldpassword + '\'' +
                ", newpassword='" + newpassword + '\'' +
                ", again='" + again + '\'' +
                '}';
    }
}
