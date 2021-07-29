package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.EmpSalary;
import cn.edu.guet.bll.EmpSalaryService;
import cn.edu.guet.mapper.EmpSalaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpSalaryServiceImpl implements EmpSalaryService {
    @Autowired
    private EmpSalaryMapper empSalaryMapper;

    @Override
    public List<EmpSalary> findSalary(String id) {
        return this.empSalaryMapper.findSalary(id);
    }
}
