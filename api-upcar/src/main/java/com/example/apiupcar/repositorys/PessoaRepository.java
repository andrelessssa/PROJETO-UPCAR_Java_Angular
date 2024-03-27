package com.example.apiupcar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiupcar.models.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
    
}
