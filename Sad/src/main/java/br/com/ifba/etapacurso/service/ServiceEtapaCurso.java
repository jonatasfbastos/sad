/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.etapacurso.service;

import br.com.ifba.etapacurso.dao.IEtapaCursoDao;
import br.com.ifba.etapacurso.model.EtapaCurso;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonas Dias
 */
@Service
public class ServiceEtapaCurso implements IServiceEtapaCurso {
    
     //================= CONSTANTES =============================================
    
    // Mensagem de erro se o EtapaCurso for null
    private final static String ETAPA_CURSO_NULL = "Dados de Etapa Curso nao preenchidos";
    // Mensagem de erro se o EtapaCurso já existir
    private final static String ETAPA_CURSO_EXISTE = "Etapa Curso ja existente no Banco de dados";
    // Mensagem de erro se a EtapaCurso não existir no banco
    private final static String ETAPA_CURSO_NAO_EXISTE = "Etapa Curso nao existente no Banco de dados";
    // Mensagem de erro caso o nome esteja vazio
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    // Mensagem de erro caso o nome seja null
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
     //================= OBJETO =================================================
    @Autowired
    private IEtapaCursoDao etapaCursoDao;

     //================= MÉTODOS ================================================
    @Override
    public EtapaCurso saveEtapaCurso(EtapaCurso etapaCurso) {
       if(etapaCurso == null){
            throw new BusinessException(ETAPA_CURSO_NULL);
        }
       if(this.verificarSeExiste(etapaCurso) == true) {
            throw new BusinessException(ETAPA_CURSO_EXISTE);
        }
       return this.etapaCursoDao.save(etapaCurso);
    }

    @Override
    public EtapaCurso updateEtapaCurso(EtapaCurso etapaCurso) {
        if(etapaCurso == null){
            throw new BusinessException(ETAPA_CURSO_NULL);
        } 
        if(this.verificarSeExiste(etapaCurso) == false) {
            throw new BusinessException(ETAPA_CURSO_NAO_EXISTE);
        }
        return this.etapaCursoDao.save(etapaCurso);        
    }

    @Override
    public void deleteEtapaCurso(EtapaCurso etapaCurso) {
        if(etapaCurso == null){
            throw new BusinessException(ETAPA_CURSO_NULL);
        } 
        if(this.verificarSeExiste(etapaCurso) == false) {
            throw new BusinessException(ETAPA_CURSO_NAO_EXISTE);
        }
        this.etapaCursoDao.delete(etapaCurso);
    }

    @Override
    public List<EtapaCurso> getAllEtapaCurso() {
        return this.etapaCursoDao.findAll();
    }
    
    @Override
    public List<EtapaCurso> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return this.etapaCursoDao.findByNome(nome);
    }
    
     @Override
     public EtapaCurso findById(Long id) {
          return this.etapaCursoDao.getReferenceById(id);
     }
     
     private boolean verificarSeExiste(EtapaCurso etapaCurso) {
         List<EtapaCurso> etapas = this.etapaCursoDao.findByNome(etapaCurso.getNome());
         for (EtapaCurso etapa: etapas) {
             if ((etapaCurso.getNome().toLowerCase()).equals(etapa.getNome().toLowerCase())) {
                return true;
             }
         }
         return false;
     }
     
}