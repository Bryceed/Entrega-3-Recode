package com.rydermais.springbootmvc.database;

import com.rydermais.springbootmvc.entity.Contato;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryContato extends JpaRepository<Contato, Long> {
    
}
