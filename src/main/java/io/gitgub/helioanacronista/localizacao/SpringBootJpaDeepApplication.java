package io.gitgub.helioanacronista.localizacao;

import io.gitgub.helioanacronista.localizacao.domain.entity.Cidade;
import io.gitgub.helioanacronista.localizacao.domain.repository.CidadesReposity;
import io.gitgub.helioanacronista.localizacao.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import java.lang.Long;

@SpringBootApplication
public class SpringBootJpaDeepApplication implements CommandLineRunner {

    @Autowired
    private CidadeService cidadeService;

    @Override
    public void run(String... args) throws Exception {
        var cidade = new Cidade(1L, "Salvador", 100L);
        //cidadeService.filtroDinamico(cidade).forEach(System.out::println);

        //cidadeService.listarCidadeByNomeSpec();

        //cidadeService.listaCidadeSpecsFiltroDinamico(cidade);

        cidadeService.listarCidadePorNomeSQL();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaDeepApplication.class, args);
    }

}
