/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.aluno.service;

import br.com.ifba.aluno.dao.IAlunoDao;
import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pedro Henrique
 */
@Service
public class ServiceAluno implements IServiceAluno {
    //================= CONSTANTES =============================================
    
   // Mensagem de erro se o Aluno for null.
    public final static String ALUNO_NULL = "Dados do Aluno nao preenchidos";
    // Mensagem de erro se o Aluno já existir.
    public final static String ALUNO_EXISTE = "Aluno ja existente no Banco de dados";
    // Mensagem de erro se o Aluno não existir no banco.
    public final static String ALUNO_NAO_EXISTE = "Aluno nao existente no Banco de dados";
    // Mensagem de erro se o Aluno for inválido.
    public final static String ALUNO_INVALIDO = "As informaçoes do Aluno nao sao validas";
     // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
     //================= OBJETO =================================================
    @Autowired
    private IAlunoDao alunoDao;

     //================= MÉTODOS ================================================
    @Override
    public Aluno saveAluno(Aluno aluno) {
       if(aluno == null) {
            throw new BusinessException(ALUNO_NULL);
        }
       if(alunoDao.existsByNome(aluno.getNome()) == true) {
            throw new BusinessException(ALUNO_EXISTE);
        }
       return alunoDao.save(aluno);
    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        if(aluno == null) {
            throw new BusinessException(ALUNO_NULL);
        } 
        if(alunoDao.existsById(aluno.getId()) == false) {
            throw new BusinessException(ALUNO_NAO_EXISTE);
        }
        return alunoDao.save(aluno);
    }

    @Override
    public void deleteAluno(Aluno professor) {
        if(professor == null) {
            throw new BusinessException(ALUNO_NULL);
        } 
        if(alunoDao.existsById(professor.getId()) == false) {
            throw new BusinessException(ALUNO_NAO_EXISTE);
        }
        alunoDao.delete(professor);
    }

    @Override
    public List<Aluno> getAllaluno() {
        return this.alunoDao.findAll();
    }
    
    @Override
    public List<Aluno> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return alunoDao.findByNome(nome); 
    }
    
     @Override
     public Aluno findById(Long id) {
          return alunoDao.getReferenceById(id);
     }
    
}

