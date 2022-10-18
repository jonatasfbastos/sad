/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.infrastructure.service;

import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import br.com.ifba.sad.perfilusuario.service.IServicePerfilUsuario;
import br.com.ifba.sad.perfilusuario.service.ServicePerfilUsuario;
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
    
}
