/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista13;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Admin
 */
public class Contatos {
    ArrayList<Pessoa> contatos;

    Contatos(){
        contatos = new ArrayList<>();
    }
    public void addPessoa(Pessoa pessoa) {
        contatos.add(pessoa);
    }
    public void removePessoa(Pessoa p){
        contatos.remove(p);
            
        }        
    
	public Pessoa getPessoa(Pessoa pessoa) {
		return pessoa;
	
	}

    }



