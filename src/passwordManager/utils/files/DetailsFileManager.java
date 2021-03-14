package passwordManager.utils.files;

import java.io.*;

public class DetailsFileManager extends FileCreator{

    public void createAccountDir(String name) {
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails" + name + "/");
    }

    public void createFile(String dirName) {
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails" + "/" + dirName);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public void saveFile(String dirName, String fileName, String content){
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails" + dirName + "/" + fileName);
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directory), "utf-8"))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
