/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.formulario.service;

import br.com.ifba.formulario.dao.IFormularioDao;
import br.com.ifba.formulario.model.Formulario;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kaio
 */
@Service
public class ServiceFormulario implements IServiceFormulario{
    
    //-_-_-_-_-_-_-_-_-_- CONSTANTES -_-_-_-_-_-_-_-_-_-
    
    //mensagem de erro caso o Formulario seja nulo;
    public final static String FORMULARIO_NULL = "Formulario null";
    
    //mensagem de erro caso o Formulario já exista no banco de dados;
    public final static String FORMULARIO_EXISTE = "O Formulario já existe,";
    
    //mensagem de erro caso o Formulario não exista no banco de dados;
    public final static String FORMULARIO_NAO_EXISTE = "O Formulario não existe na base de dados";
    
    //mensagem de erro caso o Formulario seja inválido;
    public final static String FORMULARIO_INVALIDO = "Formulario inválido";
    
    //-_-_-_-_-_-_-_-_-_- OBJETO -_-_-_-_-_-_-_-_-_-
    
    @Autowired
     private IFormularioDao formularioDao;
     
    //-_-_-_-_-_-_-_-_-_- MÉTODOS -_-_-_-_-_-_-_-_-_-
    
    @Override
    public Formulario saveFormulario(Formulario formulario) {
        if(formulario == null){
            throw new BusinessException(FORMULARIO_NULL);
        } else if(formularioDao.existsById(formulario.getId()) == true){
            throw new BusinessException(FORMULARIO_EXISTE);
        } else {
            return formularioDao.save(formulario);
        }
    }

    @Override
    public Formulario updateFormulario(Formulario formulario) {
        if(formulario == null){
            throw new BusinessException(FORMULARIO_NULL);
        } else if(formularioDao.existsById(formulario.getId()) == false) {
            throw new BusinessException(FORMULARIO_NAO_EXISTE);
        } else {
            return formularioDao.save(formulario);
        }    
    }

    @Override
    public void deleteFormulario(Formulario formulario) {
        if(formulario == null){
            throw new BusinessException(FORMULARIO_NULL);
        }else if(this.formularioDao.existsById(formulario.getId()) == true) {
            this.formularioDao.delete(formulario);
            return;
        }
            throw new BusinessException(FORMULARIO_NAO_EXISTE);    
}

    @Override
    public List<Formulario> getAllFormulario() {
        return this.formularioDao.findAll();    
    }
    
    @Override
    public Formulario findById(Long id) {
        return formularioDao.getReferenceById(id);
    }  

    @Override
    public List<Formulario> findByTitulo(String titulo) {
        if(titulo == null) {
            throw new BusinessException("Nome null");
        } else if(titulo.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return formularioDao.findByTitulo(titulo);
        }
    }
}
