
import javax.swing.*;
import java.io.File;

/**
 * User: Grooman
 * Date: 26.07.21
 * Time: 14:44
 */
class FileChooser {
    private JFileChooser chooser;

    FileChooser() {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.showOpenDialog(null);
    }
    JFileChooser getf(){
        return chooser;
    }
}
