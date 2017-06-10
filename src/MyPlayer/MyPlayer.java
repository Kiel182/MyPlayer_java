/**
 * Created by kiel on 28/05/17.
 */
package MyPlayer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import javax.sound.sampled.*;


/**
 *
 * @author kiel
 */
public class MyPlayer {
    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        DBHelper.connect();


        // Lists all files under the starting directory, needs to do a SELECT on each file
        // (in the "forEach", SELECT on URI, if nothing found, INSERT)
        Files.find(Paths.get("/home/kiel/Music/"),
                Integer.MAX_VALUE,
                (filePath, fileAttr) -> fileAttr.isRegularFile())
                .forEach(System.out::println);

    }

}
