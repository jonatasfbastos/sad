/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.perfilusuario.model.PerfilUsuario;
import br.com.ifba.pessoa.model.Pessoa;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Pedro Henrique
 */
@Entity
@Table(name = "usuario")
@Data
public class Usuario extends PersistenceEntity implements Serializable {

    private String login;
    private String senha;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PerfilUsuario_ID", referencedColumnName = "ID")
    private PerfilUsuario perfilUsuario;
    @OneToOne(fetch = FetchType.EAGER)
    private Pessoa pessoa;

}