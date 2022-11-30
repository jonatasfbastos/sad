/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.resposta.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ellen Cristina
 */
@Entity
@Table(name = "checkbox")
@Data
public class CheckBox extends MultiplaEscolha {
    
    //CheckBox possui uma lista de opções para resposta
    @ManyToMany(mappedBy = "checkBoxes", fetch = FetchType.LAZY)
    private List<Opcao> opcoesSelecionada;
    
}
