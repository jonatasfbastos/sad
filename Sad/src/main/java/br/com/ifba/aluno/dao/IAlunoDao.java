/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.aluno.dao;

import br.com.ifba.aluno.model.Aluno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pedro Henrique
 */
@Repository
public interface IAlunoDao extends JpaRepository<Aluno, Long>{
    
    public List<Aluno> findByNome(String nome);
    public boolean existsByNome(String nome);
    
}
