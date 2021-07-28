package cn.edu.guet.mapper;

import cn.edu.guet.bean.EmployeesInfo;

import java.util.List;

public interface EmployeesInfoMapper {
    List<EmployeesInfo> findDeptUserAll(String id);
    List<EmployeesInfo> findUserAll();

}
