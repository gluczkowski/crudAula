package com.crudExemplo.crudExemplo.domain.endereco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "endereco")
public class EnderecoController {
    
    @Autowired
    EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> encontrarTodos(){        
        return enderecoService.encontrarTodos();
    }
}
