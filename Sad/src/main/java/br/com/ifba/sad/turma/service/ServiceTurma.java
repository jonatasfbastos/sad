/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.turma.service;

import br.com.ifba.sad.infrastructure.exception.BusinessException;
import br.com.ifba.sad.turma.dao.ITurmaDao;
import br.com.ifba.sad.turma.model.Turma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jonas Dias
 */
@Service
public class ServiceTurma implements IServiceTurma {
    
    //================= CONSTANTES =============================================
    
    // Mensagem de erro se o EtapaCurso for null.
    private final static String TURMA_NULL = "Turma null";
    // Mensagem de erro se o EtapaCurso já existir.
    private final static String TURMA_EXISTE = "Turma já existe";
    // Mensagem de erro se a EtapaCurso não existir no banco.
    private final static String TURMA_NAO_EXISTE = "A turma não existe na base de dados";
    // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "Nome está vazio";
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Nome null";
    
     //================= OBJETO =================================================
    @Autowired
    private ITurmaDao turmaDao;

     //================= MÉTODOS ================================================
    @Override
    public Turma saveTurma(Turma turma) {
       if(turma == null){
            throw new BusinessException(TURMA_NULL);
        }
       if(this.verificarSeExiste(turma) == true) {
            throw new BusinessException(TURMA_EXISTE);
        }
       return this.turmaDao.save(turma);
    }

    @Override
    public Turma updateTurma(Turma turma) {
        if(turma == null){
            throw new BusinessException(TURMA_NULL);
        } 
        if(this.verificarSeExiste(turma) == false) {
            throw new BusinessException(TURMA_NAO_EXISTE);
        }
        return this.turmaDao.save(turma);        
    }

    @Override
    public void deleteTurma(Turma turma) {
        if(turma == null){
            throw new BusinessException(TURMA_NULL);
        } 
        if(this.verificarSeExiste(turma) == false) {
            throw new BusinessException(TURMA_NAO_EXISTE);
        }
        this.turmaDao.delete(turma);
    }

    @Override
    public List<Turma> getAllTurma() {
        return this.turmaDao.findAll();
    }
    
    @Override
    public List<Turma> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return this.turmaDao.findByNome(nome);
    }
    
     @Override
     public Turma findById(Long id) {
          return this.turmaDao.getReferenceById(id);
     }
     
     private boolean verificarSeExiste(Turma turma) {
         List<Turma> turmas = this.turmaDao.findByNome(turma.getNome());
         for (Turma t: turmas) {
             if ((t.getNome().toLowerCase()).equals(turma.getNome().toLowerCase())) {
                return true;
             }
         }
         return false;
     }
     
}