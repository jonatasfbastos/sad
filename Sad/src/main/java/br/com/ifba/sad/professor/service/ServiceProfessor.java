/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.professor.service;

import br.com.ifba.sad.infrastructure.exception.BusinessException;
import br.com.ifba.sad.professor.dao.IProfessorDao;
import br.com.ifba.sad.professor.model.Professor;
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
    
    //mensagem de erro se o PerfilDeUsuario for null;
    public final static String PROFESSOR_NULL = "Professor null";
    
    //mensagem de erro se o PerfilDeUsuario já existir;
    public final static String PROFESSOR_EXISTE = "O Professor já existe";
    
    //mensagem de erro se o PerfilDeUsuario não existir no banco;
    public final static String PROFESSOR_NAO_EXISTE = "O Professor não existe na base de dados";
    
    //mensagem de erro se o PerfilDeUsuario for inválido;
    public final static String PROFESSOR_INVALIDO = "Professor inválido";
    
     //================= OBJETO =================================================
    @Autowired
    private IProfessorDao professorDao;

     //================= MÉTODOS ================================================
    @Override
    public Professor saveProfessor(Professor professor) {
       if(professor == null){
            throw new BusinessException(PROFESSOR_NULL);
        } else if(this.verificarSeExiste(professor) == true) {
            throw new BusinessException(PROFESSOR_EXISTE);
        } else {
            return professorDao.save(professor);
        }
    }

    @Override
    public Professor updateProfessor(Professor professor) {
        if(professor == null){
            throw new BusinessException(PROFESSOR_NULL);
        } else if(this.verificarSeExiste(professor) == false) {
            throw new BusinessException(PROFESSOR_NAO_EXISTE);
        } else {
            return professorDao.save(professor);
        }
    }

    @Override
    public void deleteProfessor(Professor professor) {
        if(professor == null){
            throw new BusinessException(PROFESSOR_NULL);
        } else if(this.verificarSeExiste(professor) == true) {
            professorDao.delete(professor);
        }else{ 
            throw new BusinessException(PROFESSOR_NAO_EXISTE);
        }
    }

    @Override
    public List<Professor> getAllprofessor() {
        return this.professorDao.findAll();
    }
    
    @Override
    public List<Professor> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException("Nome null");
        } else if(nome.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return professorDao.findByNome(nome);
        } 
    }
    
     @Override
     public Professor findById(Long id) {
          return professorDao.getReferenceById(id);
     }
    
     private boolean verificarSeExiste(Professor professor) {
         List<Professor> perfis = professorDao.findByNome(professor.getNome());
         for (Professor perfil: perfis) {
             if ((professor.getNome().toLowerCase()).equals(perfil.getNome().toLowerCase())) {
                return true;
             }
         }
         return false;
     }
}
