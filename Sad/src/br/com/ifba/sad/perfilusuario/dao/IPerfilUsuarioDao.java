/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.perfilusuario.dao;

import java.util.List;

/**
 *
 * @author ph715
 */
public interface IPerfilUsuarioDao {
    public List<PerfilUsuario> findByName(String name);
}
