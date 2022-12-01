/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.etapacurso.model;

import br.com.ifba.curso.model.Curso;
import br.com.ifba.disciplina.model.Disciplina;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.matrizcurricular.model.MatrizCurricular;
import br.com.ifba.turma.model.Turma;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Gislaine Nunes
 * 
 */
@Entity
@Table(name = "etapa_curso")
@Data
public class EtapaCurso extends PersistenceEntity implements Serializable {
    
    private String nome;
    private int periodo;
    private boolean concluinte;
    private int cargaHoraria;
    
    //Uma ou mais etapas do curso estão asssociadas a uma matriz
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private MatrizCurricular matrizCurricular; 
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Disciplina disciplina; 
    
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List <Turma> turma; 

}