package passwordManager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import passwordManager.utils.FileCreator;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FileCreator creator = new FileCreator();
        creator.createFiles();
        Parent root = FXMLLoader.load(getClass().getResource("fxml/logIn.fxml"));
        primaryStage.setTitle("Password Manager Login");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void changeScene(String fxml,String title, int w, int h, boolean resize) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("fxml/" + fxml + ".fxml"));
        stage.setTitle(title);
        stage.setScene(new Scene(root,w,h));
        stage.setResizable(resize);
        stage.centerOnScreen();
        stage.show();
    }
}
