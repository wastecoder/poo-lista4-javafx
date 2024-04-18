package org.example.poolista3javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Basico extends Application {
    @Override
    public void start(Stage stage) {
        Label txt1 = new Label("Hello World");
        txt1.setAlignment(Pos.CENTER);

        Scene scene = new Scene(txt1, 500, 300);

        stage.setTitle("Titulo da Janela");
//        stage.setWidth(500);
//        stage.setHeight(300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
