package com.example.apiupcar.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiupcar.models.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
    
}
