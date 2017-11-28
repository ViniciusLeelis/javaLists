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
    public List<T> contatos;
    private int currentPosition;
    private int collectionSize;
    // gets e sets omitidos.

    public Contatos(List<T> contatos) {
        this.contatos = contatos;
        this.collectionSize = contatos.size();
        this.currentPosition = 0;
    }
    public Contatos() { 
    }
    public void addPessoa(T objeto){
        contatos.add(objeto);
    }
    
    public void excluirPessoa(T pessoa){
       for(T objeto: contatos){
           if(pessoa.toString().equals(objeto))
                contatos.remove(pessoa);
           else
             JOptionPane.showMessageDialog(null, "Não foi encontrado!!");
           
       }

    }
    
    public void salvarContatos(){
        salvar.setSalvar(contatos);
    }
    
    public Object getContatos(){
        return ler.getContatos();
}
    public String returnPessoa() {
        String todas = "";
        for(T objeto:contatos){
            todas = todas + "\n" +  objeto.toString();
        }
        return todas;
    }
    }

