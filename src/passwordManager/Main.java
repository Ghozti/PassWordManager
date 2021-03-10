package passwordManager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import passwordManager.utils.FileCreator;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FileCreator creator = new FileCreator();
        creator.createFiles();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void changeScene(String title, int w, int h, boolean resize){

    }
}
