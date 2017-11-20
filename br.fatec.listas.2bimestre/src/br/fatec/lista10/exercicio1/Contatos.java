/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista10.exercicio1;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Lelis
 */
public class Contatos<T> implements Serializable {
    Salvar salvar;
    Ler ler;
    private HashSet<Pessoa> contatos = new HashSet<>();  // Professor, eu não entendi o uso do Array<T>
                                                        // então resolvi implementar outra coisa pra treinar

    public Contatos() { 
    }
    public void addPessoa(Pessoa pessoa){
        contatos.add(pessoa);
    }
    public void excluirPessoa(Pessoa pessoa){

       contatos.remove(pessoa);
    }
    public void salvarContatos(){
        salvar.setSalvar(contatos);
    }
    public HashSet getContatos(){
        return ler.getContatos();
}

    }

