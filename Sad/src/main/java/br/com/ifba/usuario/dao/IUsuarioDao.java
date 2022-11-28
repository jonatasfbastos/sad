/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.usuario.dao;

import br.com.ifba.usuario.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas Bastos
 */
@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    
    List<Usuario> findByLogin(String login);
    //List<Usuario> findByNome(String nome);
    //public boolean existsByNome(String nome);
    public boolean existsByLogin(String login);
    
}
