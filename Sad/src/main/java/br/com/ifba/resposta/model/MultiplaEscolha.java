/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.resposta.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
@Table(name = "multiplaescolha")
@Data
public class MultiplaEscolha extends Resposta implements Serializable{
    
     //MultiplaEscolha possui uma lista de opções
    @ManyToMany(mappedBy = "multiplaescolha", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Opcao> opcao;
}
