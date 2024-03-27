package com.example.apiupcar.models;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_pessoa")
public class PessoaModel implements Serializable{
    public static final  long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id_pessoa;

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;



    
    public PessoaModel() {
    }
    public PessoaModel(Long id_pessoa, String nome, String cpf, LocalDate dataNascimento) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    public Long getId_pessoa() {
        return id_pessoa;
    }
    public void setId_pessoa(Long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }




    

    

    


    
}
