package bmo.projet.miagel3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class AcceuilController {

    @FXML
    public void handleConnexion(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager.switchScene(stage, "Connexion.fxml", "Style.css", "Connexion");
    }

    @FXML
    public void handleInscription(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager.switchScene(stage, "formulaireInscription.fxml", "Style.css", "Inscription");
    }

    @FXML
    public void handleParticiper(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager.switchScene(stage, "ParticiperReunion.fxml", "Style.css", "Menu");
    }

    @FXML
    public void handleMenu(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager.switchScene(stage, "Menu.fxml", "Style.css", "Menu");
    }

    @FXML
    public void handleConsulter(ActionEvent actionEvent){
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager.switchScene(stage, "ListeReunion.fxml", "Style.css", "Consulter l'écran");
    }

    @FXML
    public void handleEntrer(ActionEvent actionEvent){
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager.switchScene(stage, "ListeReunion.fxml", "Style.css", "Participer à la Réunion");
    }

    @FXML
    public void handlePlanifier(ActionEvent actionEvent){
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager.switchScene(stage, "PlanifierReunion.fxml", "Style.css", "Programmer une Réunion");
    }

    @FXML
    public void handleDeconnexion(ActionEvent actionEvent){
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        SceneManager.switchScene(stage, "Connexion.fxml", "Style.css", "Se connecter a SpeakUS");
    }
}
