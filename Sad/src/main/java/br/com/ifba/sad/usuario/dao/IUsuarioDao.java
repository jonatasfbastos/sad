/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.usuario.dao;

import br.com.ifba.sad.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Bastos
 */
@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    
//    List<Usuario> findByLogin(String login);
//    List<Usuario> findByName(String name);
    
}
