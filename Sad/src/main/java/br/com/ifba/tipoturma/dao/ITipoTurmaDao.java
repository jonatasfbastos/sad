package br.com.ifba.tipoturma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ifba.tipoturma.model.TipoTurma;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gislaine nunes
 */
@Repository
public interface ITipoTurmaDao extends JpaRepository<TipoTurma, Long> {
    
    public abstract List<TipoTurma> findByNome(String nome);
    public boolean existsByNome(String nome);
    
}