/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.professor.dao;

import br.com.ifba.professor.model.Professor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pedro Henrique
 */
@Repository
public interface IProfessorDao extends JpaRepository<Professor, Long>{
    
    public List<Professor> findByNome(String nome);
    public boolean existsByNome(String nome);
    
}
