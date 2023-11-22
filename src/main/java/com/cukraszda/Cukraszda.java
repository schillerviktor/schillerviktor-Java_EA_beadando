package com.cukraszda;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Cukraszda extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
        FXMLLoader fxmlLoader = new FXMLLoader(Cukraszda.class.getResource("suti.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1500, 600);
        stage.setTitle("Előadás Beadandó 2023, Schiller Viktor - GWOQXX, Ferka Mihály Dávid - V7SYS6 ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}