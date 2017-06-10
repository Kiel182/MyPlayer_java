package MyPlayer;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by kiel on 29/05/17.
 */
public class Artist {
    protected int       id_Artist   ;
    protected String    name        ;

    protected static ArrayList<String> listArtist = new ArrayList<String>();

    public Artist(String name) {
        this.name = name;
    }

    public int getId_Artist() {
        return id_Artist;
    }

    public void setId_Artist(int id_Artist) {
        this.id_Artist = id_Artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist searchArtist(String name) {
        if (listArtist.contains(name) {
            return listArtist.indexOf()
        }
    }
}
