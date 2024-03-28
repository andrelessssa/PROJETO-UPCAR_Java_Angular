package com.example.apiupcar.models;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class ClienteModel implements Serializable {
    public static final  long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_cliente;

    @OneToOne
    @JoinColumn(name = "id_pessoa")
    private PessoaModel pessoaModel;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private EnderecoModel enderecoModel;



    
}
