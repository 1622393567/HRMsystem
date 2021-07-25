package cn.edu.guet.bll;

import cn.edu.guet.bean.Department;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface DepartmentService {
    List<Department> viewDepartment();
    void outputExcel(HttpServletResponse response) throws IOException;
    List<Department> viewDepartmentByKeyword(String keyword);
    void deleteDepartmentById(String deptId);
    Department getDepartmentById(String deptId);

    void editDepartment(Department department);
    void addDepartment(Department department);


}
