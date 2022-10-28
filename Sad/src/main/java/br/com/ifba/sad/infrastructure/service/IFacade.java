/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.sad.infrastructure.service;

import br.com.ifba.sad.disciplina.model.Disciplina;
import br.com.ifba.sad.perfilusuario.model.PerfilUsuario;
import br.com.ifba.sad.usuario.model.Usuario;
import br.com.ifba.sad.professor.model.Professor;
import java.util.List;

/**
 *
 * @author clebinho
 */
public interface IFacade {

     //=====================PerfilUsuario====================//
     public abstract PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario);
     public abstract PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario);
     public abstract void deletePerfilUsuario(PerfilUsuario perfilUsuario);
     public List<PerfilUsuario> getAllPerfilUsuario();
     public PerfilUsuario findByIdPerfilUsuario(Long id);
     public List<PerfilUsuario> findByNomePerfilUsuario(String nome);
     
     //=====================Usuario====================//
     public abstract Usuario saveUsuario(Usuario usuario);
     public abstract Usuario updateUsuario(Usuario usuario);
     public abstract void deleteUsuario(Usuario usuario);
     public List<Usuario> getAllUsuario();
     public List<Usuario> findByNomeUsuario(String nome);
     public List<Usuario> findByLoginUsuario(String login);
     
     //=====================Professor====================//
     public abstract Professor saveProfessor(Professor professor);
     public abstract Professor updateProfessor(Professor professor);
     public abstract void deleteProfessor(Professor professor);
     public List<Professor> getAllProfessor();
     public Professor findById(Long id);
     public List<Professor> findByNomeProfessor(String nome);
     
     //=====================Disciplina====================//
     public abstract Disciplina saveDisciplina(Disciplina disciplina);
     public abstract Disciplina updateDisciplina(Disciplina disciplina);
     public abstract void deleteDisciplina(Disciplina disciplina);
     public List<Disciplina> getAllDisciplina();
     public List<Disciplina> findByNomeDisciplina(String nome);
}
