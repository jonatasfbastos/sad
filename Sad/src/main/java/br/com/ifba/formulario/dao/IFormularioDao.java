/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.formulario.dao;

import br.com.ifba.formulario.model.Formulario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kaio
 */

@Repository
public interface IFormularioDao extends JpaRepository<Formulario, Long>{
    
    public abstract List<Formulario> findByTitulo(String titulo);
    
}
