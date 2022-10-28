/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.disciplina.service;

import br.com.ifba.sad.disciplina.model.Disciplina;
import java.util.List;
/**
 *
 * @author Pedro Henrique
 */
public interface IServiceDisciplina {
    
    //salva a disciplina
    public abstract Disciplina saveDisciplina(Disciplina disciplina);
    
    //deleta a disciplina
    public abstract void deleteDisciplina(Disciplina disciplina);
    
    //atualiza a disciplina
    public abstract Disciplina updateDisciplina(Disciplina disciplina);
    
    // Metodo que retorna todas oas disciplinas da base de dados
    public abstract List<Disciplina> getAllDisciplina();
    
    // procura a disciplina por login
    public List<Disciplina> findByLogin(String login);
    
    // Procura disciplina por nome
    public List<Disciplina> findByNome(String nome);
}
