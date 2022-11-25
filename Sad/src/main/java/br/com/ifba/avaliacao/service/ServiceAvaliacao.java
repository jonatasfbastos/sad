/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.avaliacao.service;

import br.com.ifba.avaliacao.model.Avaliacao;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ifba.avaliacao.dao.IAvaliacaoDao;
/**
 *
 * @author Felipe
 */
@Service
public class ServiceAvaliacao implements IServiceAvaliacao{
    
    //================= CONSTANTES =============================================
    
    // Mensagem de erro se Avaliacao for null.
    public final static String AVALIACAO_NULL = "Dados da Avaliacao nao preenchidos";
    
    // Mensagem de erro se  Avaliacao já existe.
    public final static String AVALIACAO_EXISTE = "Avaliacao ja existente no Banco de dados";
    
    // Mensagem de erro se Avaliacao não existir no banco.
    public final static String AVALIACAO_NAO_EXISTE = "Avaliaçao nao existente no Banco de dados";
    
    // Mensagem de erro se Avaliacao for inválida.
    public final static String AVALIACAO_INVALIDO = "As informaçoes da Avaliacao nao sao validas";
    
    
     //================= OBJETO =================================================
    @Autowired
    private IAvaliacaoDao avaliacaoDao;

     //================= MÉTODOS ================================================
    @Override
    public Avaliacao saveAvaliacao(Avaliacao avaliacao) {
       if(avaliacao == null) {
            throw new BusinessException(AVALIACAO_NULL);
        } 
      
       return avaliacaoDao.save(avaliacao);
    }

    @Override
    public Avaliacao updateAvaliacao(Avaliacao avaliacao) {
        if(avaliacao == null) {
            throw new BusinessException(AVALIACAO_NULL);
        }
        if(avaliacaoDao.existsById(avaliacao.getId()) == false) {
            throw new BusinessException(AVALIACAO_NAO_EXISTE);
        }
        return avaliacaoDao.save(avaliacao);
    }

    @Override
    public void deleteAvaliacao(Avaliacao avaliacao) {
        if(avaliacao == null) {
            throw new BusinessException(AVALIACAO_NULL);
        }
        if(avaliacaoDao.existsById(avaliacao.getId()) == false) {
            throw new BusinessException(AVALIACAO_NAO_EXISTE);
        }
        avaliacaoDao.delete(avaliacao);
    }

    @Override
    public List<Avaliacao> getAllAvaliacao() {
        return this.avaliacaoDao.findAll();
    }
    
    
     @Override
     public Avaliacao findById(Long id) {
          return avaliacaoDao.getReferenceById(id);
     }
    
}
