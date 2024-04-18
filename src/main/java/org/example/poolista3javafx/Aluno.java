package org.example.poolista3javafx;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private String ra;
    private LocalDate nascimento;
    private double media;

    public Aluno() {
    }

    public Aluno(String nome, String ra, LocalDate nascimento, double media) {
        this.nome = nome;
        this.ra = ra;
        this.nascimento = nascimento;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
