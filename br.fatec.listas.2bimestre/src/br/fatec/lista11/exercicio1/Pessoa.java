/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista11.exercicio1;

import br.fatec.lista10.exercicio1.*;

/**
 *
 * @author Vinicius Lelis
 */
public class Pessoa implements Comparable<Pessoa>{
    String nome;
    String email;
    String telefone;
    Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        return nome.compareTo(o.getNome());
    }
    @Override
    public String toString(){
        return "\n  Nome: " + nome + " email: " + email + " telefone: " + telefone;
    }
   
}
