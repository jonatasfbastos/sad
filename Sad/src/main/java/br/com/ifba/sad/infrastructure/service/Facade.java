/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.infrastructure.service;

import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import br.com.ifba.sad.perfilusuario.service.IServicePerfilUsuario;
import br.com.ifba.sad.perfilusuario.service.ServicePerfilUsuario;
import br.com.ifba.sad.usuario.model.Usuario;
import br.com.ifba.sad.usuario.service.IServiceUsuario;
import br.com.ifba.sad.usuario.service.ServiceUsuario;
import java.util.List;

/**
 *
 * @author clebinho
 */
public class Facade implements IFacade {

     //=====================PerfilUsuario====================//
     private final IServicePerfilUsuario servicePerfilUsuario = new ServicePerfilUsuario();
     @Override
     public PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario) {
          return servicePerfilUsuario.savePerfilUsuario(perfilUsuario);
     }

     @Override
     public PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario) {
          return servicePerfilUsuario.updatePerfilUsuario(perfilUsuario);
     }

     @Override
     public void deletePerfilUsuario(PerfilUsuario perfilUsuario) {
          servicePerfilUsuario.deletePerfilUsuario(perfilUsuario);
     }

     @Override
     public List<PerfilUsuario> getAllPerfilUsuario() {
          return servicePerfilUsuario.getAllPerfilUsuario();
     }

     @Override
     public List<PerfilUsuario> findByNamePerfilUsuario(String nome) {
          return servicePerfilUsuario.findByName(nome);
     }
     
      @Override
     public PerfilUsuario findByIdPerfilUsuario(Long id) {
          return servicePerfilUsuario.findById(id);
     }
     
     //=====================Usuario====================//
     private final IServiceUsuario serviceUsuario = new ServiceUsuario();

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return serviceUsuario.saveUsuario(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return serviceUsuario.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        serviceUsuario.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return serviceUsuario.getAllUsuario();
    }

    @Override
    public List<Usuario> findByLogin(String login) {
        return serviceUsuario.findByLogin(login);
    }
    
    @Override
    public List<Usuario> findByName(String name) {
        return serviceUsuario.findByName(name);
    }
        
     
     
    
}
