package com.example.apiupcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiupcar.dtos.EnderecoDto;
import com.example.apiupcar.models.EnderecoModel;
import com.example.apiupcar.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<EnderecoModel> criar(@RequestBody EnderecoDto enderecoDto){
        EnderecoModel enderecoModel = enderecoService.criar(enderecoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoModel);
    }
    @GetMapping
    public ResponseEntity<List<EnderecoModel>> listar(){
        List<EnderecoModel> lista = enderecoService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
        
    }
    
}
