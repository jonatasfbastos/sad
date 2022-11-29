/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.terceirizado.service;

import br.com.ifba.terceirizado.model.Terceirizado;
import java.util.List;

/**
 *
 * @author leona
 */
public interface IServiceTerceirizado {
    
    
    public abstract Terceirizado saveTerceirizado(Terceirizado terceirizado);
    
    public abstract Terceirizado updateTerceirizado(Terceirizado terceirizado);
    
    public abstract void deleteTerceirizado(Terceirizado terceirizado);
     
    public abstract List<Terceirizado> getAllterceirizado();
    
    public Terceirizado findById(Long id);
   
    public List<Terceirizado> findByNome(String nome);
    
}
