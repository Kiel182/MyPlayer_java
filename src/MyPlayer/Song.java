package MyPlayer;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

import java.io.File;
import java.io.IOException;

/**
 * Created by kiel on 29/05/17.
 */
public class Song {
    protected int       id_Track    ;
    protected Album     album       ;
    protected String 	name 	    ;
    protected int  	    duration    ;
    protected int 	    track_Num   ;
    protected File      file        ;

    public int getId_Track() {
        return id_Track;
    }

    public void setId_Track(int id_Track) {
        this.id_Track = id_Track;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTrack_Num() {
        return track_Num;
    }

    public void setTrack_Num(int track_Num) {
        this.track_Num = track_Num;
    }

    public File getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = new File(file);
    }

    public void getMetadata() throws InvalidDataException, IOException, UnsupportedTagException {
        Mp3File mp3 = new Mp3File(this.getFile());

        if (mp3.hasId3v2Tag()) {
            ID3v2 tags = mp3.getId3v2Tag();

            this.setName(tags.getTitle());
            Artist artistTmp = new Artist(tags.getAlbumArtist());

            if (Artist.listArtist.contains(artistTmp)) {

            }
        }
    }
}
