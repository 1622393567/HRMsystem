package cn.edu.guet.bll;

import cn.edu.guet.bean.Department;
import cn.edu.guet.bean.Post;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface PostService {
    List<Post> viewPost();
    List<Post> viewPostByKeyword(String keyword);
    void deletePostById(String postId);
    void deletePostByIds(String[] ids);
    void outputExcel(HttpServletResponse response) throws IOException;

    Post getPostById(String postId);
    void editPost(Post post);
    void addPost(Post post);


}
