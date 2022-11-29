/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.tecnicoadministrativo.service;

import java.util.List;

/**
 *
 * @author João P. Arquim
 */
public interface IServiceTecnicoAdministrativo {
    
    public TecnicoAdministrativo saveTecnicoAdministrativo(TecnicoAdministrativo tecnicoAdministrativo);
    public TecnicoAdministrativo updateTecincoAdministrativo(TecnicoAdministrativo tecnicoAdministrativo);
    public void deleteTecnicoAdministrativo(TecnicoAdministrativo tecnicoAdministrativo);
    public List<TecnicoAdministrativo> getAllTecnicoAdministrativo();
    public List<TecnicoAdministrativo> findByNome(String nome);
    public TecnicoAdmnistrativo findById(Long id);
    
}
