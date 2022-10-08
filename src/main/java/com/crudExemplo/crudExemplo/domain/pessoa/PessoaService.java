package com.crudExemplo.crudExemplo.domain.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudExemplo.crudExemplo.domain.endereco.Endereco;
import com.crudExemplo.crudExemplo.domain.endereco.EnderecoRepository;

@Service
public class PessoaService {
    
    @Autowired
    PessoaRepository repository;

    @Autowired
    EnderecoRepository enderecoRepository;

    public void novaPessoa(PessoaDTO dto){
        Pessoa pessoa = converter(dto);
        repository.save(pessoa);
    }

    private Pessoa converter(PessoaDTO dto){
        //instanciei uma entidade de pessoa
        Pessoa pessoa = new Pessoa();
        //instanciei uma entidade de endereço
        Endereco endereco = new Endereco();

        endereco.setDescricaoBairro(dto.getEndereco().getDescricaoBairro());
        endereco.setDescricaoCep(dto.getEndereco().getDescricaoCep());
        endereco.setDescricaoCidade(dto.getEndereco().getDescricaoCidade());
        endereco.setDescricaoEstado(dto.getEndereco().getDescricaoEstado());
        endereco.setDescricaoRua(dto.getEndereco().getDescricaoRua());
        endereco.setNumero(dto.getEndereco().getNumero());
        enderecoRepository.save(endereco);

        //seta os valores da entidade
        // ternario 
        // faz uma condição e pergunta "?"
        // true : false
        pessoa.setId(dto.getId() != null ? dto.getId() : null);
        pessoa.setNome(dto.getNome());
        pessoa.setUltimoNome(dto.getUltimoNome());
        pessoa.setCpf(dto.getCpf());
        pessoa.setDataNascimento(dto.getDataNascimento());
        pessoa.setEndereco(endereco);

        return pessoa;
    }

    public List<Pessoa> listAll(){
        return repository.findAll();
    }

    public void apagarPessoa(PessoaDTO dto){
        Pessoa pessoa = converter(dto);
        repository.deleteById(pessoa.getId());
    }

}
