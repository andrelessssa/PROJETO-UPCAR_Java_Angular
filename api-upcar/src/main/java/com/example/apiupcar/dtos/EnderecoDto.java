package com.example.apiupcar.dtos;

import com.example.apiupcar.models.BairroModel;

public record EnderecoDto(Long id, BairroModel bairroModel,String logradouro,int numero,String cep,String complemento){

}