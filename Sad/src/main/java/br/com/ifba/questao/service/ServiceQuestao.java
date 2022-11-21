/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.questao.service;
import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.questao.dao.IQuestaoDao;
import br.com.ifba.questao.model.Questao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lucas
 */
@Service
public class ServiceQuestao implements IServiceQuestao{
    
    //-_-_-_-_-_-_-_-_-_- CONSTANTES -_-_-_-_-_-_-_-_-_-
    
    //mensagem de erro caso a Questao seja nula;
    public final static String QUESTAO_NULL = "Questao null";
    
    //mensagem de erro caso a Questao já exista no banco de dados;
    public final static String QUESTAO_EXISTE = "A Questao já existe,";
    
    //mensagem de erro caso a Questao não exista no banco de dados;
    public final static String QUESTAO_NAO_EXISTE = "A Questao não existe na base de dados";
    
    //mensagem de erro caso a Questao seja inválida;
    public final static String QUESTAO_INVALIDO = "Questao inválida";
    // mensagem de erro caso a Questao seja vazia;
    private final static String QUESTAO_VAZIO = "Questao está vazio";
    
    //-_-_-_-_-_-_-_-_-_- OBJETO -_-_-_-_-_-_-_-_-_-
    
    @Autowired
     private IQuestaoDao questaoDao;
     
    //-_-_-_-_-_-_-_-_-_- MÉTODOS -_-_-_-_-_-_-_-_-_-

    @Override
    public Questao saveQuestao(Questao questao) {
        if(questao == null) {
            throw new BusinessException(QUESTAO_NULL);
        }
       if(questaoDao.existsByEnunciado(questao.getEnunciado()) == true) {
            throw new BusinessException(QUESTAO_EXISTE);
        }
       return questaoDao.save(questao);}

    @Override
    public Questao updateQuestao(Questao questao) {
        if(questao == null) {
            throw new BusinessException(QUESTAO_NULL);
        } 
        if(questaoDao.existsById(questao.getId()) == false) {
            throw new BusinessException(QUESTAO_NAO_EXISTE);
        }
        return questaoDao.save(questao);
    }

    @Override
    public void deleteQuestao(Questao questao) {
       if(questao == null) {
            throw new BusinessException(QUESTAO_NULL);
        } 
        if(questaoDao.existsById(questao.getId()) == false) {
            throw new BusinessException(QUESTAO_NAO_EXISTE);
        }
        questaoDao.delete(questao);
    }

     @Override
    public List<Questao> getAllQuestao() {
        return this.questaoDao.findAll();
    }
    
    @Override
    public List<Questao> findByEnunciado(String enunciado) {
        if(enunciado == null) {
            throw new BusinessException(QUESTAO_NULL);
        } 
        if(enunciado.isEmpty()) {
            throw new BusinessException(QUESTAO_VAZIO);
        }
        return questaoDao.findByEnunciado(enunciado); 
    }
    
     @Override
     public Questao findById(Long id) {
          return questaoDao.getReferenceById(id);
     }

    

  
    
   
    
}
