/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.questao.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.resposta.model.Resposta;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Lucas
 */
@Entity
@Table(name = "questao")
@Data
public class Questao extends PersistenceEntity implements Serializable {
    
    private String enunciado;
    private boolean required;
    // Uma questão possui uma resposta associada
    @OneToOne(fetch = FetchType.EAGER)  
    private Resposta resposta;
    
}
