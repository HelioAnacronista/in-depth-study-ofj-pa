package io.gitgub.helioanacronista.localizacao.domain.repository;

import io.gitgub.helioanacronista.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CidadesReposity extends JpaRepository<Cidade, Long> {

    // busca pela nome correto
    List<Cidade> findByNome(String nome);

    // Fuciona com base no %'oq qr busca' o % fuciona (puxa dos 2 lados)
    @Query("select c from Cidade c where upper(c.nome) like upper (?1) ")
    List<Cidade> findByNomeLike(String nome);

    // busca pelo nome Começando por aquele pedaço
    List<Cidade> findByNomeStartingWith(String nome);

    // busca pelo nome Terminando por aquele pedaço
    List<Cidade> findByNomeEndingWith(String nome);

    // busca pelo nome contendo por aquele pedaço
    List<Cidade> findByNomeContaining(String nome);

    //Métodos de buscar por numero(quantidade)

    List<Cidade> findByHabitantes (Long qtsHabitantes);

    // Menor que < ( O valor passado na assinatura do método )
    List<Cidade> findByHabitantesLessThan (Long qtsHabitantes);

    // Maior que >
    List<Cidade> findByHabitantesGreaterThan (Long qtsHabitantes);

    //Menor ou igaul <=
    List<Cidade> findByHabitantesLessThanEqual (Long qtsHabitantes);

    // Menor e nome <
    List<Cidade> findByHabitantesLessThanAndNomeLike (Long qtsHabitantes, String nome);
}
