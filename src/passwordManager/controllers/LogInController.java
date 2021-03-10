package passwordManager.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LogInController {

    //name text field found on the logIn UI
    @FXML
    private TextField nameField = new TextField();

    //password text field found on the logIn UI
    @FXML
    private PasswordField passwordField = new PasswordField();

    //once the logIn button id clicked this method will be called
    public void logIn(ActionEvent actionEvent) {
    }


    /** gets the text from the nameField and passwordField fxml fields**/
    private String getNameField(){
        return nameField.getText();
    }

    private String getPasswordField() {
        return passwordField.getText();
    }

    public String getName() throws IOException{
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails/name.txt").getAbsoluteFile();
        String content;
        content = new String(Files.readAllBytes(Paths.get(String.valueOf(directory))));
        return content;
    }

    public String getPass() throws IOException, IOException {
        File directory = new File(System.getProperty("user.home") + "/PasswordManagerDetails/password.txt").getAbsoluteFile();
        String content;
        content = new String(Files.readAllBytes(Paths.get(String.valueOf(directory))));
        return content;
    }
}
