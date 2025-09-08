public class Song {
    // write code here
    private double trackNumber;
    private String title;
    private double duration;


    public Song(double trackNumber, String title, double duration) {
        this.trackNumber = trackNumber;
        this.title = title;
        this.duration = duration;
    }

    public double getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(double trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}