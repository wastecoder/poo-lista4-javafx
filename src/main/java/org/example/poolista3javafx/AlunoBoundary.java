package org.example.poolista3javafx;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

import java.time.LocalDate;

public class AlunoBoundary extends Application {
    private AlunoControl control = new AlunoControl();

    @Override
    public void start(Stage stage) {
        BorderPane border = new BorderPane();
        Scene scene = new Scene(border, 500, 300);

        TextField txtRa = new TextField("");
        TextField txtNome = new TextField("");
        DatePicker dpNascimento = new DatePicker(LocalDate.now());
        TextField txtMedia = new TextField("0.0");

        Button btnGravar = new Button("Gravar");
        Button btnPesquisar = new Button("Pesquisar");

        GridPane grid = new GridPane();
        grid.add(new Label("RA:"), 0, 0);
        grid.add(txtRa, 1, 0);
        grid.add(new Label("Nome:"), 0, 1);
        grid.add(txtNome, 1, 1);
        grid.add(new Label("Nascimento:"), 0, 2);
        grid.add(dpNascimento, 1, 2);
        grid.add(new Label("Media:"), 0, 3);
        grid.add(txtMedia, 1, 3);
        grid.add(btnGravar, 0, 4);
        grid.add(btnPesquisar, 1, 4);

        //Conecta os atributos do AlunoBoundary ao AlunoControl
        StringConverter<Number> numberConverter = new NumberStringConverter();
        Bindings.bindBidirectional(txtRa.textProperty(), control.raProperty());
        Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
        Bindings.bindBidirectional(dpNascimento.valueProperty(), control.nascimentoProperty());
        Bindings.bindBidirectional(txtMedia.textProperty(), control.mediaProperty(), numberConverter);

        //Acoes dos botoes
        btnGravar.setOnAction(e -> control.gravar());
        btnPesquisar.setOnAction(e -> control.pesquisar());

        border.setTop(grid);
        stage.setScene(scene);
        stage.setTitle("Gestao de Alunos");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
