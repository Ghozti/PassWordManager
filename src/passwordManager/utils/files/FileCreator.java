package passwordManager.utils.files;

import java.io.*;

public class FileCreator {

    public void createFiles() throws IOException {
        String dir = createDirectory();
        createName(dir);
        createPassword(dir);
    }

    private String createDirectory(){
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails");
        if (!directory.exists()) {
            directory.mkdir();
        }
        return directory.getAbsolutePath();
    }


    private void createName(String path) throws IOException {
        File directory = new File((path + "/name.txt"));
        if (!directory.exists()) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directory), "utf-8"))) {
                writer.write("user");
            }
        }
    }


    private void createPassword(String path) throws IOException {
        File directory = new File((path + "/password.txt"));
        if (!directory.exists()) {
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directory), "utf-8"))) {
                writer.write("123");
            }
        }
    }
}
