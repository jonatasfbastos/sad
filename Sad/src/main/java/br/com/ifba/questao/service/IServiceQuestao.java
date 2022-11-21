/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.questao.service;

import br.com.ifba.questao.model.Questao;
import java.util.List;

/**
 *
 * @author Lucas
 */
public interface IServiceQuestao {
    
    //salva a Questao
    public abstract Questao saveQuestao(Questao questao);
    
    //atualiza a Questao
    public abstract Questao updateQuestao(Questao questao);
    
    //deleta a Questao
    public abstract void deleteQuestao(Questao questao);
    
    // Metodo que retorna todas as Questaos da base de dados
    public abstract List<Questao> getAllQuestao();
    
    // Método que retorna a Questao com o id informado
    public Questao findById(Long id);
    
    // Método que retorna a lista com as Questaos com o enunciado informado
     public List<Questao> findByEnunciado(String enunciado);
    
}
