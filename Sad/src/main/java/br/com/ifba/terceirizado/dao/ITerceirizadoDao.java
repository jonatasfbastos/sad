/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.terceirizado.dao;

import br.com.ifba.terceirizado.model.Terceirizado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leonam
 */
@Repository
public interface ITerceirizadoDao extends JpaRepository<Terceirizado, Long> {
    
    public List<Terceirizado> findByNome(String nome);
    public boolean existsByNome(String nome);
}
