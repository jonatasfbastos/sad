/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.matrizcurricular.model.MatrizCurricular;
import br.com.ifba.modalidadecurso.model.Modalidade;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "curso")
@Data
public class Curso extends PersistenceEntity implements Serializable {
    // Variaveis
    private String nome;
    private String codigoCurso;
    private String sigla;
    private String descricao;
    
    //Vários cursos podem estar associados a uma modalidade
    @ManyToOne(fetch = FetchType.EAGER)    
    private Modalidade modalidade;
    
    //Um curso está associado a uma ou mais matrizes curriculares
    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY)
    private List <MatrizCurricular> matrizCurricular;
}
