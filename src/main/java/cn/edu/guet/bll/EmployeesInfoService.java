package cn.edu.guet.bll;



import cn.edu.guet.bean.EmployeesInfo;

import java.util.List;

public interface EmployeesInfoService {
    //List<EmployeesInfo> findDeptUserAll(String id);
    List<EmployeesInfo> findUserAll(String id);
}
