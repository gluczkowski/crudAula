package com.crudExemplo.crudExemplo.domain.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ENDERECO")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Integer id;

    @Column(name = "DS_RUA")
    private String descricaoRua;

    @Column(name = "DS_BAIRRO")
    private String descricaoBairro;

    @Column(name = "NR_NUMERO")
    private String numero;

    @Column(name = "DS_CIDADE")
    private String descricaoCidade;

    @Column(name = "DS_ESTADO")
    private String descricaoEstado;

    @Column(name = "DS_CEP")
    private String descricaoCep;

}
