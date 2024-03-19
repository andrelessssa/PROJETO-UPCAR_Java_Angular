package com.example.apiupcar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiupcar.models.EnderecoModel;

public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long>{
    
}
