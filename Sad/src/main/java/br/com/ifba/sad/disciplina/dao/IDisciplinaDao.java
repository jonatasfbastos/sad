/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.disciplina.dao;

import br.com.ifba.sad.disciplina.model.Disciplina;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pedro Henrique
 */
@Repository
public interface IDisciplinaDao extends JpaRepository<Disciplina, Long>{
    
    List<Disciplina> findByNome(String nome);    
}
