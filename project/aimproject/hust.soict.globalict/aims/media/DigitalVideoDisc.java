package media;
public class DigitalVideoDisc  implements Playable {
    private String title;
    private float cost;
    private String category;
    private float length;
    private String director;
    private static int nbDigitalVideoDiscs = 0 ;
    public DigitalVideoDisc(String title){
        super();
        setNumber(getNumber()+1);
        this.title=title;
    }
    public DigitalVideoDisc(String category,String title,float cost){
        super();
        setNumber(getNumber()+1);
        this.category=category;
        this.title=title;
        this.cost=cost;
    }
    public DigitalVideoDisc(String title, String category, String director,float cost){
        super();
        setNumber(getNumber()+1);
        this.title=title;
        this.cost=cost;
        this.director=director;
        this.category=category;
    }
    public DigitalVideoDisc(String title, String category, String director,float length,float cost){
        super();
        setNumber(getNumber()+1);
        this.title=title;
        this.cost=cost;
        this.length=length;
        this.director=director;
        this.category=category;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        this.title=newTitle;
    }
    public float getCost(){
        return cost;
    }
    public void setCost(float newCost){
        this.cost=newCost;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String newCategory){
        this.category=newCategory;
    }
    public String getDirector(){
        return this.director;
    }
    public void setDirector(String newDirector){
        this.director = newDirector;
    }
    public float getLength(){
        return this.length;
    }
    public void setLength(float newLength){
        this.length= newLength;
    }
    public static int getNumber(){
        return nbDigitalVideoDiscs;
    }
    public static void setNumber(int newSt){
        nbDigitalVideoDiscs=newSt;
    }
    public boolean isMatch(String title){
        return title==this.title;
    }
    public void play() {
	System.out.println("Playing DVD: " + this.getTitle());
	System.out.println("DVD length: " + this.getLength());
}

   @Override
   public boolean equals(Object obj) {
       if(!(obj instanceof DigitalVideoDisc)){
          return false;
       }else{
        DigitalVideoDisc other =(DigitalVideoDisc) obj;
        return other.title == this.getTitle() && other.category== this.getCategory() && other.cost==this.getCost();
       }
   }
}
