/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.resposta.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.questao.model.Questao;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ellen Cristina
 */
@Entity
@Table(name = "resposta")
@Data
public abstract class Resposta extends PersistenceEntity{
    
    //Cada resposta possui uma questão associada
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "questao_ID", referencedColumnName = "ID")
    private Questao questao;
    
}
