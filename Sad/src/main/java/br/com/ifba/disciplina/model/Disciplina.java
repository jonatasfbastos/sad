/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.disciplina.model;

import br.com.ifba.avaliacao.model.Avaliacao;
import br.com.ifba.etapacurso.model.EtapaCurso;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.professor.model.Professor;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Pedro Henrique
 */
@Entity
@Table(name = "disciplina")
@Data
public class Disciplina extends PersistenceEntity implements Serializable{
    //Variáveis
    private String nome;
    private String descriçao;
    private String codigo;
    private int cargaHoraria;
    
    //Uma ou mais disciplinas podem estar relacionadas a um professor
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "professor_id", referencedColumnName = "ID")
    private Professor professor;
    
    //Uma disciplina está associada a uma ou mais etapas do curso
    @OneToMany(fetch = FetchType.LAZY)
    private List <EtapaCurso> etapaCurso;
    
    //Uma disciplina está acossiada a uma avaliação
    @OneToOne(fetch = FetchType.EAGER)
    private Avaliacao avaliacao;  
    
}
