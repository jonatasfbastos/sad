/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.usuario.dao;

import br.com.ifba.sad.infrastructure.basedao.BaseDao;
import br.com.ifba.sad.usuario.model.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Lucas Bastos
 */
public class UsuarioDao extends BaseDao<Usuario> implements IUsuarioDao {
    
    @Override
    public List<Usuario> findByName(String name) {
        
        // Pesquisa por nome no banco de dados
        Query query = entityManager.createQuery("SELECT u FROM Usuario "
                + "AS u WHERE u.name=:name");
        query.setParameter(1, name);
        
        // Salva resultados na lista
        List<Usuario> usuarios = query.getResultList();
        
        // Retorna resultados
        return usuarios;
        
    }
    
}
