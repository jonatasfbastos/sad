/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.avaliacao.model;

import br.com.ifba.disciplina.model.Disciplina;
import br.com.ifba.formulario.model.Formulario;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
/**
 *
 * @author Felipe
 */
@Entity
@Table(name = "avaliacao")
@Data
public class Avaliacao extends PersistenceEntity implements Serializable{
    
    private String descricao;
    private String dataFim;
    private String datainicio;
    
    //A Avaliação está relacionada a um formulário
    @OneToOne(mappedBy = "Avaliacao", fetch = FetchType.EAGER)   
    private Formulario formulario;    
   
    //A avaliação está relacionada a uma disciplina
    @OneToOne(mappedBy = "Avaliacao" ,fetch = FetchType.EAGER)
    private Disciplina disciplina;
}
