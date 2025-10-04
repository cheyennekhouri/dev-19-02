package cs151.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        //displays popup with button to launch app
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Launch KnowledgeTrack App");
        stage.setScene(scene);
        stage.show();


        FXMLLoader fxmlLoader1 = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load(), 320, 240);
        stage.setTitle("Navigate to Programming Languages Tab");
        stage.setScene(scene1);
        stage.show();


    }


    public static void main(String[] args) {
        launch();
    }
}