package cn.edu.guet.controller;

import cn.edu.guet.bean.Department;
import cn.edu.guet.bll.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/dept")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("deptMain")
    public String deptMain(){
        return "deptMain";
    }

    @GetMapping("viewDepartment")
    public String viewDepartment(HttpServletRequest request){
        System.out.println("成功接收");
        List<Department> departments = departmentService.viewDepartment();
        request.setAttribute("departments", departments);
        System.out.println(departments.get(0).getDeptName());
        return "deptManage";
    }

    @GetMapping("outputExcel")
    public void outputExcel(HttpServletResponse response) throws IOException {
        departmentService.outputExcel(response);
    }

    @PostMapping("viewDepartmentByKeyword")
    public String viewDepartmentByKeyword(String keyword,HttpServletRequest request){
        System.out.println(keyword);
        List<Department> departments = departmentService.viewDepartmentByKeyword(keyword);
        request.setAttribute("departments", departments);
        return "deptManage::deptInfo";  //载到index.html的某个div
    }

    @PostMapping("deleteDepartmentById")
    @ResponseBody
    public String deleteDepartmentById(String deptId){
        System.out.println(deptId);
        if (deptId!=null){
            departmentService.deleteDepartmentById(deptId);
        }
        String successInfo="成功删除的部门ID："+deptId;
        return successInfo;
    }

    @PostMapping("deleteDepartmentByIds")
    @ResponseBody
    public String deleteDepartmentByIds(@RequestParam(value = "ids[]") String[] ids){
        for (int i=0;i<ids.length;i++){
            System.out.println(ids[i]+",");
        }
        departmentService.deleteDepartmentByIds(ids);
        String successInfo="成功删除的部门ID：";
        return successInfo;
    }

    @PostMapping("getDepartmentById")
    @ResponseBody
    public Department getDepartmentById(String deptId){
        Department department=null;
        if (deptId!=null){
            department = departmentService.getDepartmentById(deptId);
            String tmp=department.getDeptFoundingTime().replace(" ","T");
            department.setDeptFoundingTime(tmp);
        }
        return department;
    }

    @PostMapping("editDepartment")
    @ResponseBody
    public String editDepartment(@RequestBody Department department){
        String tmp=department.getDeptFoundingTime().replace("T"," ");
        department.setDeptFoundingTime(tmp);
        if (department.getDeptId()!=null){
            departmentService.editDepartment(department);
        }
        String successInfo="成功修改的部门ID："+department.getDeptId();
        return successInfo;
    }

    @PostMapping("addDepartment")
    @ResponseBody
    public String addDepartment(@RequestBody Department department){
        String tmp=department.getDeptFoundingTime().replace("T"," ");
        department.setDeptFoundingTime(tmp);
        if (department.getDeptId()!=null){
            departmentService.addDepartment(department);
        }
        String successInfo="成功添加的部门ID："+department.getDeptId();
        return successInfo;
    }


}
