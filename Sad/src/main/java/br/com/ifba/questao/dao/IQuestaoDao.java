/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.questao.dao;

import java.util.List;
//import br.com.ifba.questao.model.Questao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author clebinho
 */
public interface IQuestaoDao extends JpaRepository<Questao, Long>{
    
    public abstract List<Questao> findByEnunciado(String enunciado);
}
