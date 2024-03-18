package com.example.apiupcar.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiupcar.dtos.BairroDto;
import com.example.apiupcar.models.BairroModel;
import com.example.apiupcar.services.BairroService;


@RestController
@RequestMapping(value = "/bairros")
public class BairroController {

    @Autowired
    private BairroService bairroService;

    @PostMapping
    public ResponseEntity<BairroModel> criar(@RequestBody BairroDto bairroDto){
        BairroModel bairroModel = bairroService.criar(bairroDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(bairroModel);
    }
    @GetMapping
    public ResponseEntity<List<BairroModel>> listar(){
        List<BairroModel> lista = bairroService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BairroModel> pegarPorId(@PathVariable(value = "id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(bairroService.burcarPorId(id));
    }
    



  
}