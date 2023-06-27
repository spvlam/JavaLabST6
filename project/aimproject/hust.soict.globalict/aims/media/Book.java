package media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
     private List<String> authors = new ArrayList<String>();
    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(title, category, cost);  
        this.category = category;
        this.authors = authors;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public List<String> getAuthors() {
        return authors;
    }
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
    public boolean check_auther(String author){
        return this.authors.contains(author);
    }
    public void addAuthor(String author){
        if(check_auther(author)){
            System.out.println("this auther has been existed");
        }else{
            this.authors.add(author);
        }
    }
    public void removeAuthor(String author){
         if(check_auther(author)){
            this.authors.remove(author);
        }else{
          System.out.println("this auther has not been existed");
        }
    }
         
}
