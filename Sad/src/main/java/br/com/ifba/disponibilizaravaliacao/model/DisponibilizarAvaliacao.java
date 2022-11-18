/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.disponibilizaravaliacao.model;

import br.com.ifba.disciplina.model.Disciplina;
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
@Table(name = "disponibilizar_avaliacao")
@Data
public class DisponibilizarAvaliacao extends PersistenceEntity implements Serializable{
    
    private String periodo;
    private String dataFim;
    private String datainicio;
    
   //  @OneToOne(/*mappedBy = "DisponibilizarAvaliacao",*/ fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})   
   // private Formulario formulario;
    
   
    @OneToOne(/*mappedBy = "DisponibilizarAvaliacao"*/ fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Disciplina disciplina;
}
