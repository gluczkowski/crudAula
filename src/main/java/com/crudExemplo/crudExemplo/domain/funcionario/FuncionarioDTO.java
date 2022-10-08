package com.crudExemplo.crudExemplo.domain.funcionario;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FuncionarioDTO { 

    private Integer id;
    private String descricaoCargo;    
    private BigDecimal salario;
    
}
