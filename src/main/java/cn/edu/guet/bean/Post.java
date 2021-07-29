package cn.edu.guet.bean;

public class Post {
    String postId;
    String postName;
    String postLevel;
    String postResp;

    public Post(){

    }
    public Post(String postId, String postName, String postLevel, String postResp) {
        this.postId = postId;
        this.postName = postName;
        this.postLevel = postLevel;
        this.postResp = postResp;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostLevel() {
        return postLevel;
    }

    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel;
    }

    public String getPostResp() {
        return postResp;
    }

    public void setPostResp(String postResp) {
        this.postResp = postResp;
    }
}
