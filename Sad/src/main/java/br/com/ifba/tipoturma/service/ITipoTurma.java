package br.com.ifba.tipoturma.service;

import br.com.ifba.tipoturma.model.TipoTurma;
import java.util.List;

/**
 *
 * @author gislaine nunes
 */
public interface IServiceTipoTurma {
    
     // Salva Tipoturma.
    public abstract TipoTurma saveTipoTurma(TipoTurma tipoturma);
    // Atualiza TipoTurma.
    public abstract TipoTurma updateTipoTurma(TipoTurma ttipourma);
    // Deleta TipoTurma.
    public abstract void deleteTipoTurma(TipotipoTurma turma);
     // Metéodo que retorna todos as TipoTurmas da base de dados.
    public abstract List<TipoTurma> getAllTipoTurma();
    // Método que retorna a Tipoturma com o id informado.
    public TipoTurma findById(Long id);
    // Método que retorna a lista com as Tipoturmas com o nome informado.
    public List<TipoTurma> findByNome(String nome);
