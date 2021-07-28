package cn.edu.guet.bll.impl;


import cn.edu.guet.bean.EmployeesInfo;
import cn.edu.guet.bll.EmployeesInfoService;
import cn.edu.guet.mapper.EmployeesInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeInfoServiceImpl implements EmployeesInfoService {
    @Autowired
    private EmployeesInfoMapper employeesInfoMapper;


    @Override
    public List<EmployeesInfo> findUserAll(String id) {
        if(id.equals("M1000")){
            return employeesInfoMapper.findUserAll();
        }else{
            return employeesInfoMapper.findDeptUserAll(id);
        }
    }
}
