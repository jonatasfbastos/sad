/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.usuario.service;
import br.com.ifba.sad.usuario.model.Usuario;
import java.util.List;
/**
 *
 * @author Pedro Henrique
 */
public interface IServiceUsuario {
    
    //salva o usuario
    public abstract Usuario saveUsuario(Usuario usuario);
    //deleta usuario
    public abstract void deleteUsuario(Usuario usuario);
    //atualiza o usuario
    public abstract Usuario updateUsuario(Usuario usuario);
    // Metodo que retorna todos os usuarios da base de dados
    public abstract List<Usuario> getAllUsuario();
    // procura o usuario por nome
    public List<Usuario> findByLogin(String name);
    // Procura usuário por nome
    public List<Usuario> findByName(String name);
}
