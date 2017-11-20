/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista10.exercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Lelis
 */
public class Salvar extends Thread implements Serializable{
    private HashSet agenda;
    Salvar(){
    }
    public void setSalvar(HashSet salvar){
        this.agenda = salvar;
    }

    @Override
    public void run() {
         try{
		
		FileOutputStream fout = new FileOutputStream("C://Agenda//dados/contatos.bin");
		
		ObjectOutputStream oos = new ObjectOutputStream(fout);   

		oos.writeObject(agenda);
		
		oos.close();
		JOptionPane.showMessageDialog(null, "Agenda salva com sucesso !");
	   }catch(Exception ex){
		   ex.printStackTrace();
	   } 
	}
    }
