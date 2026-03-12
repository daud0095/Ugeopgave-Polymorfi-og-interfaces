public class Podcast extends MediaItem implements Playable{
    private String host;
    private String title;
    private int durationSeconds;

    public Podcast(String title, String host, int durationSeconds){
        super(title, durationSeconds);
        this.host = host;
    }
    public String getHost(){
        return host;
    }

    @Override
    public void play(){
        System.out.println("Afspiller podcast: " +  getTitle() + " " + getHost() + "(" + getDurationSeconds() + ")");
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public int getDurationSeconds(){
        return durationSeconds;
    }
}
