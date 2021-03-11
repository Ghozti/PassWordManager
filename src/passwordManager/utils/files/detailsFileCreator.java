package passwordManager.utils.files;

import java.io.File;

public class detailsFileCreator {

    String createSubDir(String name) {
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails/" + name);
        return directory.getAbsolutePath();
    }

    void createDirectory(String name) {
    }

    void createFile(String name, String content) {

    }
}
