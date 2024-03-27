package com.example.apiupcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiupcar.dtos.PessoaDto;
import com.example.apiupcar.models.PessoaModel;
import com.example.apiupcar.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<PessoaModel> criar(@RequestBody PessoaDto pessoaDto){
        PessoaModel pessoaModel = pessoaService.criar(pessoaDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaModel);

    }
    @GetMapping
    public ResponseEntity<List<PessoaModel>> listar(){
        List<PessoaModel> lista = pessoaService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(lista);    
    }

    
    
}
