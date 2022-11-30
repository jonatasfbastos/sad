/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.resposta.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Ellen Cristina
 */
@Entity
@Table(name = "resposta_textual")
@Data
public class RespostaTextual extends Resposta implements Serializable {
    
    private String texto;

}