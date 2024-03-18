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
@Table(name = "tb_bairro")
public class BairroModel implements Serializable{
    public static final  long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_bairro;

    private String descricao_bairro;
    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private CidadeModel cidadeModel;



    public BairroModel() {
    }
    public BairroModel(Long id_bairro, String descricao_bairro, CidadeModel cidadeModel) {
        this.id_bairro = id_bairro;
        this.descricao_bairro = descricao_bairro;
        this.cidadeModel = cidadeModel;
    }
    public Long getId_bairro() {
        return id_bairro;
    }
    public void setId_bairro(Long id_bairro) {
        this.id_bairro = id_bairro;
    }
    public String getDescricao_bairro() {
        return descricao_bairro;
    }
    public void setDescricao_bairro(String descricao_bairro) {
        this.descricao_bairro = descricao_bairro;
    }
    public CidadeModel getCidadeModel() {
        return cidadeModel;
    }
    public void setCidadeModel(CidadeModel cidadeModel) {
        this.cidadeModel = cidadeModel;
    }

    



    
}
