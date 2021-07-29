package cn.edu.guet.mapper;

import cn.edu.guet.bean.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> viewPost();
    List<Post> viewPostByKeyword(String keyword);
    void deletePostById(String postId);
    void deletePostByIds(String[] ids);

    Post getPostById(String postId);
    void editPost(Post post);
    void addPost(Post post);
}
