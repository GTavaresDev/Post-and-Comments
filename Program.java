import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Program{
  public static void main(String[] args) throws ParseException {
    //Instanciando os comentarios 
      Comments comment1 = new Comments("Have a nice tripe");
      Comments comment2 = new Comments("Wow that`s awesome!");

    //Instanciando o obj post
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Post post1 = new Post(sdf.parse("21/06/2024 16:30:23"),
     "Traveling to New Zeeland ", 
     "I`m going to visit this wonderful country!", 
     150);

     post1.addComments(comment1);
     post1.addComments(comment2);

      Comments comment3 = new Comments("Good Night!");
      Comments comment4 = new Comments("May the Force be with you");

    //Instanciando o obj post
    Post post2 = new Post(sdf.parse("11/04/2024 11:38:13"),
     "Good Night guys", 
     "See you tomorrow!", 
     180);

     post2.addComments(comment3);
     post2.addComments(comment4);

     System.out.print(post1);
     System.out.print(post2);
  }
}