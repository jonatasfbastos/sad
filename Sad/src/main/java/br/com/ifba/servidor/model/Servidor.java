/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.servidor.model;
import br.com.ifba.pessoa.model.Pessoa;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Pedro Henrique
 */
@Data
public abstract class Servidor extends Pessoa implements Serializable {
    
    private String siape;
    
}