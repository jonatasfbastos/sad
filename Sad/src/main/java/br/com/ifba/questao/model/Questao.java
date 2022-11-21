/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.questao.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Lucas
 */

@Entity
@Table(name = "Questao")
@Data
public class Questao extends PersistenceEntity {
    private String enunciado;
    private boolean required;
    @ManyToMany(fetch = FetchType.EAGER)  
    private Resposta resposta;
}
