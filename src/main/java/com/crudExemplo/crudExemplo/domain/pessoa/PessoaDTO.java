package com.crudExemplo.crudExemplo.domain.pessoa;

import java.time.LocalDate;

import com.crudExemplo.crudExemplo.domain.endereco.Endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    
    private Integer id;   
   
    private String nome;    
    private String ultimoNome;    
    private String cpf;    
    private LocalDate dataNascimento;    
    private Endereco endereco;

}
