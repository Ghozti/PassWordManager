package passwordManager.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
    private String getName(){
        return nameField.getText();
    }

    private String getPassword() {
        return passwordField.getText();
    }
}
