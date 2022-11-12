/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.perfilusuario.service;

import br.com.ifba.perfilusuario.model.PerfilUsuario;
import java.util.List;

/**
 *
 * @author Felipe
 */
public interface IServicePerfilUsuario {
    
     // Salva o PerfilUsuario.
    public abstract PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario);
    // Atualiza o PerfilUsuario.
    public abstract PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario);
    // Deleta o PerfilUsuario.
    public abstract void deletePerfilUsuario(PerfilUsuario perfilUsuario);
     // Método que retorna todos os PerfilUsuario da base de dados.
    public abstract List<PerfilUsuario> getAllPerfilUsuario();
    // Método que retorna o perfilUsuario com o id informado.
    public PerfilUsuario findById(Long id);
    // Método que retorna a lista com os perfilUsuario com o nome informado.
    public List<PerfilUsuario> findByNome(String nome);
        
}
