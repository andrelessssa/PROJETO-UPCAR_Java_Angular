package com.example.apiupcar.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_estado")
public class EstadoModel implements Serializable{
    public static final long  serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_estado;

    private String descricao_estado;
    private String sigla;

    
    
    

    public EstadoModel() {
    }

    public EstadoModel(Long id_estado, String descricao_estado, String sigla) {
        this.id_estado = id_estado;
        this.descricao_estado = descricao_estado;
        this.sigla = sigla;
    }

    /**
     * @return Long return the id_estado
     */
    public Long getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(Long id_estado) {
        this.id_estado = id_estado;
    }

    /**
     * @return String return the descricao_estado
     */
    public String getDescricao_estado() {
        return descricao_estado;
    }

    /**
     * @param descricao_estado the descricao_estado to set
     */
    public void setDescricao_estado(String descricao_estado) {
        this.descricao_estado = descricao_estado;
    }

    /**
     * @return String return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}
