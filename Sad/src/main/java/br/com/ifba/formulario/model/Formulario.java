/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.formulario.model;

import br.com.ifba.avaliacao.model.Avaliacao;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Kaio
 */

@Entity
@Table(name = "formulario")
@Data
public class Formulario extends PersistenceEntity implements Serializable{
    
    //Variáveis da classe Formulario
    private String titulo;
    private String descricao;
    
    //@OneToMany(mappedBy = "formulario", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    //private List<Sessao> sessao;
    
    @OneToOne(mappedBy = "formulario", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Avaliacao avaliacao;
}

