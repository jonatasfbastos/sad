/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.etapacurso.service;

import br.com.ifba.sad.etapacurso.model.EtapaCurso;
import java.util.List;

/**
 *
 * @author Jonas Dias
 */
public interface IServiceEtapaCurso {
    
     // Salva EtapaCurso
    public abstract EtapaCurso saveEtapaCurso(EtapaCurso etapaCurso);
    // Atualiza EtapaCurso
    public abstract EtapaCurso updateEtapaCurso(EtapaCurso etapaCurso);
    // Deleta EtapaCurso
    public abstract void deleteEtapaCurso(EtapaCurso etapaCurso);
     // Método que retorna todos as EtapaCurso salvos no base de dados
    public abstract List<EtapaCurso> getAllEtapaCurso();
    // Método que retorna a EtapaCurso com o id informado
    public EtapaCurso findById(Long id);
    // Método que retorna a lista com as EtapaCurso com o nome informado
    public List<EtapaCurso> findByNome(String nome);
    
}
