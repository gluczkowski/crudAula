package com.crudExemplo.crudExemplo.domain.endereco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    
    @Autowired
    EnderecoRepository enderecoRepository;

    public List<Endereco> encontrarTodos(){
        List<Endereco> enderecos = enderecoRepository.findAll();
        return enderecos;
    }

}
