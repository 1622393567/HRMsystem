package cn.edu.guet.controller;

import cn.edu.guet.bean.Department;
import cn.edu.guet.bean.User;
import cn.edu.guet.bll.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("viewUser")
    public String viewUser(HttpServletRequest request){
        List<User> users = userService.viewUser();
        request.setAttribute("users", users);
        System.out.println(users.get(0).getEmpPhoneNumber());
        return "UserManage";
    }

    @PostMapping("viewUserByKeyword")
    public String viewUserByKeyword(String keyword,HttpServletRequest request){
        List<User> users = userService.viewUserByKeyword(keyword);
        request.setAttribute("users", users);
        return "UserManage::userInfo";  //载到index.html的某个div
    }

    @GetMapping("outputExcel")
    public void outputExcel(HttpServletResponse response) throws IOException {
        userService.outputExcel(response);
    }

    @PostMapping("deleteUserById")
    @ResponseBody
    public String deleteUserById(String empId){
        System.out.println("删除测试："+empId);
        if (empId!=null){
            userService.deleteUserById(empId);
        }
        String successInfo="成功删除的账户ID："+empId;
        return successInfo;
    }


    @PostMapping("deleteUserByIds")
    @ResponseBody
    public String deleteUserByIds(@RequestParam(value = "ids[]") String[] ids){
        for (int i=0;i<ids.length;i++){
            System.out.println(ids[i]+",");
        }
        userService.deleteUserByIds(ids);
        String successInfo="成功删除该部门";
        return successInfo;
    }

    @PostMapping("getUserById")
    @ResponseBody
    public User getUserById(String empId){
        User user=null;
        if (empId!=null){
            user = userService.getUserById(empId);
        }
        return user;
    }

    @PostMapping("editUser")
    @ResponseBody
    public String editUser(@RequestBody User user){
        if (user.getEmpId()!=null){
            userService.editUser(user);
        }
        String successInfo="成功修改的部门ID："+user.getEmpId();
        return successInfo;
    }

    @PostMapping("addUser")
    @ResponseBody
    public String addUser(@RequestBody User user){
        if (user.getEmpId()!=null){
            userService.addUser(user);
        }
        String successInfo="成功添加的部门ID："+user.getEmpId();
        return successInfo;
    }
}
