package org.example.poolista3javafx;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class AlunoControl {
    private ObservableList<Aluno> lista = FXCollections.observableArrayList();
    private StringProperty ra = new SimpleStringProperty("");
    private StringProperty nome = new SimpleStringProperty("");
    private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>(LocalDate.now());
    private DoubleProperty media = new SimpleDoubleProperty(0.0);

    public void gravar() {
        Aluno aluno = new Aluno();
        aluno.setRa(ra.get());
        aluno.setNome(nome.get());
        aluno.setNascimento(nascimento.get());
        aluno.setMedia(media.get());

        lista.add(aluno);
        limparCampos();
    }

    public void pesquisar() {
        for (Aluno aluno : lista) {
            if (aluno.getNome().contains(nome.get())) {
                ra.set(aluno.getRa());
                nome.set(aluno.getNome());
                nascimento.set(aluno.getNascimento());
                media.set(aluno.getMedia());
            }
        }
    }

    public void limparCampos() {
        ra.set("");
        nome.set("");
        nascimento.set(LocalDate.now());
        media.set(0.0);
    }

    public ObservableList<Aluno> getLista() {
        return lista;
    }

    public StringProperty raProperty() {
        return ra;
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public ObjectProperty<LocalDate> nascimentoProperty() {
        return nascimento;
    }

    public DoubleProperty mediaProperty() {
        return media;
    }
}
