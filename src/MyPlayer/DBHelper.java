package MyPlayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DBHelper {
    /**
     * Connect to a sample database
     */

    public static void connect() {
        // db parameters
        String url = "jdbc:sqlite:/home/kiel/.sqlite/db/mplayer.db";

        String createArtist =
                "CREATE TABLE IF NOT EXISTS Artist (\n" +
                        "ID_Artist integer PRIMARY KEY AUTOINCREMENT,\n" +
                        "name text NOT NULL\n" +
                        ");";

        String createAlbum =
                "CREATE TABLE IF NOT EXISTS Album (\n" +
                        "ID_Album integer PRIMARY KEY AUTOINCREMENT,\n" +
                        "ID_Artist integer NOT NULL,\n" +
                        "Name text NOT NULL,\n" +
                        "Year int,\n" +
                        "NumTracks int,\n" +
                        "Genre text,\n" +
                        "Cover text,\n" +
                        "FOREIGN KEY(ID_Artist) REFERENCES Artist(ID_Artist)" +
                        ");";

        String createSong =
                "CREATE TABLE IF NOT EXISTS Song (\n" +
                        "ID_Song integer PRIMARY KEY AUTOINCREMENT,\n" +
                        "ID_Album integer NOT NULL,\n" +
                        "Name text NOT NULL,\n" +
                        "Duration int NOT NULL,\n" +
                        "Track_Num int,\n" +
                        "URI text NOT NULL,\n" +
                        "Format text NOT NULL,\n" +
                        "FOREIGN KEY(ID_Album) REFERENCES Album(ID_Album)\n" +
                        ");";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(createArtist);
            stmt.execute(createAlbum);
            stmt.execute(createSong);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
