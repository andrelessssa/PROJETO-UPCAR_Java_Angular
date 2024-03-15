package com.example.apiupcar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiupcar.models.EstadoModel;


public interface EstadoRepository extends JpaRepository <EstadoModel, Long> {
    
}
