/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.modalidade.model;

import br.com.ifba.sad.curso.model.Curso;
import br.com.ifba.sad.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "modalidade")
public class Modalidade extends PersistenceEntity implements Serializable {
    // variaveis
    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> curso;
    private String nome;
    private String descricao;

     //construtor
    public Modalidade() {
    } 
    
    /**
     * @return the curso
     */
    public List<Curso> getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
