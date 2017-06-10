package MyPlayer;

import java.util.ArrayList;

/**
 * Created by kiel on 28/05/17.
 */
public class Album {
    protected int       id_Album    ;
    protected Artist    artist      ;
    protected String    name        ;
    protected int       year        ;
    protected int       numTracks   ;
    protected String    genre       ;
    protected String    cover       ;

    protected static ArrayList<Album> listAlbum = new ArrayList<Album>();

    public Album(Artist artist, String name, int year, int numTracks, String genre) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.numTracks = numTracks;
        this.genre = genre;

        listAlbum.add(this);
    }


    /* ==================================== */
    /*           Getters/Setters            */
    /* ==================================== */
    public int getId_Album() {
        return id_Album;
    }

    public void setId_Album(int id_Album) {
        this.id_Album = id_Album;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
