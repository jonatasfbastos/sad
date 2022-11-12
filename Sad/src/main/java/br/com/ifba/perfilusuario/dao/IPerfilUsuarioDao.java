/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.perfilusuario.dao;

import br.com.ifba.perfilusuario.model.PerfilUsuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ph715
 */
@Repository
public interface IPerfilUsuarioDao extends JpaRepository<PerfilUsuario, Long> {
    
    public List<PerfilUsuario> findByNome(String nome);
    public boolean existsByNome(String nome);
    
}
