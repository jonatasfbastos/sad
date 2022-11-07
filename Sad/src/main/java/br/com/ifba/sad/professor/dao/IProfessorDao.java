/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.professor.dao;

import br.com.ifba.sad.professor.model.Professor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pedro Henrique
 */
@Repository
public interface IProfessorDao extends JpaRepository<Professor, Long>{
    
    List<Professor> findByNome(String nome);
}
