/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.perfilusuario.dao;

import br.com.ifba.sad.infrastructure.basedao.IBaseDao;
import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import java.util.List;

/**
 *
 * @author ph715
 */
public interface IPerfilUsuarioDao extends IBaseDao<PerfilUsuario> {
    public List<PerfilUsuario> findByName(String name);
}
