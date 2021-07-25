package cn.edu.guet.mapper;

import cn.edu.guet.bean.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> viewDepartment();

    List<Department> viewDepartmentByKeyword(String keyword);

    void deleteDepartmentById(String deptId);

    Department getDepartmentById(String deptId);
    void editDepartment(Department department);
    void addDepartment(Department department);



}
