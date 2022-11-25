/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.service;

import br.com.ifba.usuario.dao.IUsuarioDao;
import br.com.ifba.usuario.model.Usuario;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Pedro Henrique
 */
@Service
public class ServiceUsuario implements IServiceUsuario {
        
    //================= CONSTANTES =============================================
    
    // Mensagem de erro se o Usuario for null.
    private final static String USUARIO_NULL = "Dados do Usuario nao preenchidos";
    // Mensagem de erro se o Usuario já existir.
    private final static String USUARIO_EXISTE = "Usuario ja existente no Banco de dados";
    // Mensagem de erro se a Usuario não existir no banco.
    private final static String USUARIO_NAO_EXISTE = "Usuario nao existente no Banco de dados";
    // Mensagem de erro caso o nome esteja vazio.
    // private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    // Mensagem de erro caso o nome seja null.
    // private final static String NOME_NULL = "Dados do nome nao preenchidos";
    // Mensagem de erro caso o login esteja vazio.
    private final static String LOGIN_VAZIO = "O Campo Login esta vazio";
    // Mensagem de erro caso o login seja null.
    private final static String LOGIN_NULL = "Dados do Login nao preenchidos";
    
    //================= OBJETO =================================================
    @Autowired
     private IUsuarioDao UsuarioDao;
     
    //================= MÉTODOS ================================================
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        if(usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        } 
        if(UsuarioDao.existsByLogin(usuario.getLogin()) == true) {
            throw new BusinessException(USUARIO_EXISTE);
        }
        return UsuarioDao.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        } 
        if(UsuarioDao.existsById(usuario.getId()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
        return UsuarioDao.save(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        }
        if(UsuarioDao.existsById(usuario.getId()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);    
        }
        UsuarioDao.delete(usuario);
}

    @Override
    public List<Usuario> getAllUsuario() {
        return this.UsuarioDao.findAll();    
    }
    
    @Override
    public List<Usuario> findByLogin(String login) {
        if(login == null) {
            throw new BusinessException(LOGIN_NULL);
        }
        if(login.isEmpty()) {
            throw new BusinessException(LOGIN_VAZIO);
        }
        return UsuarioDao.findByLogin(login);
    }
    
    /*
    @Override
    public List<Usuario> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return UsuarioDao.findByNome(nome);
    }
    */
    
}