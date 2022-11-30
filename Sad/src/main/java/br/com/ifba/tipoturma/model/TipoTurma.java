/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tipoturma.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.turma.model.Turma;
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
 * @author Gislaine Nunes
 */
@Entity
@Table(name = "tipo_turma")
@Data
public class TipoTurma extends PersistenceEntity implements Serializable {
    
    private String nome;
    private String descricao;
    @OneToMany(mappedBy = "tipoTurma", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Turma> turmas;
    
}