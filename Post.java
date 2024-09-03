import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    
    // private static é para que eu tenha apenas uma copia para a aplicação inteira
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private List<Comments> comments = new ArrayList<>();

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comments> getComments(){
        return comments;
    }

    //Esse metodo vai na la na lista de comentario e pega um comentario
    public void addComments(Comments comment){
        comments.add(comment);
    }
     public void removeComments(Comments comment){
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");

        //Para cada comentario c add no stringBuilder;

        for(Comments c : comments){
            sb.append(c.getText() + "\n");
        }
        sb.append(" \n");

        return sb.toString();
    }
}
