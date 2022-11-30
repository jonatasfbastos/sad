/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.resposta.dao;

import br.com.ifba.resposta.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ellen Cristina
 */
@Repository
public interface IRespostaDao extends JpaRepository<Resposta, Long> {
    
}
