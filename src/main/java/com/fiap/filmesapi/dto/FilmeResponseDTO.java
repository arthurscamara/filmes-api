package com.fiap.filmesapi.dto;

import com.fiap.filmesapi.entity.Filme;
import java.time.LocalDate;

public class FilmeResponseDTO {
    private Long id;
    private String titulo;
    private String genero;
    private String diretor;
    private LocalDate dataLancamento;
    private Double nota;

    public FilmeResponseDTO(Filme f) {
        this.id = f.getId();
        this.titulo = f.getTitulo();
        this.genero = f.getGenero();
        this.diretor = f.getDiretor();
        this.dataLancamento = f.getDataLancamento();
        this.nota = f.getNota();
    }

    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public String getDiretor() { return diretor; }
    public LocalDate getDataLancamento() { return dataLancamento; }
    public Double getNota() { return nota; }
}
