/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.etapacurso.model;

import br.com.ifba.sad.curso.model.Curso;
import br.com.ifba.sad.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author MATHEUS LIMA
 * 
 */@Entity
@Table(name = "etapacurso")
 
public class EtapaCursoextends PersistenceEntity implements Serializable {
     private String nome;
    private int perodo;
    private boolean conclunte;
    private int cargaHoraria;
    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPerodo() {
        return perodo;
    }

    public void setPerodo(int perodo) {
        this.perodo = perodo;
    }

    public boolean isConclunte() {
        return conclunte;
    }

    public void setConclunte(boolean conclunte) {
        this.conclunte = conclunte;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
}
