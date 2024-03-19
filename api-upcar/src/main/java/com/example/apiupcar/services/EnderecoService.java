package com.example.apiupcar.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiupcar.dtos.BairroDto;
import com.example.apiupcar.dtos.EnderecoDto;
import com.example.apiupcar.models.BairroModel;
import com.example.apiupcar.models.EnderecoModel;
import com.example.apiupcar.repositorys.BairroRepository;
import com.example.apiupcar.repositorys.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private BairroRepository BairroRepository;

    public EnderecoModel criar(EnderecoDto enderecoDto){
        EnderecoModel enderecoModel = new EnderecoModel();
        BeanUtils.copyProperties(enderecoDto, enderecoModel);
        BairroModel bairro = BairroRepository.findById(enderecoModel.getBairroModel().getId_bairro()).get();
        enderecoModel.setBairroModel(bairro);
        return  enderecoRepository.save(enderecoModel);
        
    }
    public List<EnderecoModel> listar(){
        return enderecoRepository.findAll();
    }
}
