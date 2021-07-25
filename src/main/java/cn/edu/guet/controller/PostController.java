package cn.edu.guet.controller;

import cn.edu.guet.bean.Department;
import cn.edu.guet.bean.Post;
import cn.edu.guet.bll.DepartmentService;
import cn.edu.guet.bll.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("viewPost")
    public String viewPost(HttpServletRequest request){
        System.out.println("成功接收post");
        List<Post> posts = postService.viewPost();
        request.setAttribute("posts", posts);
        return "postManage";
    }

    @PostMapping("viewPostByKeyword")
    public String viewPostByKeyword(String keyword,HttpServletRequest request){
        List<Post> posts = postService.viewPostByKeyword(keyword);
        System.out.println("获取到了："+posts.get(0).getPostName());
        request.setAttribute("posts", posts);
        return "postManage::postInfo";  //载到index.html的某个div
    }

    @PostMapping("deletePostById")
    @ResponseBody
    public String deletePostById(String postId){
        System.out.println("删除测试："+postId);
        if (postId!=null){
            postService.deletePostById(postId);
        }
        String successInfo="成功删除的职位ID："+postId;
        return successInfo;
    }

    @GetMapping("outputExcel")
    public void outputExcel(HttpServletResponse response) throws IOException {
        postService.outputExcel(response);
    }

    @PostMapping("addPost")
    @ResponseBody
    public String addPost(@RequestBody Post post){
        if (post.getPostId()!=null){
            postService.addPost(post);
        }
        String successInfo="成功添加的部门ID："+post.getPostId();
        return successInfo;
    }

    @PostMapping("getPostById")
    @ResponseBody
    public Post getPostById(String postId){
        System.out.println("测试测试测试测试编辑··········"+postId);
        Post post=null;
        if (postId!=null){
            post = postService.getPostById(postId);
        }
        System.out.println(post.getPostId()+"ssss"+post.getPostName());
        return post;
    }

    @PostMapping("editPost")
    @ResponseBody
    public String editPost(@RequestBody Post post){
        if (post.getPostId()!=null){
            postService.editPost(post);
        }
        String successInfo="成功修改的职位ID："+post.getPostId();
        return successInfo;
    }
}
