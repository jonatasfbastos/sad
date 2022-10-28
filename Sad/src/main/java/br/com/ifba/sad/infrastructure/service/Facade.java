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
     
     
}