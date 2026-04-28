package com.fiap.filmesapi.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private String diretor;

    @Column(nullable = false)
    private LocalDate dataLancamento;

    @Column(nullable = false)
    private Double nota;

    public Filme() {}

    public Filme(String titulo, String genero, String diretor, LocalDate dataLancamento, Double nota) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.dataLancamento = dataLancamento;
        this.nota = nota;
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }
    public LocalDate getDataLancamento() { return dataLancamento; }
    public void setDataLancamento(LocalDate dataLancamento) { this.dataLancamento = dataLancamento; }
    public Double getNota() { return nota; }
    public void setNota(Double nota) { this.nota = nota; }
}
