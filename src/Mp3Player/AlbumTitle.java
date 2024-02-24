package Mp3Player;

import java.util.ArrayList;
import java.util.LinkedList;

public class AlbumTitle {
    private String nameOfAlbum;
    private String nameOfArtist;
    private ArrayList<Songs> songList;

    public AlbumTitle(String nameOfAlbum, String nameOfArtist) {
        this.nameOfAlbum = nameOfAlbum;
        this.nameOfArtist = nameOfArtist;
        this.songList = new ArrayList<Songs>();
    }
    public AlbumTitle(){

    }
    public boolean addSong(String titleOfSong, double duration){
        if(findSong(titleOfSong) == null){
        songList.add(new Songs(titleOfSong, duration));
        System.out.println(titleOfSong + "Successfully added to the list");
        return true;
        }
        else{
        System.out.println("Song with name" + titleOfSong +"already exist in the list");
        return false;
    }
}

    private Songs findSong(String titleOfSong) {
        for(Songs checkedSong : songList){
            if(checkedSong.getTitleOfSong().equals(titleOfSong)) return checkedSong;
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Songs>PlayList){
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songList.size()){
            PlayList.add(this.songList.get(index));
            return true;
        }
        System.out.println("This album does not have song with tracknumber" + trackNumber);
        return false;
    }
    public boolean addToPlayList(String titleOfSong, LinkedList<Songs>PlayList){
        for(Songs checkedSong : this.songList){
          if(checkedSong.getTitleOfSong().equals(titleOfSong)){
              PlayList.add(checkedSong);
              return true;
          }
        }
        System.out.println(titleOfSong + "There is no such song in album");
        return false;
    }
    }