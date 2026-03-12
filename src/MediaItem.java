abstract class MediaItem {
    private String title;
    private int durationSeconds;

    public MediaItem(String title, int durationSeconds){
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle(){
        return title;
    }
    public int getDurationSeconds(){
        return durationSeconds;
    }

    @Override
    public String toString() {
        return "Song title:  " + title + " " + durationSeconds;

    }
}
