package cn.edu.guet.mapper;

import cn.edu.guet.bean.EmpAccount;
import cn.edu.guet.bean.EmployeesInfo;

import java.util.List;


public interface PersonalMapper {
    List<EmployeesInfo> findSelf(String id);
    EmployeesInfo findSelfByEMP_ID(String EMP_ID);
    void updateInfo(EmployeesInfo employeesInfo);
    //更改密码
    EmpAccount findAccountByEMP_ID(String EMP_ID);
    void updatePassword(EmpAccount empAccount);
}
