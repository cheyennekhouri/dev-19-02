package com.example.dev1902;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProgrammingLanguageControl {
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