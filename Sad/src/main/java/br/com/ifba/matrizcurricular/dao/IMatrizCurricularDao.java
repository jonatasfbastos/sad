/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.matrizcurricular.dao;

import br.com.ifba.matrizcurricular.model.MatrizCurricular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author João P. Arquim
 */
public interface IMatrizCurricularDao extends JpaRepository<MatrizCurricular, Long>{
    
    public List<MatrizCurricular> findByNome(String nome);
    public boolean existsByNome(String nome);
}
