/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.usuario.dao;

import br.com.ifba.sad.infrastructure.dao.BaseDao;
import br.com.ifba.sad.usuario.model.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Lucas Bastos
 */
public class UsuarioDao extends BaseDao<Usuario> implements IUsuarioDao {
    
    @Override
    public List<Usuario> findByLogin(String login) {
        
        //outra forma do find | "provisória"
        String busca = "SELECT a FROM Tarefa AS a WHERE a.login like '%:login%' ";
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(busca);
        query.setParameter("login", login);
        return query.getResultList();
        
    }
    
    @Override
    public List<Usuario> findByName(String name) {
        // Pesquisa por nome no banco de dados
        Query query = entityManager.createQuery("SELECT u FROM Usuario "
                + "AS u WHERE u.nome=:name");
        query.setParameter(1, name);
        // Salva resultados na lista
        List<Usuario> usuarios = query.getResultList();
        // Retorna resultados
        return usuarios;
    }
    
}
