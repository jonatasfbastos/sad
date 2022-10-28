/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.professor.service;

import br.com.ifba.sad.professor.model.Professor;
import java.util.List;

/**
 *
 * @author Pedro Henrique 
 */
public interface IServiceProfessor {
    
    //salva professor
    public abstract Professor saveProfessor(Professor professor);
    
    //atualiza professor
    public abstract Professor updateProfessor(Professor professor);
    
    //deleta professor
    public abstract void deleteProfessor(Professor professor);
    
     // Metodo que retorna todos os professores da base de dados
    public abstract List<Professor> getAllprofessor();
    
    // Método que retorna o professor com o id informado
    public Professor findById(Long id);
    
    // Método que retorna a lista com os professores com o nome informado
    public List<Professor> findByNome(String nome);
}
