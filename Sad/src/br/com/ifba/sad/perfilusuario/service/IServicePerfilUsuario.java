/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.perfilusuario.service;

import java.util.List;

/**
 *
 * @author Felipe
 */
public interface IServicePerfilUsuario {
     //salva o PerfilUsuario
    public abstract PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario);
    //atualiza PerfilUsuario
    public abstract PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario);
    //deleta PerfilUsuario
    public abstract void deletePerfilUsuario(PerfilUsuario perfilUsuario);
     // Metodo que retorna todos os PerfilUsuario da base de dados
    public abstract List<PerfilUsuario> getAllPerfilUsuario();
    
    public List<PerfilUsuario> findByName(String name);
}
