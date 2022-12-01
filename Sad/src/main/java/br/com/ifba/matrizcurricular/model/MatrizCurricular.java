/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.matrizcurricular.model;

import br.com.ifba.curso.model.Curso;
import br.com.ifba.etapacurso.model.EtapaCurso;
import br.com.ifba.infrastructure.model.PersistenceEntity;
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
 * @author João P. Arquim
 */
@Entity
@Table(name = "matriz_curricular")
@Data
public class MatrizCurricular extends PersistenceEntity implements Serializable{
    
    //atributos
    private String nome;
    private String descricao;
    
    //Uma matriz curricular pode estar associada a uma ou mais etapas do curso
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<EtapaCurso> etapacurso;
    
    //Uma ou mais matrizes estão relacionadas a um curso
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Curso curso;
    
}
