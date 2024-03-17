package com.example.apiupcar.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cidade")
public class CidadeModel implements Serializable{
    public static final  long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cidade;

    private String descricaoCidade;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private EstadoModel estadoModel;


    

    public CidadeModel() {
    }

    public CidadeModel(Long id_cidade, String descricaoCidade, EstadoModel estadoModel) {
        this.id_cidade = id_cidade;
        this.descricaoCidade = descricaoCidade;
        this.estadoModel = estadoModel;
    }

    public Long getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(Long id_cidade) {
        this.id_cidade = id_cidade;
    }

    public String getDescricaoCidade() {
        return descricaoCidade;
    }

    public void setDescricaoCidade(String descricaoCidade) {
        this.descricaoCidade = descricaoCidade;
    }

    public EstadoModel getEstadoModel() {
        return estadoModel;
    }

    public void setEstadoModel(EstadoModel estadoModel) {
        this.estadoModel = estadoModel;
    }

    public void setEstado(EstadoModel estado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEstado'");
    }


    
    
}
