package com.example.apiupcar.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiupcar.dtos.PessoaDto;
import com.example.apiupcar.models.PessoaModel;
import com.example.apiupcar.repositorys.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaModel criar(PessoaDto pessoaDto){
        PessoaModel pessoaModel = new PessoaModel();
        BeanUtils.copyProperties(pessoaDto, pessoaModel);
        return pessoaRepository.save(pessoaModel); // Salvando a instância no banco de dados
    }
    public List<PessoaModel> listar(){
        return pessoaRepository.findAll();
    }
    
    
}
