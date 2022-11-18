/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.disponibilizaravaliacao.service;

import br.com.ifba.disponibilizaravaliacao.dao.IDisponibilizarAvaliacaoDao;
import br.com.ifba.disponibilizaravaliacao.model.DisponibilizarAvaliacao;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Felipe
 */
public class ServiceDisponibilizarAvaliacao implements IServiceDisponibilizarAvaliacao{
    
    //================= CONSTANTES =============================================
    
    // Mensagem de erro se Disponibilizar Avaliacao for null.
    public final static String DISPONIBILIZAR_AVALIACAO_NULL = "O Disponibilizar Avaliacao está null";
    
    // Mensagem de erro se Disponibilizar Avaliacao já existe.
    public final static String DISPONIBILIZAR_AVALIACAO_EXISTE = "Disponibilizar Avaliacao já existe";
    
    // Mensagem de erro se Disponibilizar Avaliacao não existir no banco.
    public final static String DISPONIBILIZAR_AVALIACAO_NAO_EXISTE = "Disponibilizar Avaliacao não existe na base de dados";
    
    // Mensagem de erro se Disponibilizar Avaliacao for inválida.
    public final static String DISPONIBILIZAR_AVALIACAO_INVALIDO = "Disponibilizar Avaliacao inválida";
    
    
     //================= OBJETO =================================================
    @Autowired
    private IDisponibilizarAvaliacaoDao disponibilizarAvaliacaoDao;

     //================= MÉTODOS ================================================
    @Override
    public DisponibilizarAvaliacao saveDisponibilizarAvaliacao(DisponibilizarAvaliacao disponibilizarAvaliacao) {
       if(disponibilizarAvaliacao == null) {
            throw new BusinessException(DISPONIBILIZAR_AVALIACAO_NULL);
        } 
      
       return disponibilizarAvaliacaoDao.save(disponibilizarAvaliacao);
    }

    @Override
    public DisponibilizarAvaliacao updateDisponibilizarAvaliacao(DisponibilizarAvaliacao disponibilizarAvaliacao) {
        if(disponibilizarAvaliacao == null) {
            throw new BusinessException(DISPONIBILIZAR_AVALIACAO_NULL);
        }
        if(disponibilizarAvaliacaoDao.existsById(disponibilizarAvaliacao.getId()) == false) {
            throw new BusinessException(DISPONIBILIZAR_AVALIACAO_NAO_EXISTE);
        }
        return disponibilizarAvaliacaoDao.save(disponibilizarAvaliacao);
    }

    @Override
    public void deleteDisponibilizarAvaliacao(DisponibilizarAvaliacao disponibilizarAvaliacao) {
        if(disponibilizarAvaliacao == null) {
            throw new BusinessException(DISPONIBILIZAR_AVALIACAO_NULL);
        }
        if(disponibilizarAvaliacaoDao.existsById(disponibilizarAvaliacao.getId()) == false) {
            throw new BusinessException(DISPONIBILIZAR_AVALIACAO_NAO_EXISTE);
        }
        disponibilizarAvaliacaoDao.delete(disponibilizarAvaliacao);
    }

    @Override
    public List<DisponibilizarAvaliacao> getAllDisponibilizarAvaliacao() {
        return this.disponibilizarAvaliacaoDao.findAll();
    }
    
    
     @Override
     public DisponibilizarAvaliacao findById(Long id) {
          return disponibilizarAvaliacaoDao.getReferenceById(id);
     }
    
}
