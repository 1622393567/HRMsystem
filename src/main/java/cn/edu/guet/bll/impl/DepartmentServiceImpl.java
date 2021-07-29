package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.Department;
import cn.edu.guet.bll.DepartmentService;
import cn.edu.guet.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> viewDepartment() {
        return departmentMapper.viewDepartment();
    }

    @Override
    public void outputExcel(HttpServletResponse response) throws IOException {
        String sheetName = "部门表";
        String[] headers = {"部门ID","部门名称","部门主管","部门简介","成立时间"};
        List<Department> departments = departmentMapper.viewDepartment();
        List<List<String>> data = new ArrayList();
        for (Department d : departments) {
            List<String> row = new ArrayList<>();
            row.add(d.getDeptId());
            row.add(d.getDeptName());
            row.add(d.getDeptBossId());
            row.add(d.getDeptInfo());
            String tmp=d.getDeptFoundingTime().replace("T"," ");
            row.add(tmp);
            data.add(row);
        }
        ExcelUtil.exportExcel(response, sheetName, headers, data);
    }

    @Override
    public List<Department> viewDepartmentByKeyword(String keyword) {
        return departmentMapper.viewDepartmentByKeyword(keyword);
    }

    @Override
    public void deleteDepartmentById(String deptId) {
        departmentMapper.deleteDepartmentById(deptId);
    }

    @Override
    public void deleteDepartmentByIds(String[] ids) {
        departmentMapper.deleteDepartmentByIds(ids);
    }

    @Override
    public Department getDepartmentById(String deptId) {
        return departmentMapper.getDepartmentById(deptId);
    }

    @Override
    public void editDepartment(Department department) {
        departmentMapper.editDepartment(department);
    }


    @Override
    public void addDepartment(Department department) {
        departmentMapper.addDepartment(department);
    }

}
