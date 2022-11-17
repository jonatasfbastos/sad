/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.matrizcurricular.model;

import br.com.ifba.disciplina.model.Disciplina;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    
    @OneToMany(mappedBy = "MatrizCurricular", fetch = FetchType.EAGER)
    private Disciplina disciplina;
    
}
