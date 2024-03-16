package com.example.apiupcar.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.apiupcar.dtos.EstadoDto;
import com.example.apiupcar.models.EstadoModel;
import com.example.apiupcar.repositorys.EstadoRepository;
import java.util.*;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    
    public EstadoModel criar(EstadoDto estadoDto){
        EstadoModel estadoModel = new EstadoModel();
        BeanUtils.copyProperties(estadoDto, estadoModel);
        return estadoRepository.save(estadoModel);
    }
    public List<EstadoModel> listar(){
        return estadoRepository.findAll();
    }
    public EstadoModel buscarPorId(Long id){
        EstadoModel estadoModel = estadoRepository.findById(id).get();
        return estadoModel;
    }
    public EstadoModel atualizar(Long id, EstadoDto estadoDto){
        EstadoModel estadoModel = buscarPorId(id);
        BeanUtils.copyProperties(estadoDto, estadoModel);
        return estadoRepository.save(estadoModel);
    }
    public void deletar(Long id){
        estadoRepository.deleteById(id);
    }


    
}
