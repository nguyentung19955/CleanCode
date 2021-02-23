import java.util.ArrayList;

public class User {
    private long id;
    private String fullName;
    private ArrayList<Post> posts;  //Một người có thể viết nhiều Post
    private ArrayList<Comment> comments; //Một người có thể bình luận nhiều Comment
    //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !

    void writePost(Post post) { //ví dụ mẫu một phương thức nhé
        //Bổ xung logic vào đây
    }

    void deletePost(Post post) throws PostException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception

    }

    void writeComment(Comment comment, Post post) { //ví dụ mẫu một phương thức nhé
        //Bổ xung logic vào đây
    }

    void deleteComment(Comment comment) throws CommentException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception

    }
}

public class Post {
    private long id;
    private String title;
    private String content;
    private User author; //Tác giả của bài viết
    private ArrayList<Comment> comments; //Một post chứa nhiều Comment
    //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !
}

private class Comment{
    private long id;
    private String title;
    private Post post; //Bài viết mà comment gắn vào
    private User author; //Tác giả của comment
    //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !
}
