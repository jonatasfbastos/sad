/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.sad.perfilusuario.model;

import br.com.ifba.sad.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
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
     
}
    

