package cs151.application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MainController {
    @FXML private Label popUp;
    @FXML private Label popUp2;

    @FXML
    protected void onHelloButtonClick() {
        if (popUp != null) popUp.setText("Welcome to KnowledgeTrack Homepage!");
    }

    @FXML
    protected void onNavigateButtonClick(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(
                    FXMLLoader.load(getClass().getResource("/cs151/application/programming_languages.fxml")),
                    640, 420
            );
            stage.setTitle("Define Programming Languages");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goBackToHome(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(
                    FXMLLoader.load(getClass().getResource("/cs151/application/hello-view.fxml")),
                    320, 240
            );
            stage.setTitle("KnowledgeTrack Home");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}