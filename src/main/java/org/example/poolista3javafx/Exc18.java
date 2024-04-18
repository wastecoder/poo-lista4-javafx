package org.example.poolista3javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exc18 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20)); //Margem nas bordas
        grid.setHgap(10);
        grid.setVgap(10);

        //Linha 0: resultado
        TextField txtResultado = new TextField();
        txtResultado.setEditable(false);
        grid.add(txtResultado, 0, 0, 4, 1);

        //Linha 1: 1 2 3 +
        grid.add(new Button("1"), 0, 1);
        grid.add(new Button("2"), 1, 1);
        grid.add(new Button("3"), 2, 1);
        grid.add(new Button("+"), 3, 1);

        //Linha 2: 4 5 6 -
        grid.add(new Button("4"), 0, 2);
        grid.add(new Button("5"), 1, 2);
        grid.add(new Button("6"), 2, 2);
        grid.add(new Button("-"), 3, 2);

        //Linha 3: 7 8 9 *
        grid.add(new Button("7"), 0, 3);
        grid.add(new Button("8"), 1, 3);
        grid.add(new Button("9"), 2, 3);
        grid.add(new Button("*"), 3, 3);

        //Linha 4: . 0 = /
        grid.add(new Button("."), 0, 4);
        grid.add(new Button("0"), 1, 4);
        grid.add(new Button("="), 2, 4);
        grid.add(new Button("/"), 3, 4);

        //Aumentando tamanho do texto dos botões
        grid.getChildren().forEach(node -> {
            if (node instanceof Button) {
                node.setStyle("-fx-font-size: 20px;");
            }
        });


        Scene scene = new Scene(grid, 230, 280);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
