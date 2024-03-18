package com.example.apiupcar.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.apiupcar.dtos.CidadeDto;
import com.example.apiupcar.models.CidadeModel;
import com.example.apiupcar.models.EstadoModel;
import com.example.apiupcar.repositorys.CidadeRepository;
import com.example.apiupcar.repositorys.EstadoRepository;


@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired 
    private EstadoRepository estadoRepository;
   


    public CidadeModel criar( CidadeDto cidadeDto){
        CidadeModel cidadeModel = new CidadeModel();
        BeanUtils.copyProperties(cidadeDto, cidadeModel);
        EstadoModel estado =  estadoRepository.findById(cidadeModel.getEstadoModel().getId_estado()).get();
        cidadeModel.setEstadoModel(estado); 
        return cidadeRepository.save(cidadeModel);
    }
    public List<CidadeModel> listar(){
        return cidadeRepository.findAll();   
    }
    public CidadeModel pedarPorId(Long id){
        CidadeModel cidadeModel = cidadeRepository.findById(id).get();
        return cidadeModel;
    }
    public CidadeModel atualizar(Long id, CidadeDto cidadeDto){
        CidadeModel cidadeModel = pedarPorId(id);
        BeanUtils.copyProperties(cidadeDto, cidadeModel,"id_cidade");
        EstadoModel estado = estadoRepository.findById(cidadeModel.getEstadoModel().getId_estado()).get();
        cidadeModel.setEstadoModel(estado);
        return cidadeRepository.save(cidadeModel);
    }
    public void remover(Long id){
        cidadeRepository.deleteById(id);
    }

    
}
