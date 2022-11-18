/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.disponibilizaravaliacao.service;

import br.com.ifba.disponibilizaravaliacao.model.DisponibilizarAvaliacao;
import java.util.List;

/**
 *
 * @author Felipe
 */
public interface IServiceDisponibilizarAvaliacao {
    // Salva Disponibilizar Avaliacao.
    public DisponibilizarAvaliacao saveDisponibilizarAvaliacao(DisponibilizarAvaliacao disponibilizarAvaliacao);
    // Atualiza  Disponibilizar Avaliacao.
    public DisponibilizarAvaliacao updateDisponibilizarAvaliacao(DisponibilizarAvaliacao disponibilizarAvaliacao);
    // Deleta o Disponibilizar Avaliacao.
    public void deleteDisponibilizarAvaliacao(DisponibilizarAvaliacao disponibilizarAvaliacao);
     // Método que retorna todos os Disponibilizar Avaliacao da base de dados.
    public List<DisponibilizarAvaliacao> getAllDisponibilizarAvaliacao();
    // Método que retorna o Disponibilizar Avaliacao com o id informado.
    public DisponibilizarAvaliacao findById(Long id);
    
}
