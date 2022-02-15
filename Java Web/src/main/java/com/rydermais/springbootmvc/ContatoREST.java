package com.rydermais.springbootmvc;

import java.util.List;

import com.rydermais.springbootmvc.database.RepositoryContato;
import com.rydermais.springbootmvc.entity.Contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatos")
public class ContatoREST {
    @Autowired
    private RepositoryContato repository;

    @GetMapping
    public List<Contato> listAll() {
        return repository.findAll();
    }
    @PostMapping 
    public void save(@RequestBody Contato contato) {
        repository.save(contato);
    }
    @PutMapping
    public void alterar(@RequestBody Contato contato) {
        if (contato.getId() > 0) {
            repository.save(contato);
        }
    }
    @DeleteMapping
    public void excluir(@RequestBody Contato contato) {
        repository.delete(contato);
    }
}
