package io.gitgub.helioanacronista.localizacao.service;

import io.gitgub.helioanacronista.localizacao.domain.entity.Cidade;
import io.gitgub.helioanacronista.localizacao.domain.repository.CidadesReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CidadeService {

    private CidadesReposity cidadesReposity;

    public CidadeService(CidadesReposity cidadesReposity){
        this.cidadesReposity = cidadesReposity;
    }

    public void listarCidadePorQuantidadeHabitantes() {
        cidadesReposity.findByHabitantesLessThan(6001L).forEach(System.out::println);
        cidadesReposity.findByHabitantesGreaterThan(50001L).forEach(System.out::println);
        cidadesReposity.findByHabitantesLessThanEqual(2000L).forEach(System.out::println);

        cidadesReposity.findByHabitantesLessThanAndNomeLike(6001L, "P%").forEach(System.out::println);
    }

    public void listarCidadePorNome() {
        cidadesReposity.findByNome("São").forEach(System.out::println);
        cidadesReposity.findByNomeStartingWith("São").forEach(System.out::println);
        cidadesReposity.findByNomeEndingWith("lo").forEach(System.out::println);
        cidadesReposity.findByNomeContaining("u").forEach(System.out::println);

        cidadesReposity.findByNomeLike("%oLo%").forEach(System.out::println);
    }

    public void listarCidadePorHabitantes() {
        cidadesReposity.findByHabitantes(2000L).forEach(System.out::println);
    }

    public void listarCidades(){
        cidadesReposity.findAll().forEach(System.out::println);
    }

    @Transactional
    public void salvarCidade() {
        var cidade = new Cidade(1L, "Porto seguro", 2500L);
        cidadesReposity.save(cidade);
    }
}
