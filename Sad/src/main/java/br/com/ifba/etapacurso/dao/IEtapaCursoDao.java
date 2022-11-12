/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.etapacurso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.ifba.etapacurso.model.EtapaCurso;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 *
 * @author ph715
 */

@Repository
public interface IEtapaCursoDao extends JpaRepository<EtapaCurso, Long> {
    
    public abstract List<EtapaCurso> findByNome(String nome);
    
}