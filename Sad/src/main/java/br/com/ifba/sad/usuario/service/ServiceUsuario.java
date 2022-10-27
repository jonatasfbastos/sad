/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.usuario.service;

import br.com.ifba.sad.usuario.dao.IUsuarioDao;
import br.com.ifba.sad.usuario.model.Usuario;
import br.com.ifba.sad.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Pedro Henrique
 */
@Service
public class ServiceUsuario implements IServiceUsuario {
    
    //constantes
    //mensagem de erro se o Usuario for null;
    public final static String USUARIO_NULL = "Usuario null";
    
    //mensagem de erro se o Usuario já existir;
    public final static String USUARIO_EXISTE = "O Usuario já existe,";
    
    //mensagem de erro se o Usuario não existir no banco;
    public final static String USUARIO_NAO_EXISTE = "O Usuario não existe na base de dados";
    
    //mensagem de erro se o Usuario for inválido;
    public final static String USUARIO_INVALIDO = "Usuario inválido";
    
    @Autowired
     private IUsuarioDao UsuarioDao;
     
     @Override
    public Usuario saveUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        } else if(UsuarioDao.existsById(usuario.getId()) == true){
            throw new BusinessException(USUARIO_EXISTE);
        } else {
            return UsuarioDao.save(usuario);
        }
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        } else if(UsuarioDao.existsById(usuario.getId()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        } else {
            return UsuarioDao.save(usuario);
        }    
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        }else if(this.UsuarioDao.existsById(usuario.getId()) == true) {
            this.UsuarioDao.delete(usuario);
            return;
        }
            throw new BusinessException(USUARIO_NAO_EXISTE);    
}

    @Override
    public List<Usuario> getAllUsuario() {
        return this.UsuarioDao.findAll();    
    }
    
    @Override
    public List<Usuario> findByLogin(String login) {
        if(login == null) {
            throw new BusinessException("login null");
        } else if(login.isEmpty()) {
            throw new BusinessException("login vazio");
        } else {
            return UsuarioDao.findByLogin(login);
        }    
    }
    
    @Override
    public List<Usuario> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException("nome null");
        } else if(nome.isEmpty()) {
            throw new BusinessException("nome vazio");
        } else {
            return UsuarioDao.findByNome(nome);
        }
    }
    
}
