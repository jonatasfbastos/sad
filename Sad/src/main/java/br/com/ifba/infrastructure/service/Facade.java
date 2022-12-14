/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.service;

import br.com.ifba.aluno.model.Aluno;
import br.com.ifba.aluno.service.IServiceAluno;
import br.com.ifba.disciplina.model.Disciplina;
import br.com.ifba.disciplina.service.IServiceDisciplina;
import br.com.ifba.perfilusuario.model.PerfilUsuario;
import br.com.ifba.perfilusuario.service.IServicePerfilUsuario;
import br.com.ifba.usuario.model.Usuario;
import br.com.ifba.usuario.service.IServiceUsuario;
import br.com.ifba.professor.model.Professor;
import br.com.ifba.professor.service.IServiceProfessor;
import br.com.ifba.curso.model.Curso;
import br.com.ifba.curso.service.IServiceCurso;
import br.com.ifba.etapacurso.model.EtapaCurso;
import br.com.ifba.etapacurso.service.IServiceEtapaCurso;
import br.com.ifba.formulario.model.Formulario;
import br.com.ifba.formulario.service.IServiceFormulario;
import br.com.ifba.questao.model.Questao;
import br.com.ifba.questao.service.IServiceQuestao;
import br.com.ifba.modalidadecurso.model.Modalidade;
import br.com.ifba.modalidadecurso.service.IServiceModalidade;
import br.com.ifba.tipoturma.model.TipoTurma;
import br.com.ifba.tipoturma.service.IServiceTipoTurma;
import br.com.ifba.turma.model.Turma;
import br.com.ifba.turma.service.IServiceTurma;
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

    /*
    @Override
    public List<Usuario> findByNomeUsuario(String nome) {
        return serviceUsuario.findByNome(nome);
    }
     */
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

    //===================EtapaCurso==================//
    @Autowired
    private IServiceEtapaCurso serviceEtapaCurso;

    @Override
    public EtapaCurso saveEtapaCurso(EtapaCurso etapa) {
        return serviceEtapaCurso.saveEtapaCurso(etapa);
    }

    @Override
    public EtapaCurso updateEtapaCurso(EtapaCurso etapa) {
        return serviceEtapaCurso.updateEtapaCurso(etapa);
    }

    @Override
    public void deleteEtapaCurso(EtapaCurso etapa) {
        serviceEtapaCurso.deleteEtapaCurso(etapa);
    }

    @Override
    public List<EtapaCurso> getAllEtapaCurso() {
        return serviceEtapaCurso.getAllEtapaCurso();
    }

    @Override
    public EtapaCurso findByIdEtapaCurso(Long id) {
        return serviceEtapaCurso.findById(id);
    }

    @Override
    public List<EtapaCurso> findByNomeEtapaCurso(String nome) {
        return serviceEtapaCurso.findByNome(nome);
    }

    //===================Aluno==================//
    @Autowired
    private IServiceAluno serviceAluno;

    @Override
    public Aluno saveAluno(Aluno aluno) {
        return serviceAluno.saveAluno(aluno);
    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        return serviceAluno.updateAluno(aluno);
    }

    @Override
    public void deleteAluno(Aluno aluno) {
        serviceAluno.deleteAluno(aluno);
    }

    @Override
    public List<Aluno> findByNomeAluno(String nome) {
        return serviceAluno.findByNome(nome);
    }

    @Override
    public List<Aluno> getAllAluno() {
        return serviceAluno.getAllaluno();
    }

    @Override
    public Aluno findByIdAluno(Long id) {
        return serviceAluno.findById(id);
    }

    //===================Formulario==================//
    @Autowired
    private IServiceFormulario serviceFormulario;

    @Override
    public Formulario saveFormulario(Formulario formulario) {
        return serviceFormulario.saveFormulario(formulario);
    }

    @Override
    public Formulario updateFormulario(Formulario formulario) {
        return serviceFormulario.updateFormulario(formulario);
    }

    @Override
    public void deleteFormulario(Formulario formulario) {
        serviceFormulario.deleteFormulario(formulario);
    }

    @Override
    public List<Formulario> findByTituloFormulario(String titulo) {
        return serviceFormulario.findByTitulo(titulo);
    }

    @Override
    public List<Formulario> getAllFormulario() {
        return serviceFormulario.getAllFormulario();
    }

    @Override
    public Formulario findByIdFormulario(Long id) {
        return serviceFormulario.findById(id);
    }
    
    //=====================Questao===================//
    @Autowired
    private IServiceQuestao serviceQuestao;
    
    @Override
    public Questao saveQuestao (Questao questao) {
        return serviceQuestao.saveQuestao(questao);
    }

    @Override
    public Questao updateQuestao (Questao questao) {
        return serviceQuestao.updateQuestao(questao);
    }

    @Override
    public void deleteQuestao (Questao questao) {
        serviceQuestao.deleteQuestao(questao);
    }

    @Override
    public List<Questao> findByEnunciadoQuestao (String enunciado) {
        return serviceQuestao.findByEnunciado(enunciado);
    }

    @Override
    public List<Questao> getAllQuestao() {
        return serviceQuestao.getAllQuestao();
    }

    @Override
    public Questao findByIdQuestao(Long id) {
        return serviceQuestao.findById(id);
    }
    
    //===================TipoTurma==================//
    @Autowired
    IServiceTipoTurma serviceTipoTurma;
    
    @Override
    public TipoTurma saveTipoTurma(TipoTurma tipoTurma) {
        return serviceTipoTurma.saveTipoTurma(tipoTurma);
    }
    
    @Override
    public TipoTurma updateTipoTurma(TipoTurma tipoTurma) {
         return serviceTipoTurma.updateTipoTurma(tipoTurma);
    }
    
    @Override
    public void deleteTipoTurma(TipoTurma tipoTurma) {
         serviceTipoTurma.deleteTipoTurma(tipoTurma);
    }
    
    @Override
    public List<TipoTurma> findByNome(String nome) {
        return  serviceTipoTurma.findByNome(nome);
    }
    
    @Override
    public List<TipoTurma> getAllTipoTurma() {
        return  serviceTipoTurma.getAllTipoTurma();
    }
    
    @Override
    public TipoTurma findByIdTipoTurma(Long id){ 
        return  serviceTipoTurma.findById(id);
    }
    
}
