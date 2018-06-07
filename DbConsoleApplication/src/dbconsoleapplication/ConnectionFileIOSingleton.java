package dbconsoleapplication;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFileIOSingleton {

    private static RandomAccessFile productFile = null;
    private static final ConnectionFileIOSingleton INSTANCE = new ConnectionFileIOSingleton();

    private ConnectionFileIOSingleton(){
        try {
            productFile = new RandomAccessFile("product.txt", "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConnectionFileIOSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static RandomAccessFile getFileConnection(){
        return productFile;
    }
}
