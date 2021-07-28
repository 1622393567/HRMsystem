package cn.edu.guet.controller;

import cn.edu.guet.bll.EmpSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/salary")
public class EmpSalaryController {
    @Autowired
    private EmpSalaryService empSalaryService;

    @RequestMapping("/findSalary")
    public String findSalary(Model model, HttpServletRequest request){
        String id=(String)request.getSession().getAttribute("emp_id");
        System.out.println("获取到的id："+id);
        model.addAttribute("list",empSalaryService.findSalary(id));
        return "salary";
    }

}

