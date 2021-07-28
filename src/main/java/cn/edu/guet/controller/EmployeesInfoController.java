package cn.edu.guet.controller;


import cn.edu.guet.bll.EmployeesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/personal")
public class EmployeesInfoController {
    @Autowired
    private EmployeesInfoService employeesInfoService;

    @RequestMapping("/findDeptUserAll")
    public String findDeptUserAll(Model model, HttpServletRequest request){
        String id=(String)request.getSession().getAttribute("emp_id");
        System.out.println("获取到的id："+id);
        model.addAttribute("list",employeesInfoService.findUserAll(id));
        return "member";
    }

}
