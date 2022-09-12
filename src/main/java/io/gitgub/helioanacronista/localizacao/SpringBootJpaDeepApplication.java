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
        salvarCidade();
        listarCidades();
    }

    @Transactional
    void salvarCidade() {
        var cidade = new Cidade(1L, "Petrolina", 343865L );
        cidadesReposity.save(cidade);
    }


    void listarCidades(){
        cidadesReposity.findAll().forEach(System.out::println);
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaDeepApplication.class, args);
    }

}
