package bmo.projet.miagel3.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private static Connection databaseLink;
    private static final String DATABASE_NAME = "speakus";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost/" + DATABASE_NAME + "?serverTimezone=UTC";

    // Méthode pour obtenir une connexion unique
    public static Connection getConnection() {
        try {
            if (databaseLink == null || databaseLink.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                databaseLink = DriverManager.getConnection(URL, DATABASE_USER, DATABASE_PASSWORD);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC introuvable !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Erreur de connexion à la base de données !");
            e.printStackTrace();
        }
        return databaseLink;
    }

    // Fermer la connexion proprement
    public static void closeConnection() {
        if (databaseLink != null) {
            try {
                databaseLink.close();
                databaseLink = null;
            } catch (SQLException e) {
                System.err.println("Erreur lors de la fermeture de la connexion !");
                e.printStackTrace();
            }
        }
    }
}
