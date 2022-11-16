/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.servidor.model;
import br.com.ifba.pessoa.model.Pessoa;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Pedro Henrique
 */

@Getter
@Setter
public abstract class Servidor extends Pessoa{
    private String siape;
    
    
}
