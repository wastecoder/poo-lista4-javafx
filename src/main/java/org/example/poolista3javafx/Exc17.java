package org.example.poolista3javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exc17 extends Application {
    @Override
    public void start(Stage stage) {
        Label labelId = new Label("ID:");
        TextField txtFieldId = new TextField();

        Label labelNome = new Label("Nome:");
        TextField txtFieldNome = new TextField();

        Label labelTelefone = new Label("Telefone:");
        TextField txtFieldTelefone = new TextField();

        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");


        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 400, 200);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(20);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(80);
        grid.getColumnConstraints().addAll(col1, col2);


        grid.add(labelId, 0, 0);
        grid.add(txtFieldId, 1, 0);
        grid.add(labelNome, 0, 1);
        grid.add(txtFieldNome, 1, 1);
        grid.add(labelTelefone, 0, 2);
        grid.add(txtFieldTelefone, 1, 2);
        grid.add(btnSalvar, 0, 3);
        grid.add(btnPesquisar, 1, 3);

        stage.setScene(scene);
        stage.setTitle("Agenda de Contatos");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
