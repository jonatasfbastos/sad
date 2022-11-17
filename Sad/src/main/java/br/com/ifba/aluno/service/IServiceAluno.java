/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.aluno.service;

import br.com.ifba.aluno.model.Aluno;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public interface IServiceAluno {
    
    // Salva aluno.
    public abstract Aluno saveAluno(Aluno professor);
    // Atualiza aluno.
    public abstract Aluno updateAluno(Aluno professor);
    // Deleta aluno.
    public abstract void deleteAluno(Aluno professor);
     // Método que retorna todos os alunos da base de dados.
    public abstract List<Aluno> getAllaluno();
    // Método que retorna o aluno com o id informado.
    public Aluno findById(Long id);
    // Método que retorna a lista com os alunos com o nome informado.
    public List<Aluno> findByNome(String nome);
    
}
