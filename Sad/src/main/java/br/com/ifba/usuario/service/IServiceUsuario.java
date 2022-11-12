/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.usuario.service;

import br.com.ifba.usuario.model.Usuario;
import java.util.List;
/**
 *
 * @author Pedro Henrique
 */
public interface IServiceUsuario {
    
    // Salva o usuário.
    public abstract Usuario saveUsuario(Usuario usuario);
    // Deleta usuário.
    public abstract void deleteUsuario(Usuario usuario);
    // Atualiza o usuario.
    public abstract Usuario updateUsuario(Usuario usuario);
    // Método que retorna todos os usuários da base de dados.
    public abstract List<Usuario> getAllUsuario();
    // Busca o usuário por login.
    public List<Usuario> findByLogin(String login);
    // Busca usuário por nome.
    public List<Usuario> findByNome(String nome);
    
}
