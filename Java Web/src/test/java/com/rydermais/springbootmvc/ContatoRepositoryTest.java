package com.rydermais.springbootmvc;

import com.rydermais.springbootmvc.database.RepositoryContato;
import com.rydermais.springbootmvc.entity.Contato;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ContatoRepositoryTest {
    @Autowired
    private RepositoryContato repository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void whenFindByName_thenReturnContato() {
        // given
        Contato contato = new Contato();
        contato.setNome("Teste");
        contato.setEmail("send@mailto.no.one");
        contato.setTelefone("+55 (11) 99999-9999");
        contato.setUrlAvatar("https://url.com.br/avatar.png");
        entityManager.persist(contato);

        Contato savedContato = repository.save(contato);

        Contato existContato = entityManager.find(Contato.class, savedContato.getId());

        assertThat(existContato.getEmail()).isEqualTo(contato.getEmail());




}
