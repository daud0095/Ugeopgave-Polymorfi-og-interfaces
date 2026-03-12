public class Audiobook extends MediaItem implements Playable{
    private String author;

    public Audiobook(String title, String author, int durationSeconds){
        super(title, durationSeconds);
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public void play(){
        System.out.println("Afspiller lydbog: " + getTitle() + " af " + getAuthor() + "(" + getDurationSeconds() + ")");
    }


}
