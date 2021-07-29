package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.Post;
import cn.edu.guet.bean.User;
import cn.edu.guet.bll.UserService;
import cn.edu.guet.mapper.PostMapper;
import cn.edu.guet.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> viewUser() {
        return userMapper.viewUser();
    }

    @Override
    public List<User> viewUserByKeyword(String keyword) {
        return userMapper.viewUserByKeyword(keyword);
    }

    @Override
    public void deleteUserById(String empId) {
        userMapper.deleteUserById(empId);
    }

    @Override
    public void outputExcel(HttpServletResponse response) throws IOException {
        String sheetName = "账号表";
        String[] headers = {"员工编号","密码","职位编号","手机号"};
        List<User> users = userMapper.viewUser();
        List<List<String>> data = new ArrayList();
        for (User u : users) {
            List<String> row = new ArrayList<>();
            row.add(u.getEmpId());
            row.add(u.getEmpPassword());
            row.add(u.getPostId());
            row.add(u.getEmpPhoneNumber());
            data.add(row);
        }
        ExcelUtil.exportExcel(response, sheetName, headers, data);
    }


    @Override
    public void deleteUserByIds(String[] ids) {
        userMapper.deleteUserByIds(ids);
    }

    @Override
    public User getUserById(String empId) {
        return userMapper.getUserById(empId);
    }

    @Override
    public void editUser(User user) {
        userMapper.editUser(user);
    }


    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }


}
