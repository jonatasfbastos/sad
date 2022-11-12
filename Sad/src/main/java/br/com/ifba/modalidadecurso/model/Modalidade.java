/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modalidadecurso.model;

import br.com.ifba.curso.model.Curso;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
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
@Table(name = "modalidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Modalidade extends PersistenceEntity implements Serializable {
    // Variáveis
    @OneToMany(mappedBy = "modalidade", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> cursos;
    private String nome;
    private String descricao;

}
