package com.crudExemplo.crudExemplo.domain.endereco;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EnderecoDTO {

    private Integer id;    
    private String descricaoRua;    
    private String descricaoBairro;    
    private String numero;    
    private String descricaoCidade;    
    private String descricaoEstado;    
    private String descricaoCep;

}


