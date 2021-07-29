package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.Department;
import cn.edu.guet.bean.Post;
import cn.edu.guet.bll.PostService;
import cn.edu.guet.mapper.DepartmentMapper;
import cn.edu.guet.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    @Override
    public List<Post> viewPost() {
        return postMapper.viewPost();
    }

    @Override
    public List<Post> viewPostByKeyword(String keyword) {
        return postMapper.viewPostByKeyword(keyword);
    }

    @Override
    public void deletePostById(String postId) {
        postMapper.deletePostById(postId);
    }

    @Override
    public void deletePostByIds(String[] ids) {
        postMapper.deletePostByIds(ids);
    }

    @Override
    public void outputExcel(HttpServletResponse response) throws IOException {
        String sheetName = "职位表";
        String[] headers = {"职位编号","职位名称","职位级别","职位简介"};
        List<Post> posts = postMapper.viewPost();
        List<List<String>> data = new ArrayList();
        for (Post p : posts) {
            List<String> row = new ArrayList<>();
            row.add(p.getPostId());
            row.add(p.getPostName());
            row.add(p.getPostLevel());
            row.add(p.getPostResp());
            data.add(row);
        }
        ExcelUtil.exportExcel(response, sheetName, headers, data);
    }

    @Override
    public Post getPostById(String postId) {
        return postMapper.getPostById(postId);
    }

    @Override
    public void editPost(Post post) {
        postMapper.editPost(post);
    }


    @Override
    public void addPost(Post post) {
        postMapper.addPost(post);
    }

}
