/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.professor.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.professor.dao.IProfessorDao;
import br.com.ifba.professor.model.Professor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pedro Henrique 
 */
@Service
public class ServiceProfessor implements IServiceProfessor{
    //================= CONSTANTES =============================================
    
   // Mensagem de erro se o Professor for null.
    public final static String PROFESSOR_NULL = "Professor null";
    // Mensagem de erro se o Professor já existir.
    public final static String PROFESSOR_EXISTE = "O professor já existe";
    // Mensagem de erro se o Professor não existir no banco.
    public final static String PROFESSOR_NAO_EXISTE = "O professor não existe na base de dados";
    // Mensagem de erro se o Professor for inválido.
    public final static String PROFESSOR_INVALIDO = "Professor inválido";
     // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "Nome está vazio";
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Nome null";
    
     //================= OBJETO =================================================
    @Autowired
    private IProfessorDao professorDao;

     //================= MÉTODOS ================================================
    @Override
    public Professor saveProfessor(Professor professor) {
       if(professor == null) {
            throw new BusinessException(PROFESSOR_NULL);
        }
       if(professorDao.existsByNome(professor.getNome()) == true) {
            throw new BusinessException(PROFESSOR_EXISTE);
        }
       return professorDao.save(professor);
    }

    @Override
    public Professor updateProfessor(Professor professor) {
        if(professor == null) {
            throw new BusinessException(PROFESSOR_NULL);
        } 
        if(professorDao.existsById(professor.getId()) == false) {
            throw new BusinessException(PROFESSOR_NAO_EXISTE);
        }
        return professorDao.save(professor);
    }

    @Override
    public void deleteProfessor(Professor professor) {
        if(professor == null) {
            throw new BusinessException(PROFESSOR_NULL);
        } 
        if(professorDao.existsById(professor.getId()) == false) {
            throw new BusinessException(PROFESSOR_NAO_EXISTE);
        }
        professorDao.delete(professor);
    }

    @Override
    public List<Professor> getAllprofessor() {
        return this.professorDao.findAll();
    }
    
    @Override
    public List<Professor> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return professorDao.findByNome(nome); 
    }
    
     @Override
     public Professor findById(Long id) {
          return professorDao.getReferenceById(id);
     }
    
}