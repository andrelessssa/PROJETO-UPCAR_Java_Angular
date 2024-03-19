package com.example.apiupcar.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_endereco;

    private String logradouro;
    private int numero;
    private String cep;
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private BairroModel bairroModel;

    
    

    public EnderecoModel() {
    }

    public EnderecoModel(Long id_endereco, String logradouro, int numero, String cep, String complemento,
            BairroModel bairroModel) {
        this.id_endereco = id_endereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.bairroModel = bairroModel;
    }

    public Long getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Long id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public BairroModel getBairroModel() {
        return bairroModel;
    }

    public void setBairroModel(BairroModel bairroModel) {
        this.bairroModel = bairroModel;
    }

    
    

    

}
