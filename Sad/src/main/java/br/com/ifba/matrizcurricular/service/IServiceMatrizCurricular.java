/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.matrizcurricular.service;

import br.com.ifba.matrizcurricular.model.MatrizCurricular;
import java.util.List;

/**
 *
 * @author João P. Arquim
 */
public interface IServiceMatrizCurricular {
    
    public MatrizCurricular saveMatrizCurricular(MatrizCurricular matrizCurricular);
    public MatrizCurricular updateMatrizCurricular(MatrizCurricular matrizCurricular);
    public void deleteMatrizCurricular(MatrizCurricular matrizCurricular);
    public List<MatrizCurricular> getAllMatrizCurricular();
    public List<MatrizCurricular> findByNome(String nome);
    public MatrizCurricular findById(Long id);
    
}
