/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.modalidadecurso.dao;

import br.com.ifba.modalidadecurso.model.Modalidade;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kennedy
 */
@Repository
public interface IModalidadeDao extends JpaRepository<Modalidade, Long> {
    public abstract List <Modalidade> findByNome(String nome);
}
