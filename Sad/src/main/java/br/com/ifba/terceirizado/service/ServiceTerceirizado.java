/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.terceirizado.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.terceirizado.dao.ITerceirizadoDao;
import br.com.ifba.terceirizado.model.Terceirizado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leona
 */
@Service
public class ServiceTerceirizado implements IServiceTerceirizado{
    
    public final static String TERCEIRIZADO_NULL = "Dados do Terceirizado nao preenchidos";
   
    public final static String TERCEIRIZADO_EXISTE = "Terceirizado ja existente no Banco de dados";
    
    public final static String TERCEIRIZADO_NAO_EXISTE = "Terceirizado nao existente no Banco de dados";
   
    public final static String TERCEIRIZADO_INVALIDO = "As informaçoes do Terceirizado nao sao validas";
     
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
  
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
    @Autowired
    private ITerceirizadoDao terceirizadoDao;
    
    @Override
    public Terceirizado saveTerceirizado(Terceirizado terceirizado) {
       if(terceirizado == null) {
            throw new BusinessException(TERCEIRIZADO_NULL);
        }
       if(terceirizadoDao.existsByNome(terceirizado.getNome()) == true) {
            throw new BusinessException(TERCEIRIZADO_EXISTE);
        }
       return terceirizadoDao.save(terceirizado);
    }

    @Override
    public Terceirizado updateTerceirizado(Terceirizado terceirizado) {
        if(terceirizado == null) {
            throw new BusinessException(TERCEIRIZADO_NULL);
        } 
        if(terceirizadoDao.existsById(terceirizado.getId()) == false) {
            throw new BusinessException(TERCEIRIZADO_NAO_EXISTE);
        }
        return terceirizadoDao.save(terceirizado);
    }

    @Override
    public void deleteTerceirizado(Terceirizado terceirizado) {
        if(terceirizado == null) {
            throw new BusinessException(TERCEIRIZADO_NULL);
        } 
        if(terceirizadoDao.existsById(terceirizado.getId()) == false) {
            throw new BusinessException(TERCEIRIZADO_NAO_EXISTE);
        }
        terceirizadoDao.delete(terceirizado);
    }

    @Override
    public List<Terceirizado> getAllterceirizado() {
        return this.terceirizadoDao.findAll();
    }
    
    @Override
    public List<Terceirizado> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return terceirizadoDao.findByNome(nome); 
    }
    
     @Override
     public Terceirizado findById(Long id) {
          return terceirizadoDao.getReferenceById(id);
     }
}
