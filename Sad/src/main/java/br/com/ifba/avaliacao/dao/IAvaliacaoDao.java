/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.avaliacao.dao;

import br.com.ifba.avaliacao.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Felipe
 */
public interface IAvaliacaoDao extends JpaRepository<Avaliacao, Long> {
    
}
