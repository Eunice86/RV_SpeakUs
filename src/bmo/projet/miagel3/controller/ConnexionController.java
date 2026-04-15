package bmo.projet.miagel3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ConnexionController {

    @FXML
    private Button btnAnnuler;

    @FXML
    private void handleAnnuler(ActionEvent event) {
        Stage stage = (Stage) btnAnnuler.getScene().getWindow();
        Navigation.allerAuMenu(stage);
    }
}
