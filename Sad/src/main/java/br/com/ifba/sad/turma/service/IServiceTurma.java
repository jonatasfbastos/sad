/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.turma.service;

import br.com.ifba.sad.turma.model.Turma;
import java.util.List;

/**
 *
 * @author Jonas Dias
 */
public interface IServiceTurma {
    
     // Salva Turma
    public abstract Turma saveTurma(Turma turma);
    // Atualiza Turma
    public abstract Turma updateTurma(Turma turma);
    // Deleta Turma
    public abstract void deleteTurma(Turma turma);
     // Metéodo que retorna todos as Turmas da base de dados
    public abstract List<Turma> getAllTurma();
    // Método que retorna a turma com o id informado
    public Turma findById(Long id);
    // Método que retorna a lista com as turmas com o nome informado
    public List<Turma> findByNome(String nome);

}
