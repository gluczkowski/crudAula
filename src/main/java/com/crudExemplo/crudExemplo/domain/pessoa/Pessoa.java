package com.crudExemplo.crudExemplo.domain.pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.crudExemplo.crudExemplo.domain.endereco.Endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name =  "PESSOA")
public class Pessoa {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PESSOA")
    private Integer id;

    @Column(name = "DS_NOME")
    private String nome;

    @Column(name = "DS_ULTIMO_NOME")
    private String ultimoNome;

    @Column(name = "DS_CPF")
    private String cpf;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;

    @OneToOne()    
    private Endereco endereco;
}
