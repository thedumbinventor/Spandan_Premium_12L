package com.example.spandan_premium_12l;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LiveView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        scene.getStylesheets().add("com/example/spandan_premium_12l/style.css");
        stage.setTitle("12L Patient Monitor");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }public static void main(String[] args) {
        launch();
    }
}