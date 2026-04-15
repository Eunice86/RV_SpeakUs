package bmo.projet.miagel3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ListeReunionController {
    @FXML
    private Button btnAnnuler;

    @FXML
    private void handleAnnuler(ActionEvent event) {
        Stage stage = (Stage) btnAnnuler.getScene().getWindow();
        Navigation.allerAuMenu(stage);
    }

    @FXML
    private Button btnPlanifier;

    @FXML
    private void handlePlanifier(ActionEvent event){
        Stage stage = (Stage) btnPlanifier.getScene().getWindow();
        SceneManager.switchScene(stage, "PlanifierReunion.fxml", "Style.css", "Programmer une Réunion");
    }
}
