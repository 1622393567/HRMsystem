package cn.edu.guet.controller;

import cn.edu.guet.bean.EmpAccount;
import cn.edu.guet.bean.EmployeesInfo;
import cn.edu.guet.bean.RestResult;
import cn.edu.guet.bean.vo.ChangePassword;
import cn.edu.guet.bll.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RequestMapping("/self")
public class PersonalController {
    @Autowired
    private PersonalService PersonalService;
//显示个人信息数据
    @RequestMapping("/findSelf")
    public String findSelf(Model model, HttpServletRequest request){
        String id=(String)request.getSession().getAttribute("emp_id");
        System.out.println("获取到的id："+id);
        List<EmployeesInfo> list= PersonalService.findSelf(id);
        model.addAttribute("list",list);
        return "personal";
    }
    //更新个人信息的数据
    @PostMapping("findSelfByEMP_ID")
    @ResponseBody
    public Map<String,Object> findSelfByEMP_ID(String EMP_ID ){

        EmployeesInfo employeesInfo=PersonalService.findSelfByEMP_ID(EMP_ID);
        Map<String,Object> map=new HashMap<>();
        map.put("EMP_PHONE_NUMBER",employeesInfo.getEMP_PHONE_NUMBER());
        map.put("EMP_E_MAIL",employeesInfo.getEMP_E_MAIL());
        map.put("EMP_LOCATION",employeesInfo.getEMP_LOCATION());
        System.out.println(map);
        return map;
    }
    @RequestMapping("/editUser")
    public String editUser(EmployeesInfo employeesInfo, @RequestBody Map<String,Object> map,Model model,HttpServletRequest request){
        String EMP_PHONE_NUMBER=map.get("phnoe_number").toString();
        String EMP_E_MAIL=map.get("email").toString();
        String EMP_LOCATION=map.get("location").toString();
        String id=(String)request.getSession().getAttribute("emp_id");
        System.out.println("ssss"+id);
        employeesInfo=new EmployeesInfo(EMP_PHONE_NUMBER,EMP_E_MAIL,EMP_LOCATION);
        employeesInfo.setEMP_ID(id);
        System.out.println(EMP_PHONE_NUMBER+EMP_E_MAIL+EMP_LOCATION);
        PersonalService.updateInfo(employeesInfo);

        System.out.println("获取到的id："+id);
        List<EmployeesInfo> list= PersonalService.findSelf(id);
        model.addAttribute("list",list);
        return "personal";
    }

    //更改密码
    @PostMapping("/findAccountByEMP_ID")
    @ResponseBody
    public Map<String,Object> findAccountByEMP_ID(String EMP_ID ){
        EmpAccount empAccount=PersonalService.findAccountByEMP_ID(EMP_ID);
        Map<String,Object> map=new HashMap<>();
        map.put("emp_id",empAccount.getEmp_id());
        map.put("emp_password",empAccount.getEmp_password());
        System.out.println(map);
        return map;
    }
    @RequestMapping("/updatePassword")
    @ResponseBody
    public RestResult updatePassword(@RequestBody ChangePassword changePassword){
        RestResult restResult = new RestResult();
        EmpAccount user = this.PersonalService.findAccountByEMP_ID(changePassword.getName());
        System.out.println(user);
        if (user != null && changePassword.getNewpassword().equals(changePassword.getAgain())){
            user.setEmp_password(changePassword.getNewpassword());
            this.PersonalService.updatePassword(user);
            restResult.setCode(200);
            restResult.setMsg("请求成功");
        }


        return restResult;
    }


}
