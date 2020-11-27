package domain;

public class Post {
    private int id;
    private String date;
    private String pictureUrl;
    private String postText;
    private CommentsInfo commentsInfo;
    private int likesNumber;
    private int repostsNumber;
    private int viewsNumber;
    private PublicInfo publicInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getLikesNumber() {
        return likesNumber;
    }

    public void setLikesNumber(int likesNumber) {
        this.likesNumber = likesNumber;
    }

    public int getRepostsNumber() {
        return repostsNumber;
    }

    public void setRepostsNumber(int repostsNumber) {
        this.repostsNumber = repostsNumber;
    }

    public int getViewsNumber() {
        return viewsNumber;
    }

    public void setViewsNumber(int viewsNumber) {
        this.viewsNumber = viewsNumber;
    }

    public PublicInfo getPublicInfo() {
        return publicInfo;
    }

    public void setPublicInfo(PublicInfo publicInfo) {
        this.publicInfo = publicInfo;
    }
}