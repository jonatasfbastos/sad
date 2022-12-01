/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.turma.model;

import br.com.ifba.etapacurso.model.EtapaCurso;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.tipoturma.model.TipoTurma;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Gislaine Nunes
 */
@Entity
@Table(name = "turma")
@Data
public class Turma extends PersistenceEntity implements Serializable {
    
    private String nome;
    private String codigoTurma;
    private String sigla;
    private boolean ativa;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "turma_id", referencedColumnName = "ID")
    private TipoTurma tipoTurma;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private EtapaCurso etapaCurso;
}