package Mp3Player;

public class Songs {
    String titleOfSong;
    double songDuration;
    public Songs(String nameOfSong, double songDuration) {
        this.titleOfSong = nameOfSong;
        this.songDuration = songDuration;
    }
    public Songs(){

    }

    public String getTitleOfSong() {
        return titleOfSong;
    }

    public double getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString() {
        return "songs{" +
                "titleOfSong='" + titleOfSong + '\'' +
                ", songDuration=" + songDuration +
                '}';
    }
}
