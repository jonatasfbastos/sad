/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.terceirizado.model;
import br.com.ifba.pessoa.model.Pessoa;
import java.io.Serializable;
import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author gislaine nunes
 */
@Entity
@Data
public abstract class Terceirizado extends Pessoa implements Serializable {
    
}