/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.perfilusuario.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.perfilusuario.dao.IPerfilUsuarioDao;
import br.com.ifba.perfilusuario.model.PerfilUsuario;
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
    
    // Mensagem de erro se o PerfilDeUsuario for null.
    public final static String PERFIL_USUARIO_NULL = "Dados do Perfil Usuario nao preenchidos";
    // Mensagem de erro se o PerfilDeUsuario já existir.
    public final static String PERFIL_USUARIO_EXISTE = "Perfil Usuario ja existente no Banco de dados";
    // Mensagem de erro se o PerfilDeUsuario não existir no banco.
    public final static String PERFIL_USUARIO_NAO_EXISTE = "Perfil Usuario nao existente no Banco de dados";
    // Mensagem de erro se o PerfilDeUsuario for inválido.
    public final static String PERFIL_USUARIO_INVALIDO = "As informaçoes do Perfil usuário nao sao validas";
     // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
     //================= OBJETO =================================================
    @Autowired
    private IPerfilUsuarioDao perfilUsuarioDao;

     //================= MÉTODOS ================================================
    @Override
    public PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario) {
       if(perfilUsuario == null) {
            throw new BusinessException(PERFIL_USUARIO_NULL);
        } 
       if(perfilUsuarioDao.existsByNome(perfilUsuario.getNome()) == true) {
            throw new BusinessException(PERFIL_USUARIO_EXISTE);
        }
       return perfilUsuarioDao.save(perfilUsuario);
    }

    @Override
    public PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario) {
        if(perfilUsuario == null) {
            throw new BusinessException(PERFIL_USUARIO_NULL);
        }
        if(perfilUsuarioDao.existsById(perfilUsuario.getId()) == false) {
            throw new BusinessException(PERFIL_USUARIO_NAO_EXISTE);
        }
        return perfilUsuarioDao.save(perfilUsuario);
    }

    @Override
    public void deletePerfilUsuario(PerfilUsuario perfilUsuario) {
        if(perfilUsuario == null) {
            throw new BusinessException(PERFIL_USUARIO_NULL);
        }
        if(perfilUsuarioDao.existsById(perfilUsuario.getId()) == false) {
            throw new BusinessException(PERFIL_USUARIO_NAO_EXISTE);
        }
        perfilUsuarioDao.delete(perfilUsuario);
    }

    @Override
    public List<PerfilUsuario> getAllPerfilUsuario() {
        return this.perfilUsuarioDao.findAll();
    }
    
    @Override
    public List<PerfilUsuario> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        }
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return perfilUsuarioDao.findByNome(nome);
    }
    
     @Override
     public PerfilUsuario findById(Long id) {
          return perfilUsuarioDao.getReferenceById(id);
     }
    
}
