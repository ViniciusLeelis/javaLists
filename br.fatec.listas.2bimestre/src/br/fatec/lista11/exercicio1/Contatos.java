/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista11.exercicio1;

import br.fatec.lista10.exercicio1.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Lelis
 */
public class Contatos<T> implements Serializable, Comparable {
    Salvar salvar;
    Ler ler;
    private Set<T> contatos;
    private int currentPosition;
    private int collectionSize;
    // gets e sets omitidos.

    public Contatos(Set<T> contatos) {
        this.contatos = contatos;
        this.collectionSize = contatos.size();
        this.currentPosition = 0;
    }
    public Contatos() { 
    }
    public void addPessoa(Object objeto){
        contatos.add((T) objeto);
    }
    public void excluirPessoa(Pessoa pessoa){

       contatos.remove(pessoa);
    }
    public void salvarContatos(){
        
        salvar.setSalvar(contatos);
    }
    public Object getContatos(){
        
        return ler.getContatos();
}

   
    public interface Comparable {
        int compareTo(<T>);
    }

    }

