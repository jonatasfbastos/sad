/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.disciplina.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.professor.model.Professor;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "professor_ID", referencedColumnName = "ID")
    private Professor professor;
    
    
}
