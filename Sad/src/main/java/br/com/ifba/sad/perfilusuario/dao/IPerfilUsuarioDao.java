/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.perfilusuario.dao;

import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ph715
 */
@Repository
public interface IPerfilUsuarioDao extends JpaRepository<PerfilUsuario, Long> {
    //public List<PerfilUsuario> findByName(String nome);
}
