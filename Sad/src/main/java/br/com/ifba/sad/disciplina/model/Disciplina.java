/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.disciplina.model;

import br.com.ifba.sad.infrastructure.model.PersistenceEntity;
import br.com.ifba.sad.professor.model.Professor;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Pedro Henrique
 */
@Entity
@Table(name = "disciplina")
public class Disciplina extends PersistenceEntity implements Serializable{
    private String nome;//variaveis
    private String descriçao;
    private String sigla;
    private int cargaHoraria;
    
    @ManyToOne
    @JoinColumn(name = "professor_ID", referencedColumnName = "ID")

    //construtor
    public Disciplina() {
    }

    //getterres e setterres
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
}
