/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.perfilusuario.service;

import br.com.ifba.sad.infrastructure.exception.BusinessException;
import br.com.ifba.sad.perfilusuario.dao.IPerfilUsuarioDao;
import br.com.ifba.sad.perfilusuario.dao.PerfilUsuarioDao;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class ServicePerfilUsuario implements IServicePerfilUsuario{
    
     //================= CONSTANTES =============================================
    
    //mensagem de erro se o PerfilDeUsuario for null;
    public final static String PERFILUSUARIO_NULL = "PerfilUsuario null";
    
    //mensagem de erro se o PerfilDeUsuario já existir;
    public final static String PERFILUSUARIO_EXISTE = "O PerfilUsuario já existe,";
    
    //mensagem de erro se o PerfilDeUsuario não existir no banco;
    public final static String PERFILUSUARIO_NAO_EXISTE = "O PerfilUsuario não existe na base de dados";
    
    //mensagem de erro se o PerfilDeUsuario for inválido;
    public final static String PERFILUSUARIO_INVALIDO = "PerfilUsuario inválido";
    
     //================= OBJETO =================================================
    
    private final IPerfilUsuarioDao perfilUsuarioDao = new PerfilUsuarioDao();

     //================= MÉTODOS ================================================
    @Override
    public PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario) {
       if(perfilUsuario == null){
            throw new BusinessException(PERFILUSUARIO_NULL);
        } else if(perfilUsuarioDao.findById(perfilUsuario.getId()) != null) {
            throw new BusinessException(PERFILUSUARIO_EXISTE);
        } else {
            return perfilUsuarioDao.save(perfilUsuario);
        }
    }

    @Override
    public PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario) {
        if(perfilUsuario == null){
            throw new BusinessException(PERFILUSUARIO_NULL);
        } else if(perfilUsuarioDao.findById(perfilUsuario.getId()) == null) {
            throw new BusinessException(PERFILUSUARIO_NAO_EXISTE);
        } else {
            return perfilUsuarioDao.update(perfilUsuario);
        }
    }

    @Override
    public void deletePerfilUsuario(PerfilUsuario perfilUsuario) {
        if(perfilUsuario == null){
            throw new BusinessException(PERFILUSUARIO_NULL);
        } else if(perfilUsuarioDao.findById(perfilUsuario.getId()) != null) {
            perfilUsuarioDao.delete(perfilUsuario);
        }else{ 
            throw new BusinessException(PERFILUSUARIO_NAO_EXISTE);
        }
    }

    @Override
    public List<PerfilUsuario> getAllPerfilUsuario() {
        return this.perfilUsuarioDao.findAll();
    }

    @Override
    public List<PerfilUsuario> findByName(String name) {
        if(name == null) {
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return perfilUsuarioDao.findByName(name);
        } 
    }
    
}
