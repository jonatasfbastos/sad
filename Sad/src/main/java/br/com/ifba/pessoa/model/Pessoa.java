/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.pessoa.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Pedro Henrique
 */

@Getter
@Setter
public abstract class Pessoa extends PersistenceEntity {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private Date nascimento;
}
