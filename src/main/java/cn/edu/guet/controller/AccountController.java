package cn.edu.guet.controller;



import cn.edu.guet.bean.EmpAccount;
import cn.edu.guet.bean.Result;
import cn.edu.guet.bll.EmpAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class AccountController {
    @Autowired
    private EmpAccountService accountService;


    @RequestMapping("checkLogin.do")
    public Result checkLogin(EmpAccount emp, HttpServletRequest request, HttpSession session) throws Exception {
        //传入参数 输出结果
        Result result=accountService.checkLogin(emp.getEmp_id(),emp.getEmp_password());
        if(result.getRes().equals("enable")){
            session.setAttribute("emp_id",result.getEmp_id());
        }
        return result;
    }

    @RequestMapping("getSession.do")
    public void getSession(HttpServletRequest request) throws Exception {
        System.out.println((String)request.getSession().getAttribute("emp_id"));
    }
   /* @RequestMapping(value = "Main.do")
    public MenuTree accountPower() throws Exception {
        return accountService.accountPower();
    }

    */
  /*  @RequestMapping("user/addUser.do")
    public String addUser(Users user){
        System.out.println("添加用户");
        System.out.println(user.getUsername());
        System.out.println(user.getUserpassword());
        System.out.println(user.getAge());
        return "forward:viewUser.jsp";
    }
    @RequestMapping("user/viewUser.do")
    public Users viewUser(){
        Users users=new Users();
        users.setUsername("lisi");
        users.setUserpassword("ls1234");
        users.setAge(33);
        return users;
    }

   */

}