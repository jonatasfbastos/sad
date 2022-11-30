/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tecnicoadministrativo.model;

import br.com.ifba.servidor.model.Servidor;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Lucas
 */

@Entity
@Table(name = "tecnicoadminstrativo")
@Data
public class TecnicoAdministrativo extends Servidor implements Serializable {
    
}
