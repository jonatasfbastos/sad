/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.professor.model;

import br.com.ifba.disciplina.model.Disciplina;
import br.com.ifba.servidor.model.Servidor;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Pedro Henrique
 */
@Entity
@Table(name = "professor")
@Data
public class Professor extends Servidor implements Serializable {
    
    @OneToMany(mappedBy = "professor", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Disciplina> disciplina;

}