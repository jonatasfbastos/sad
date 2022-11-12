/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.modalidadecurso.model.Modalidade;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "curso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Curso extends PersistenceEntity implements Serializable {
    // Variaveis
    private String nome;
    private String codigoCurso;
    private String sigla;
    private String descricao;
    @ManyToOne(fetch = FetchType.EAGER)    
    private Modalidade modalidade;
    
}
