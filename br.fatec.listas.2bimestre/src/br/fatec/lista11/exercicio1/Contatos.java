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
import java.util.Vector;
import java.util.function.Predicate;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Lelis
 */
public class Contatos implements Serializable, Comparable<Pessoa> {
    Salvar salvar;
    Ler ler;
    private Set contatos;
        

    private int currentPosition;
    private int collectionSize;
    // gets e sets omitidos.

    public Contatos(Set contatos) {
        this.contatos = contatos;
        this.collectionSize = contatos.size();
        this.currentPosition = 0;
    }
    public Contatos() { 
    }
    public void addPessoa(Object objeto){
        contatos.add(objeto);
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

    @Override
    public int compareTo(Pessoa o) {
        return o.nome.compareTo(o.getNome());
       
    }



    

    }

