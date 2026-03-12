public class Song extends MediaItem implements Playable{
    private String artist;
    private int durationSeconds;

    public Song(String title, String artist, int durationSeconds){
        super(title, durationSeconds);
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }

@Override
    public void play(){
        System.out.println("Afspiller: " + getTitle() + " af " + getArtist() + "(" + getDurationSeconds() + ")");
    }

    @Override
    public int getDurationSeconds() {
        return durationSeconds;
    }
}
