package media;
public class Dict extends Media {
    int length;
    String director;
    public Dict(String title, String category, float cost){
        super(title, category, cost);
    }
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }
}
