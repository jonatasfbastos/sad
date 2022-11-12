/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.model.Curso;
import java.util.List;

/**
 *
 * @author Kaio
 */
public interface IServiceCurso {
    
    //salva o Curso
    public abstract Curso saveCurso(Curso curso);
    
    //atualiza Curso
    public abstract Curso updateCurso(Curso curso);
    
    //deleta Curso
    public abstract void deleteCurso(Curso curso);
    
    // Metodo que retorna todos os Cursos da base de dados
    public abstract List<Curso> getAllCurso();
    
    // Método que retorna o Curso com o id informado
    public Curso findById(Long id);
    
    // Método que retorna a lista com os Cursos com o nome informado
    public List<Curso> findByNome(String nome);
    
}
