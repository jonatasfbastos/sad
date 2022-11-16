/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.etapacurso.model;

import br.com.ifba.curso.model.Curso;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author MATHEUS LIMA
 * 
 */
@Entity
@Table(name = "etapa_curso")
@Data
public class EtapaCurso extends PersistenceEntity implements Serializable {
    //Variáveis
    private String nome;
    private int periodo;
    private boolean concluinte;
    private int cargaHoraria;
    @ManyToMany(/*mappedBy = "curso",*/ fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> curso;

}