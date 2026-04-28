package com.fiap.filmesapi.exception;

public class FilmeNotFoundException extends RuntimeException {
    public FilmeNotFoundException(Long id) {
        super("Filme não encontrado com id: " + id);
    }
}
