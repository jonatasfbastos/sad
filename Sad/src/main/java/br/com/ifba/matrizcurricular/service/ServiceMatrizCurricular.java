/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.matrizcurricular.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.matrizcurricular.dao.IMatrizCurricularDao;
import br.com.ifba.matrizcurricular.model.MatrizCurricular;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author João P. Arquim
 */
@Service
public class ServiceMatrizCurricular implements IServiceMatrizCurricular{
    
    //================= CONSTANTES =============================================
    
    // Mensagem de erro se a Matriz Curricular for null.
    public final static String MATRIZ_CURRICULAR_NULL = "A Matriz curricular está null";
    
    // Mensagem de erro se a Matriz Curricular já existe.
    public final static String MATRIZ_CURRICULAR_EXISTE = "A Matriz curricular já existe";
    
    // Mensagem de erro se a Matriz Curricular não existir no banco.
    public final static String MATRIZ_CURRICULAR_NAO_EXISTE = "A Matriz curricular não existe na base de dados";
    
    // Mensagem de erro se a Matriz Curricular for inválida.
    public final static String MATRIZ_CURRICULAR_INVALIDO = "Matriz Curricular inválida";
    
     // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "Nome está vazio";
    
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Nome null";
    
     //================= OBJETO =================================================
    @Autowired
    private IMatrizCurricularDao matrizCurricularDao;

     //================= MÉTODOS ================================================
    @Override
    public MatrizCurricular saveMatrizCurricular(MatrizCurricular matrizCurricular) {
       if(matrizCurricular == null) {
            throw new BusinessException(MATRIZ_CURRICULAR_NULL);
        } 
       if(matrizCurricularDao.existsByNome(matrizCurricular.getNome()) == true) {
            throw new BusinessException(MATRIZ_CURRICULAR_EXISTE);
        }
       return matrizCurricularDao.save(matrizCurricular);
    }

    @Override
    public MatrizCurricular updateMatrizCurricular(MatrizCurricular matrizCurricular) {
        if(matrizCurricular == null) {
            throw new BusinessException(MATRIZ_CURRICULAR_NULL);
        }
        if(matrizCurricularDao.existsById(matrizCurricular.getId()) == false) {
            throw new BusinessException(MATRIZ_CURRICULAR_NAO_EXISTE);
        }
        return matrizCurricularDao.save(matrizCurricular);
    }

    @Override
    public void deleteMatrizCurricular(MatrizCurricular matrizCurricular) {
        if(matrizCurricular == null) {
            throw new BusinessException(MATRIZ_CURRICULAR_NULL);
        }
        if(matrizCurricularDao.existsById(matrizCurricular.getId()) == false) {
            throw new BusinessException(MATRIZ_CURRICULAR_NAO_EXISTE);
        }
        matrizCurricularDao.delete(matrizCurricular);
    }

    @Override
    public List<MatrizCurricular> getAllMatrizCurricular() {
        return this.matrizCurricularDao.findAll();
    }
    
    @Override
    public List<MatrizCurricular> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        }
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return matrizCurricularDao.findByNome(nome);
    }
    
     @Override
     public MatrizCurricular findById(Long id) {
          return matrizCurricularDao.getReferenceById(id);
     }
    
}
