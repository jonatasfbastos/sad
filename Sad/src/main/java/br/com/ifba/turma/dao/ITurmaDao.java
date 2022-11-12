/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.turma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ifba.turma.model.Turma;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ph715
 */
@Repository
public interface ITurmaDao extends JpaRepository<Turma, Long> {
    
    public abstract List<Turma> findByNome(String nome);
    public boolean existsByNome(String nome);
    
}