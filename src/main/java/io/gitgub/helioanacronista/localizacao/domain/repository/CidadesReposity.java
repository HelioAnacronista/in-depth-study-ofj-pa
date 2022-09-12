package io.gitgub.helioanacronista.localizacao.domain.repository;

import io.gitgub.helioanacronista.localizacao.domain.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CidadesReposity extends JpaRepository<Cidade, Long> {


}
