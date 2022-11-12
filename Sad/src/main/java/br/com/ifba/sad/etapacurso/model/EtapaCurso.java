/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.etapacurso.model;

import br.com.ifba.sad.curso.model.Curso;
import br.com.ifba.infrastructure.model.PersistenceEntity;
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

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public boolean isConcluinte() {
        return concluinte;
    }

    public void setConcluinte(boolean concluinte) {
        this.concluinte = concluinte;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }
    
}