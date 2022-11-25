/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.modalidadecurso.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.modalidadecurso.dao.IModalidadeDao;
import br.com.ifba.modalidadecurso.model.Modalidade;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kaio
 */
@Service
public class ServiceModalidade implements IServiceModalidade{
    
    //-_-_-_-_-_-_-_-_-_- CONSTANTES -_-_-_-_-_-_-_-_-_-
    
    //mensagem de erro caso a Modalidade seja nula;
    public final static String MODALIDADE_NULL = "Dados da Modalidade nao preenchidos";
    
    //mensagem de erro caso a Modalidade já exista no banco de dados;
    public final static String MODALIDADE_EXISTE = "Modalidade ja existente no Banco de dados";
    
    //mensagem de erro caso a Modalidade não exista no banco de dados;
    public final static String MODALIDADE_NAO_EXISTE = "Modalidade nao existente no Banco de dados";
    
    //mensagem de erro caso a Modalidade seja inválida;
    public final static String MODALIDADE_INVALIDO = "As informaçoes da Modalidade nao sao validas";
    
    //-_-_-_-_-_-_-_-_-_- OBJETO -_-_-_-_-_-_-_-_-_-
    
    @Autowired
     private IModalidadeDao modalidadeDao;
     
    //-_-_-_-_-_-_-_-_-_- MÉTODOS -_-_-_-_-_-_-_-_-_-
    
    @Override
    public Modalidade saveModalidade(Modalidade modalidade) {
        if(modalidade == null){
            throw new BusinessException(MODALIDADE_NULL);
        } else if(modalidadeDao.existsById(modalidade.getId()) == true){
            throw new BusinessException(MODALIDADE_EXISTE);
        } else {
            return modalidadeDao.save(modalidade);
        }
    }

    @Override
    public Modalidade updateModalidade(Modalidade modalidade) {
        if(modalidade == null){
            throw new BusinessException(MODALIDADE_NULL);
        } else if(modalidadeDao.existsById(modalidade.getId()) == false) {
            throw new BusinessException(MODALIDADE_NAO_EXISTE);
        } else {
            return modalidadeDao.save(modalidade);
        }    
    }

    @Override
    public void deleteModalidade(Modalidade modalidade) {
        if(modalidade == null){
            throw new BusinessException(MODALIDADE_NULL);
        }else if(this.modalidadeDao.existsById(modalidade.getId()) == true) {
            this.modalidadeDao.delete(modalidade);
            return;
        }
            throw new BusinessException(MODALIDADE_NAO_EXISTE);    
}

    @Override
    public List<Modalidade> getAllModalidade() {
        return this.modalidadeDao.findAll();    
    }
    
    @Override
    public Modalidade findById(Long id) {
        return modalidadeDao.getReferenceById(id);
    }  

    @Override
    public List<Modalidade> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException("Dados do nome nao preenchidos");
        } else if(nome.isEmpty()) {
            throw new BusinessException("O Campo Nome esta vazio");
        } else {
            return modalidadeDao.findByNome(nome);
        }
    }
    
}
