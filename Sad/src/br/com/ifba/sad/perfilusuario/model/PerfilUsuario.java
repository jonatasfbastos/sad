/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sad.perfilusuario.model;

import br.com.ifba.sad.infrastructure.model.PersistenceEntity;
import br.com.ifba.sad.usuario.model.Usuario;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Gislaine Nunes
 */
@Entity
@Table(name = "perfil_usuario")
public class PerfilUsuario extends PersistenceEntity {
     
     private String nome;
     private String descricao;
     
     @OneToMany(mappedBy = "perfil", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
     private List <Usuario> usuarios;
     
     public PerfilUsuario() {
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getDescricao() {
          return descricao;
     }

     public void setDescricao(String descricao) {
          this.descricao = descricao;
     }

     public List<Usuario> getUsuarios() {
          return usuarios;
     }

     public void setUsuarios(List<Usuario> usuarios) {
          this.usuarios = usuarios;
     }
     
}