/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.aluno.model;

import br.com.ifba.pessoa.model.Pessoa;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Pedro Henrique
 */
@Entity
@Table(name = "aluno")
@Data
public class Aluno extends Pessoa implements Serializable{
    
    private String matricula;
}
