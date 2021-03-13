package passwordManager.utils.files;

import java.io.*;

public class DetailsFileManager {

    public String createSubDir(String name) {
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails/" + name);
        if (!directory.exists()) {
            directory.mkdir();
        }
        return directory.getAbsolutePath();
    }

    public String createAccountDir(String path, String name) {
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails/" + path + "/" + name + "/");
        if (!directory.exists()) {
            directory.mkdir();
        }
        return directory.getAbsolutePath();
    }

    public void createFile(String path, String name, String content) {
        File directory = new File((path + "/" + name + ".txt"));
        if (!directory.exists()) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directory), "utf-8"))) {
                writer.write("");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
