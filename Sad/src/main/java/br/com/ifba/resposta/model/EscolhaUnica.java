/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.resposta.model;

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
@Table(name = "escolha_unica")
@Data
public class EscolhaUnica extends MultiplaEscolha {
    
    // EscolhaUnica possui uma opcao como resposta
    @OneToOne(mappedBy = "escolha", fetch = FetchType.EAGER)
    @JoinColumn(name = "opcao_id", referencedColumnName = "ID")
    private Opcao opcaoSelecionada;
    
}
