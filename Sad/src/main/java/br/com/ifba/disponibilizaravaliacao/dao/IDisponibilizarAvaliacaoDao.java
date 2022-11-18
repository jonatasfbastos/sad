/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.disponibilizaravaliacao.dao;

import br.com.ifba.disponibilizaravaliacao.model.DisponibilizarAvaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Felipe
 */
public interface IDisponibilizarAvaliacaoDao extends JpaRepository<DisponibilizarAvaliacao, Long> {
    
}
