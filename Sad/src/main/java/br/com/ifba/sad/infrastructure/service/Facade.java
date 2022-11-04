/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.sad.infrastructure.service;

import br.com.ifba.sad.disciplina.model.Disciplina;
import br.com.ifba.sad.disciplina.service.IServiceDisciplina;
import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import br.com.ifba.sad.perfilusuario.service.IServicePerfilUsuario;
import br.com.ifba.sad.usuario.model.Usuario;
import br.com.ifba.sad.usuario.service.IServiceUsuario;
import br.com.ifba.sad.professor.model.Professor;
import br.com.ifba.sad.professor.service.IServiceProfessor;
import br.com.ifba.sad.curso.model.Curso;
import br.com.ifba.sad.curso.service.IServiceCurso;
import br.com.ifba.sad.modalidade.model.Modalidade;
import br.com.ifba.sad.modalidade.service.IServiceModalidade;
import br.com.ifba.sad.turma.model.Turma;
import br.com.ifba.sad.turma.service.IServiceTurma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author clebinho
 */
@Controller
public class Facade implements IFacade {

     //=====================PerfilUsuario====================//
    @Autowired
     private IServicePerfilUsuario servicePerfilUsuario;
    
     @Override
     public PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario) {
          return servicePerfilUsuario.savePerfilUsuario(perfilUsuario);
     }

     @Override
     public PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario) {
          return servicePerfilUsuario.updatePerfilUsuario(perfilUsuario);
     }

     @Override
     public void deletePerfilUsuario(PerfilUsuario perfilUsuario) {
          servicePerfilUsuario.deletePerfilUsuario(perfilUsuario);
     }

     @Override
     public List<PerfilUsuario> getAllPerfilUsuario() {
          return servicePerfilUsuario.getAllPerfilUsuario();
     }
     
      @Override
     public PerfilUsuario findByIdPerfilUsuario(Long id) {
          return servicePerfilUsuario.findById(id);
     }
     
    @Override
     public List<PerfilUsuario> findByNomePerfilUsuario(String nome) {
         return servicePerfilUsuario.findByNome(nome);
     }
     
     //=====================Usuario====================//
     @Autowired
     private IServiceUsuario serviceUsuario;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return serviceUsuario.saveUsuario(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return serviceUsuario.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        serviceUsuario.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return serviceUsuario.getAllUsuario();
    }
    
    @Override
    public List<Usuario> findByNomeUsuario(String nome) {
        return serviceUsuario.findByNome(nome);
    }
    
    @Override
     public List<Usuario> findByLoginUsuario(String login) {
         return serviceUsuario.findByLogin(login);
     }
     
     //=====================Professor====================//
     @Autowired
     private IServiceProfessor serviceProfessor;
     
     @Override
    public Professor saveProfessor(Professor professor) {
        return serviceProfessor.saveProfessor(professor);
    }

    @Override
    public Professor updateProfessor(Professor professor) {
        return serviceProfessor.updateProfessor(professor);
    }

    @Override
    public void deleteProfessor(Professor professor) {
        serviceProfessor.deleteProfessor(professor);
    }
    
    @Override
     public List<Professor> findByNomeProfessor(String nome) {
         return serviceProfessor.findByNome(nome);
     }

    @Override
    public List<Professor> getAllProfessor() {
        return serviceProfessor.getAllprofessor();
    }

    @Override
    public Professor findById(Long id) {
        return serviceProfessor.findById(id);
    }

    //=====================Disciplina====================//
     @Autowired
     private IServiceDisciplina serviceDisciplina;

    @Override
    public Disciplina saveDisciplina(Disciplina disciplina) {
        return serviceDisciplina.saveDisciplina(disciplina);
    }

    @Override
    public Disciplina updateDisciplina(Disciplina disciplina) {
        return serviceDisciplina.updateDisciplina(disciplina);
    }

    @Override
    public void deleteDisciplina(Disciplina disciplina) {
        serviceDisciplina.deleteDisciplina(disciplina);
    }

    @Override
    public List<Disciplina> getAllDisciplina() {
        return serviceDisciplina.getAllDisciplina();
    }
    
    @Override
    public List<Disciplina> findByNomeDisciplina(String nome) {
        return serviceDisciplina.findByNome(nome);
    }

    //======================Curso=================//
    @Autowired
    private IServiceCurso serviceCurso;
    
    @Override
    public Curso saveCurso(Curso curso) {
        return serviceCurso.saveCurso(curso);
    }

    @Override
    public Curso updateCurso(Curso curso) {
        return serviceCurso.updateCurso(curso);
    }

    @Override
    public void deleteCurso(Curso curso) {
        serviceCurso.deleteCurso(curso);
    }

    @Override
    public List<Curso> getAllCurso() {
        return serviceCurso.getAllCurso();
    }
    
    @Override
    public Curso findByIdCurso(Long id) {
        return serviceCurso.findById(id);
    }

    @Override
    public List<Curso> findByNomeCurso(String nome) {
        return serviceCurso.findByNome(nome);
    }

    //==================Modalidade===================//
    @Autowired
    private IServiceModalidade serviceModalidade;
    
    @Override
    public Modalidade saveModalidade(Modalidade modalidade) {
        return serviceModalidade.saveModalidade(modalidade);
    }

    @Override
    public Modalidade updateModalidade(Modalidade modalidade) {
        return serviceModalidade.updateModalidade(modalidade);
    }

    @Override
    public void deleteModalidade(Modalidade modalidade) {
        serviceModalidade.deleteModalidade(modalidade);
    }

    @Override
    public List<Modalidade> getAllModalidade() {
        return serviceModalidade.getAllModalidade();
    }

    @Override
    public List<Modalidade> findByNomeModalidade(String nome) {
        return serviceModalidade.findByNome(nome);
    }

    @Override
    public Modalidade findByIdModalidade(Long id) {
        return serviceModalidade.findById(id);
    }
    
     //===================Turma==================//
    @Autowired
    private IServiceTurma serviceTurma;
    
    @Override
    public Turma saveTurma(Turma turma) {
        return serviceTurma.saveTurma(turma);
    }

    @Override
    public Turma updateTurma(Turma turma) {
        return serviceTurma.updateTurma(turma);
    }

    @Override
    public void deleteTurma(Turma turma) {
        serviceTurma.deleteTurma(turma);
    }

    @Override
    public List<Turma> getAllTurma() {
        return serviceTurma.getAllTurma();
    }

    @Override
    public Turma findByIdTurma(Long id) {
        return serviceTurma.findById(id);
    }

    @Override
    public List<Turma> findByNomeTurma(String nome) {
        return serviceTurma.findByNome(nome);
    }
}