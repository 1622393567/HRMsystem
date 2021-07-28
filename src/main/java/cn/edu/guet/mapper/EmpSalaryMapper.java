package cn.edu.guet.mapper;

import cn.edu.guet.bean.EmpSalary;

import java.util.List;

public interface EmpSalaryMapper {
    List<EmpSalary> findSalary(String id);
}
