package com.fiap.filmesapi.service;

import com.fiap.filmesapi.dto.FilmeRequestDTO;
import com.fiap.filmesapi.dto.FilmeResponseDTO;
import com.fiap.filmesapi.entity.Filme;
import com.fiap.filmesapi.exception.FilmeNotFoundException;
import com.fiap.filmesapi.repository.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmeService {

    private final FilmeRepository repository;

    public FilmeService(FilmeRepository repository) {
        this.repository = repository;
    }

    public List<FilmeResponseDTO> listarTodos() {
        return repository.findAll().stream().map(FilmeResponseDTO::new).collect(Collectors.toList());
    }

    public FilmeResponseDTO buscarPorId(Long id) {
        Filme filme = repository.findById(id).orElseThrow(() -> new FilmeNotFoundException(id));
        return new FilmeResponseDTO(filme);
    }

    public FilmeResponseDTO criar(FilmeRequestDTO dto) {
        Filme filme = new Filme(dto.getTitulo(), dto.getGenero(), dto.getDiretor(), dto.getDataLancamento(), dto.getNota());
        return new FilmeResponseDTO(repository.save(filme));
    }

    public FilmeResponseDTO atualizar(Long id, FilmeRequestDTO dto) {
        Filme filme = repository.findById(id).orElseThrow(() -> new FilmeNotFoundException(id));
        filme.setTitulo(dto.getTitulo());
        filme.setGenero(dto.getGenero());
        filme.setDiretor(dto.getDiretor());
        filme.setDataLancamento(dto.getDataLancamento());
        filme.setNota(dto.getNota());
        return new FilmeResponseDTO(repository.save(filme));
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) throw new FilmeNotFoundException(id);
        repository.deleteById(id);
    }
}
