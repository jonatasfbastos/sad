/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.infrastructure.service;

import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import br.com.ifba.sad.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author clebinho
 */
public interface IFacade {

     //=====================PerfilUsuario====================//
     public abstract PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario);
     public abstract PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario);
     public abstract void deletePerfilUsuario(PerfilUsuario perfilUsuario);
     public List<PerfilUsuario> getAllPerfilUsuario();
     public PerfilUsuario findByIdPerfilUsuario(Long id);
     
     //=====================Usuario====================//
     public abstract Usuario saveUsuario(Usuario usuario);
     public abstract Usuario updateUsuario(Usuario usuario);
     public abstract void deleteUsuario(Usuario usuario);
     public List<Usuario> getAllUsuario();
     
}
