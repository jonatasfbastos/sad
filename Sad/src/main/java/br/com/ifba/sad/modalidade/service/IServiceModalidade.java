/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.modalidade.service;

import br.com.ifba.sad.modalidade.model.Modalidade;
import java.util.List;

/**
 *
 * @author Kaio
 */
public interface IServiceModalidade {
    
    //salva a Modalidade
    public abstract Modalidade saveModalidade(Modalidade modalidade);
    
    //atualiza a Modalidade
    public abstract Modalidade updateModalidade(Modalidade modalidade);
    
    //deleta a Modalidade
    public abstract void deleteModalidade(Modalidade modalidade);
    
    // Metodo que retorna todas as Modalidades da base de dados
    public abstract List<Modalidade> getAllModalidade();
    
    // Método que retorna a Modalidade com o id informado
    public Modalidade findById(Long id);
    
    // Método que retorna a lista com as Modalidades com o nome informado
    public List<Modalidade> findByNome(String nome);
    
}
