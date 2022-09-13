package io.gitgub.helioanacronista.localizacao.domain.repository;

import io.gitgub.helioanacronista.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CidadesReposity extends JpaRepository<Cidade, Long> {

    // busca pela nome correto
    List<Cidade> findByNome(String nome);

    // busca pelo nome Começando por aquele pedaço
    List<Cidade> findByNomeStartingWith(String nome);

    // busca pelo nome Terminando por aquele pedaço
    List<Cidade> findByNomeEndingWith(String nome);

    // busca pelo nome contendo por aquele pedaço
    List<Cidade> findByNomeContaining(String nome);

    List<Cidade> findByHabitantes (Long qtsHabitantes);
}
