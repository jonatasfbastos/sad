/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.resposta.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ellen Cristina
 */
@Entity
@Table(name = "escolhaunica")
@Data
public class EscolhaUnica extends MultiplaEscolha{
    
    //Muita EscolhaUnica possui uma opcao como resposta
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "opcao_ID", referencedColumnName = "ID")
    private Opcao opcao;
    
}
