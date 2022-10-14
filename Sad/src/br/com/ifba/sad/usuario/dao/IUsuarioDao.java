/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.usuario.dao;

import br.com.ifba.sad.usuario.model.Usuario;
import br.com.ifba.sad.infrastructure.basedao.IBaseDao;

import java.util.List;

/**
 *
 * @author Lucas Bastos
 */
public interface IUsuarioDao extends IBaseDao<Usuario> {
    
    // Interface do DAO do usuário
    
    List<Usuario> findByLogin(String login);
    
}
