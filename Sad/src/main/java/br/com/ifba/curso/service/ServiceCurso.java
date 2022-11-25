/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.ICursoDao;
import br.com.ifba.curso.model.Curso;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kaio
 */
@Service
public class ServiceCurso implements IServiceCurso {
    
    //-_-_-_-_-_-_-_-_-_- CONSTANTES -_-_-_-_-_-_-_-_-_-
    
    //mensagem de erro caso o Curso seja nulo;
    public final static String CURSO_NULL = "Dados do Curso nao preenchidos";
    
    //mensagem de erro caso o Curso já exista no banco de dados;
    public final static String CURSO_EXISTE = "Curso ja existente no Banco de dados";
    
    //mensagem de erro caso o Curso não exista no banco de dados;
    public final static String CURSO_NAO_EXISTE = "Curso nao existente no Banco de dados";
    
    //mensagem de erro caso o Curso seja inválido;
    public final static String CURSO_INVALIDO = "As informaçoes do Curso nao sao validas";
    
    //-_-_-_-_-_-_-_-_-_- OBJETO -_-_-_-_-_-_-_-_-_-
    
    @Autowired
     private ICursoDao cursoDao;
     
    //-_-_-_-_-_-_-_-_-_- MÉTODOS -_-_-_-_-_-_-_-_-_-
    
    @Override
    public Curso saveCurso(Curso curso) {
        if(curso == null){
            throw new BusinessException(CURSO_NULL);
        } else if(cursoDao.existsById(curso.getId()) == true){
            throw new BusinessException(CURSO_EXISTE);
        } else {
            return cursoDao.save(curso);
        }
    }

    @Override
    public Curso updateCurso(Curso curso) {
        if(curso == null){
            throw new BusinessException(CURSO_NULL);
        } else if(cursoDao.existsById(curso.getId()) == false) {
            throw new BusinessException(CURSO_NAO_EXISTE);
        } else {
            return cursoDao.save(curso);
        }    
    }

    @Override
    public void deleteCurso(Curso curso) {
        if(curso == null){
            throw new BusinessException(CURSO_NULL);
        }else if(this.cursoDao.existsById(curso.getId()) == true) {
            this.cursoDao.delete(curso);
            return;
        }
            throw new BusinessException(CURSO_NAO_EXISTE);    
}

    @Override
    public List<Curso> getAllCurso() {
        return this.cursoDao.findAll();    
    }
    
    @Override
    public Curso findById(Long id) {
        return cursoDao.getReferenceById(id);
    }  

    @Override
    public List<Curso> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException("Dados do nome nao preenchidos");
        } else if(nome.isEmpty()) {
            throw new BusinessException("O Campo Nome esta vazio");
        } else {
            return cursoDao.findByNome(nome);
        }
    }

}
