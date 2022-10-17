/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.usuario.model;
import br.com.ifba.sad.infrastructure.model.PersistenceEntity;
import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;

/**
 *
 * @author Pedro Henrique
 */
public class Usuario extends PersistenceEntity{
    //variaveis de usuario
    private String login;
    private String senha;
    private PerfilUsuario perfil;

    //getterres e setterres de usuario
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    
    
}
