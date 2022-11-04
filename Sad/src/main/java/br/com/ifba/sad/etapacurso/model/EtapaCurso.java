/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.etapacurso.model;

import br.com.ifba.sad.curso.model.Curso;
import br.com.ifba.sad.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author MATHEUS LIMA
 * 
 */
@Entity
@Table(name = "etapa_curso")
public class EtapaCurso extends PersistenceEntity implements Serializable {
    
    private String nome;
    private int periodo;
    private boolean concluinte;
    private int cargaHoraria;
    @ManyToMany(/*mappedBy = "curso",*/ fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPerodo() {
        return periodo;
    }

    public void setPerodo(int perodo) {
        this.periodo = perodo;
    }

    public boolean isConclunte() {
        return concluinte;
    }

    public void setConclunte(boolean conclunte) {
        this.concluinte = conclunte;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
}