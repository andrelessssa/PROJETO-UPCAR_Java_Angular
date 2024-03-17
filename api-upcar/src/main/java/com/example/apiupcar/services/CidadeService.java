package com.example.apiupcar.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
        List<CidadeModel> lista = cidadeRepository.findAll();
        return lista;   
    }

    
}
