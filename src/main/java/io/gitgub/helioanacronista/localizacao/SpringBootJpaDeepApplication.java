package io.gitgub.helioanacronista.localizacao;

import io.gitgub.helioanacronista.localizacao.domain.entity.Cidade;
import io.gitgub.helioanacronista.localizacao.domain.repository.CidadesReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import java.lang.Long;

@SpringBootApplication
public class SpringBootJpaDeepApplication implements CommandLineRunner {

    @Autowired
    private CidadesReposity cidadesReposity;

    @Override
    public void run(String... args) throws Exception {

        listarCidadePorNome();

    }

    void listarCidadePorNome() {
        cidadesReposity.findByNome("São").forEach(System.out::println);
        cidadesReposity.findByNomeStartingWith("São").forEach(System.out::println);
        cidadesReposity.findByNomeEndingWith("lo").forEach(System.out::println);
        cidadesReposity.findByNomeContaining("u").forEach(System.out::println);

        cidadesReposity.findByNomeLike("%oLo%").forEach(System.out::println);
    }

    void listarCidadePorHabitantes() {
        cidadesReposity.findByHabitantes(2000L).forEach(System.out::println);
    }

    void listarCidades(){
        cidadesReposity.findAll().forEach(System.out::println);
   }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaDeepApplication.class, args);
    }

}
