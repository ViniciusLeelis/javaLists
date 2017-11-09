/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista10.exercicio1;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Vinicius Lelis
 */
public class Contatos implements Serializable {
    Salvar salvar;
    Ler ler;
    private ArrayList<Pessoa> contatos = new ArrayList<>();
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
    public ArrayList getContatos(){
        return ler.getContatos();
}

    }

