package com.example.apiupcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiupcar.dtos.CidadeDto;
import com.example.apiupcar.models.CidadeModel;
import com.example.apiupcar.models.EstadoModel;
import com.example.apiupcar.repositorys.EstadoRepository;
import com.example.apiupcar.services.CidadeService;
import com.example.apiupcar.services.EstadoService;


@RestController
@RequestMapping(value = "/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @Autowired
    private EstadoService estadoService;
    

    @PostMapping
    public ResponseEntity<CidadeModel> criar(@RequestBody CidadeDto cidadeDto){
        CidadeModel cidadeModel = cidadeService.criar(cidadeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(cidadeModel );
    }
    @GetMapping
    public ResponseEntity<List<CidadeModel>> listar(){
        List<CidadeModel> lista = cidadeService.listar();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CidadeModel> buscarPorId(@PathVariable(value = "id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.pedarPorId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CidadeModel> atualizar(@PathVariable Long id, @RequestBody CidadeDto cidadeDto){
        return ResponseEntity.status(HttpStatus.OK).body(cidadeService.atualizar(id, cidadeDto));

    }

    

    
    
}
