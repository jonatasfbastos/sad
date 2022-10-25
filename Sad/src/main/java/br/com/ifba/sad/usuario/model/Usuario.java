/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.usuario.model;

import br.com.ifba.sad.infrastructure.model.PersistenceEntity;
import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Pedro Henrique
 */
@Entity
@Table(name = "usuario")
public class Usuario extends PersistenceEntity implements Serializable {

    //variaveis de usuario
    private String nome;
    private String login;
    private String senha;
    @ManyToOne
    @JoinColumn(name = "PerfilUsuario_ID", referencedColumnName = "ID")
    private PerfilUsuario perfilUsuario;

    //getterres e setterres de usuario
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public PerfilUsuario getPerfilusuario() {
        return perfilUsuario;
    }

    public void setPerfilusuario(PerfilUsuario Perfilusuario) {
        this.perfilUsuario = Perfilusuario;
    }

}
