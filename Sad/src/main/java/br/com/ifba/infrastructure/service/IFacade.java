/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.service;

import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.disciplina.model.Disciplina;
import br.com.ifba.perfilusuario.model.PerfilUsuario;
import br.com.ifba.usuario.model.Usuario;
import br.com.ifba.professor.model.Professor;
import br.com.ifba.curso.model.Curso;
import br.com.ifba.etapacurso.model.EtapaCurso;
import br.com.ifba.formulario.model.Formulario;
import br.com.ifba.modalidadecurso.model.Modalidade;
import br.com.ifba.turma.model.Turma;
import br.com.ifba.questao.model.Questao;
import br.com.ifba.tipoturma.model.TipoTurma;
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
    //public List<Usuario> findByNomeUsuario(String nome);
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

    //======================Curso=====================//
    public abstract Curso saveCurso(Curso curso);
    public abstract Curso updateCurso(Curso curso);
    public abstract void deleteCurso(Curso curso);
    public List<Curso> getAllCurso();
    public Curso findByIdCurso(Long id);
    public List<Curso> findByNomeCurso(String nome);

    //===================Modalidade==================//
    public abstract Modalidade saveModalidade(Modalidade modalidade);
    public abstract Modalidade updateModalidade(Modalidade modalidade);
    public abstract void deleteModalidade(Modalidade modalidade);
    public List<Modalidade> getAllModalidade();
    public Modalidade findByIdModalidade(Long id);
    public List<Modalidade> findByNomeModalidade(String nome);

    //===================Turma==================//
    public abstract Turma saveTurma(Turma turma);
    public abstract Turma updateTurma(Turma turma);
    public abstract void deleteTurma(Turma turma);
    public List<Turma> getAllTurma();
    public Turma findByIdTurma(Long id);
    public List<Turma> findByNomeTurma(String nome);

    //===================EtapaCurso==================//
    public abstract EtapaCurso saveEtapaCurso(EtapaCurso etapa);
    public abstract EtapaCurso updateEtapaCurso(EtapaCurso etapa);
    public abstract void deleteEtapaCurso(EtapaCurso etapa);
    public List<EtapaCurso> getAllEtapaCurso();
    public EtapaCurso findByIdEtapaCurso(Long id);
    public List<EtapaCurso> findByNomeEtapaCurso(String nome);

    //===================Aluno==================//
    public abstract Aluno saveAluno(Aluno aluno);
    public abstract Aluno updateAluno(Aluno aluno);
    public abstract void deleteAluno(Aluno aluno);
    public List<Aluno> getAllAluno();
    public List<Aluno> findByNomeAluno(String nome);
    public Aluno findByIdAluno(Long id);

    //===================Formulario==================//
    public Formulario saveFormulario(Formulario formulario);
    public Formulario updateFormulario(Formulario formulario);
    public void deleteFormulario(Formulario formulario);
    public List<Formulario> findByTituloFormulario(String titulo);
    public List<Formulario> getAllFormulario();
    public Formulario findByIdFormulario(Long id);
    
    //===================Questao==================//
    public Questao saveQuestao(Questao questao);
    public Questao updateQuestao(Questao questao);
    public void deleteQuestao(Questao questao);
    public List<Questao> findByEnunciadoQuestao(String enunciado);
    public List<Questao> getAllQuestao();
    public Questao findByIdQuestao(Long id);
    
    //===================TipoTurma==================//
    public TipoTurma saveTipoTurma(TipoTurma tipoTurma);
    public TipoTurma updateTipoTurma(TipoTurma tipoTurma);
    public void deleteTipoTurma(TipoTurma tipoTurma);
    public List<TipoTurma> findByNome(String nome);
    public List<TipoTurma> getAllTipoTurma();
    public TipoTurma findByIdTipoTurma(Long id);
}
