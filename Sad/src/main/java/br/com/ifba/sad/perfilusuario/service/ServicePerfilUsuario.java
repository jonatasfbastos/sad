/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.perfilusuario.service;

import br.com.ifba.sad.infrastructure.exception.BusinessException;
import br.com.ifba.sad.perfilusuario.dao.IPerfilUsuarioDao;
import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Felipe
 */
@Service
public class ServicePerfilUsuario implements IServicePerfilUsuario {
    
     //================= CONSTANTES =============================================
    
    //mensagem de erro se o PerfilDeUsuario for null;
    public final static String PERFILUSUARIO_NULL = "Perfil usuário null";
    
    //mensagem de erro se o PerfilDeUsuario já existir;
    public final static String PERFILUSUARIO_EXISTE = "O perfil usuário já existe";
    
    //mensagem de erro se o PerfilDeUsuario não existir no banco;
    public final static String PERFILUSUARIO_NAO_EXISTE = "O perfil usuário não existe na base de dados";
    
    //mensagem de erro se o PerfilDeUsuario for inválido;
    public final static String PERFILUSUARIO_INVALIDO = "Perfil usuário inválido";
    
     //================= OBJETO =================================================
    @Autowired
    private IPerfilUsuarioDao perfilUsuarioDao;

     //================= MÉTODOS ================================================
    @Override
    public PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario) {
       if(perfilUsuario == null){
            throw new BusinessException(PERFILUSUARIO_NULL);
        } else if(this.verificarSeExiste(perfilUsuario) == true) {
            throw new BusinessException(PERFILUSUARIO_EXISTE);
        } else {
            return perfilUsuarioDao.save(perfilUsuario);
        }
    }

    @Override
    public PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario) {
        if(perfilUsuario == null){
            throw new BusinessException(PERFILUSUARIO_NULL);
        } else if(this.verificarSeExiste(perfilUsuario) == false) {
            throw new BusinessException(PERFILUSUARIO_NAO_EXISTE);
        } else {
            return perfilUsuarioDao.save(perfilUsuario);
        }
    }

    @Override
    public void deletePerfilUsuario(PerfilUsuario perfilUsuario) {
        if(perfilUsuario == null){
            throw new BusinessException(PERFILUSUARIO_NULL);
        } else if(this.verificarSeExiste(perfilUsuario) == true) {
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
    public List<PerfilUsuario> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException("Nome null");
        } else if(nome.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return perfilUsuarioDao.findByNome(nome);
        } 
    }
    
     @Override
     public PerfilUsuario findById(Long id) {
          return perfilUsuarioDao.getReferenceById(id);
     }
     
     // O findById tá com algum erro, esse aqui é provisório para verificar se já existe perfil salvo no banco //
     private boolean verificarSeExiste(PerfilUsuario perfilUsuario) {
         List<PerfilUsuario> perfis = perfilUsuarioDao.findByNome(perfilUsuario.getNome());
         for (PerfilUsuario perfil: perfis) {
             if ((perfilUsuario.getNome().toLowerCase()).equals(perfil.getNome().toLowerCase())) {
                return true;
             }
         }
         return false;
     }
    
}
