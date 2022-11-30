/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.resposta.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ellen Cristina
 */
@Entity
@Table(name = "opcao")
@Data
public class Opcao extends PersistenceEntity implements Serializable {

    private String descricao;
    //Relação entre as classes Opcao e MultiplaEscolha
    //Várias opções possui uma MultiplaEscolha
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "multipla_escolha_id", referencedColumnName = "ID")
    private MultiplaEscolha multiplaEscolha;
    
    @ManyToMany(fetch = FetchType.LAZY)
    private List<CheckBox> checkBoxes;
    
    @OneToOne(fetch = FetchType.LAZY)
    private EscolhaUnica escolha;
    
}
