package Mp3Player;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static ArrayList<AlbumTitle>listOfAlbums = new ArrayList<>();
    public static void main(String[] args) {
        AlbumTitle albumTitle = new AlbumTitle("Grass2Grace","2face Idibia");
        albumTitle.addSong("One love", 4.5);
        albumTitle.addSong("Happy face", 4.45);
        albumTitle.addSong("Dance in the rain", 4.54);
        albumTitle.addSong("If love is a crime", 4.5);
        listOfAlbums.add(albumTitle);

        albumTitle = new AlbumTitle("Get The Guns","Eminen");
        albumTitle.addSong("Till i collapse", 5.00);
        albumTitle.addSong("Kings never die", 4.57);
        albumTitle.addSong("Not Afraid", 4.30);
        albumTitle.addSong("Rap God", 5.00);
        listOfAlbums.add(albumTitle);

        //LinkedList<Songs>playListOne = new LinkedList<>();
    }
}
