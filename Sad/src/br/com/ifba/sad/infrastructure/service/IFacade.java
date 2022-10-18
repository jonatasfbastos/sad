/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.infrastructure.service;

import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
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
     public List<PerfilUsuario> findByNamePerfilUsuario(String nome);
     
}
