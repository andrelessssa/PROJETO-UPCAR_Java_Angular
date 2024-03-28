package com.example.apiupcar.dtos;

import com.example.apiupcar.models.EnderecoModel;
import com.example.apiupcar.models.PessoaModel;

public record ClienteDto(Long id_cliente,PessoaModel pessoaModel,EnderecoModel enderecoModel) {
    
}
