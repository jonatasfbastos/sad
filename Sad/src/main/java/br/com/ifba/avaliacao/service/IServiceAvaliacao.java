/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.avaliacao.service;

import br.com.ifba.avaliacao.model.Avaliacao;
import java.util.List;

/**
 *
 * @author Felipe
 */
public interface IServiceAvaliacao {
    // Salva Disponibilizar Avaliacao.
    public Avaliacao saveAvaliacao(Avaliacao avaliacao);
    // Atualiza  Disponibilizar Avaliacao.
    public Avaliacao updateAvaliacao(Avaliacao avaliacao);
    // Deleta o Disponibilizar Avaliacao.
    public void deleteAvaliacao(Avaliacao avaliacao);
     // Método que retorna todos os Disponibilizar Avaliacao da base de dados.
    public List<Avaliacao> getAllAvaliacao();
    // Método que retorna o Disponibilizar Avaliacao com o id informado.
    public Avaliacao findById(Long id);
    
}
