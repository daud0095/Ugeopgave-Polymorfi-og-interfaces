import java.util.ArrayList;

public class MediaPlayer {

    ArrayList<Playable> playables = new ArrayList<>();

    public void add(Playable item){
        playables.add(item);
    }

    public void playAll(){
        for(Playable playable : playables){
            playable.play();
        }
    }

    public int getTotalDuration(){
        int total = 0;
        for(Playable p : playables){
            total += p.getDurationSeconds();
        }
        return total;
    }

    public void printPlaylist(){
        System.out.println("Title: " );
    }
//h
}
