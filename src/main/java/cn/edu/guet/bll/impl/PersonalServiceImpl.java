package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.EmpAccount;
import cn.edu.guet.bean.EmployeesInfo;
import cn.edu.guet.bll.PersonalService;
import cn.edu.guet.mapper.PersonalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalServiceImpl implements PersonalService {
    @Autowired
    private PersonalMapper personalMapper;

    @Override
    public List<EmployeesInfo> findSelf(String id) {
        return this.personalMapper.findSelf(id);
    }

    @Override
    public EmployeesInfo findSelfByEMP_ID(String EMP_ID) {
        return personalMapper.findSelfByEMP_ID(EMP_ID);
    }

    @Override
    public void updateInfo(EmployeesInfo employeesInfo) {

        this.personalMapper.updateInfo(employeesInfo);
    }

    @Override
    public EmpAccount findAccountByEMP_ID(String EMP_ID) {

        return personalMapper.findAccountByEMP_ID(EMP_ID);
    }

    @Override
    public void updatePassword(EmpAccount empAccount) {

       personalMapper.updatePassword(empAccount);

    }
}
