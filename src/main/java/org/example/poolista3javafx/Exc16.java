package org.example.poolista3javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Exc16 extends Application {
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


        labelId.relocate(20, 20);
        txtFieldId.relocate(100, 20);

        labelNome.relocate(20, 50);
        txtFieldNome.relocate(100, 50);

        labelTelefone.relocate(20, 80);
        txtFieldTelefone.relocate(100, 80);

        btnSalvar.relocate(50, 120);
        btnPesquisar.relocate(140, 120);


        Pane root = new Pane();
        root.getChildren().addAll(labelId, txtFieldId, labelNome, txtFieldNome, labelTelefone, txtFieldTelefone, btnSalvar, btnPesquisar);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Agenda de Contatos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
