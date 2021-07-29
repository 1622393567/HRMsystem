package cn.edu.guet.bll;

import cn.edu.guet.bean.EmpSalary;

import java.util.List;

public interface EmpSalaryService {
    List<EmpSalary> findSalary(String id);
}
