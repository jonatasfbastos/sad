/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.formulario.service;

import br.com.ifba.formulario.model.Formulario;
import java.util.List;

/**
 *
 * @author Kaio
 */

public interface IServiceFormulario {
    
    // Salva o Formulario
    public abstract Formulario saveFormulario(Formulario formulario);
    
    // Atualiza o Formulario
    public abstract Formulario updateFormulario(Formulario formulario);
    
    // Deleta o Formulario
    public abstract void deleteFormulario(Formulario formulario);
    
    // Metodo que retorna todos os Formularios da base de dados
    public abstract List<Formulario> getAllFormulario();
    
    // Método que retorna o Formulario com o id informado
    public Formulario findById(Long id);
    
    // Método que retorna a lista com os Formularios com o nome informado
    public List<Formulario> findByTitulo(String titulo);
    
}
