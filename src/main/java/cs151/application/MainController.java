package cs151.application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label popUp;
    public Label popUp2;


    @FXML
    protected void onHelloButtonClick() {
        popUp.setText("Welcome to KnowledgeTrack Homepage!");
    }
    @FXML
    protected void onNavigateButtonClick() {
        popUp2.setText("Navigating to programming languages...");
    }

}