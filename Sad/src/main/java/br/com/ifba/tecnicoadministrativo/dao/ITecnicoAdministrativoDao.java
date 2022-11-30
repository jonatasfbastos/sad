/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.tecnicoadministrativo.dao;

import br.com.ifba.tecnicoadministrativo.model.TecnicoAdministrativo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucas
 */

@Repository
public interface ITecnicoAdministrativoDao extends JpaRepository<TecnicoAdministrativo, Long> {
    
    public List<TecnicoAdministrativo> findByNome(String nome);
    public boolean existsByNome(String nome);
}

