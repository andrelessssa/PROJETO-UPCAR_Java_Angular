package com.example.apiupcar.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiupcar.dtos.BairroDto;
import com.example.apiupcar.models.BairroModel;
import com.example.apiupcar.models.CidadeModel;
import com.example.apiupcar.repositorys.BairroRepository;
import com.example.apiupcar.repositorys.CidadeRepository;

@Service
public class BairroService {

    @Autowired
    private BairroRepository bairroRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    public BairroModel criar(BairroDto bairroDto) {
        BairroModel bairroModel = new BairroModel();
        BeanUtils.copyProperties(bairroDto, bairroModel);
        CidadeModel cidade = cidadeRepository.findById(bairroModel.getCidadeModel().getId_cidade()).get();
        bairroModel.setCidadeModel(cidade);
        return bairroRepository.save(bairroModel);
    }
    public List<BairroModel> listar(){
        return bairroRepository.findAll(); 
        
    }
    public BairroModel burcarPorId(Long id){
        BairroModel bairroModel = bairroRepository.findById(id).get();
        return bairroModel;
    }


    

}
