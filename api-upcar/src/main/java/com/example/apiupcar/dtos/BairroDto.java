package com.example.apiupcar.dtos;

import com.example.apiupcar.models.CidadeModel;

public record BairroDto( Long id_bairro, String descricao_bairro, CidadeModel cidadeModel ) {
    
}
