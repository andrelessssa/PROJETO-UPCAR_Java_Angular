package com.example.apiupcar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiupcar.dtos.EstadoDto;
import com.example.apiupcar.models.EstadoModel;
import com.example.apiupcar.services.EstadoService;
import java.util.*;

@RestController
@RequestMapping(value = "/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @PostMapping
    public ResponseEntity<EstadoModel> criar(@RequestBody EstadoDto estadoDto ){
        EstadoModel estadoModel = estadoService.criar(estadoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(estadoModel);    
    }
    @GetMapping
    public ResponseEntity<List<EstadoModel>> listar(){
        List<EstadoModel> lista = estadoService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<EstadoModel> buscarPorId(@PathVariable(value = "id") Long  id){
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.buscarPorId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<EstadoModel> atualizar(@PathVariable Long id, @RequestBody EstadoDto estadoDto){
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.atualizar(id, estadoDto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id){
        estadoService.deletar(id);
        return ResponseEntity.status(HttpStatus.OK).body("Estado Deletado!!");
    }

    
    
}
