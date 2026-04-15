package bmo.projet.miagel3.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Navigation {
    public static void allerAuMenu(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Navigation.class.getResource("Menu.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            // Appliquer le CSS correctement
            scene.getStylesheets().add(Objects.requireNonNull(
                    Navigation.class.getResource("Style.css")).toExternalForm());

            stage.setScene(scene);
            stage.sizeToScene(); //  Redimensionne la fenêtre à la taille du Menu.fxml
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
