import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    public String getArtist() {
        return artist;
    }
    public CompactDisc(String title, String category, float cost){
        super(title, category, cost);
    }
    public void addTrack(Track addTR){
       if( this.tracks.contains(addTR)){
        System.out.print("error because of existing this track ");
       }else{
        this.tracks.add(addTR);
       }
    }
     public void removeTrack(Track addTR){
       if( ! this.tracks.contains(addTR)){
        System.out.print("error because of not  existing this track ");
       }else{
        this.tracks.remove(addTR);
       }
    }
    public int getLength(){
        int ln = 0;
        for( Track track : tracks){
           ln+=track.getLength();
        }
        return ln;
    }
    public void play(){
        for (Track trac : tracks){
            trac.play();
        }
    }
}
