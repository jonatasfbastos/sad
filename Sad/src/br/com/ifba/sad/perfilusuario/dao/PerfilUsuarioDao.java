/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.perfilusuario.dao;

import br.com.ifba.sad.infrastructure.basedao.BaseDao;
import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ph715
 */
public class PerfilUsuarioDao extends BaseDao<PerfilUsuario> implements IPerfilUsuarioDao {
     
    @Override
    public List<PerfilUsuario> findByName(String nome) {
        String busca = "SELECT a FROM PerfilUsuario AS a WHERE a.nome=:nome";
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", nome);
        return query.getResultList();
    }
    
}