package com.example.apiupcar.dtos;

import java.time.LocalDate;

public record PessoaDto(String nome, String cpf,LocalDate dataNascimento) {
    
}
