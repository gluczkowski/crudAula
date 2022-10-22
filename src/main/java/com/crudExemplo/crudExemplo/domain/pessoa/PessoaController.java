package com.crudExemplo.crudExemplo.domain.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @PostMapping("/nova-pessoa")
    public String novaPessoa(@RequestBody PessoaDTO dto){
        pessoaService.novaPessoa(dto);
        return "Pessoa criada com suceso!";
    } 
    
    @GetMapping
    public List<Pessoa> listAll(){        
        List<Pessoa> pessoas = pessoaService.listAll();
        return pessoas;
    }

    @DeleteMapping
    public String apagarPessoa(@RequestBody PessoaDTO dto){
        pessoaService.apagarPessoa(dto);
        return "Pessoa deletada com sucesso";
    }    

    @PatchMapping   
    public String atualizarPessoa(@RequestBody PessoaDTO dto){
        pessoaService.atualizarPessoa(dto);
        return "Pessoa atualizada com sucesso";
    }
}
