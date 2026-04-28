package com.fiap.filmesapi.dto;

import java.time.LocalDate;

public class FilmeRequestDTO {
    private String titulo;
    private String genero;
    private String diretor;
    private LocalDate dataLancamento;
    private Double nota;

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
