package bmo.projet.miagel3.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {

    public static void switchScene(Stage stage, String fxmlFile, String cssFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(SceneManager.class.getResource(fxmlFile));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            scene.getStylesheets().add(SceneManager.class.getResource(cssFile).toExternalForm());

            stage.setTitle(title);
            stage.setScene(scene);

            // Dimensions par défaut
            if (fxmlFile.equals("formulaireInscription.fxml")) {
                stage.setWidth(650);
                stage.setHeight(550);
            } else if (fxmlFile.equals("Connexion.fxml")) {
                stage.setWidth(300);
                stage.setHeight(450);
            } else if (fxmlFile.equals("Menu.fxml")) {
                stage.setWidth(700);
                stage.setHeight(500);
            } else if (fxmlFile.equals("ListeReunion.fxml")) {
                stage.setWidth(600);
                stage.setHeight(400);

            } else if (fxmlFile.equals("PlanifierRéunion.fxml")) {
                stage.setWidth(700);
                stage.setHeight(800);
            }
            else if (fxmlFile.equals("ParticiperReunion.fxml")) {
                stage.setWidth(600);
                stage.setHeight(500);

                stage.centerOnScreen();
                stage.show();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
