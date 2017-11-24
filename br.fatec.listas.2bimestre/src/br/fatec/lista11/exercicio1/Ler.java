/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista11.exercicio1;

import br.fatec.lista10.exercicio1.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Lelis
 */
public class Ler<t> extends Thread implements Serializable {
    private  Object contatos;
    Ler(){
    }
    public Object getContatos(){
        return contatos;
    }
    
    @Override
    public void run(){
                 try{
		   

		   FileInputStream fin = new FileInputStream("C://Agenda//dados/contatos.bin");

		   ObjectInputStream ois = new ObjectInputStream(fin);
		 
		   contatos = ois.readObject();
		   ois.close();

 
	   }catch(Exception ex){
		   JOptionPane.showMessageDialog(null, "Não foi possível abrir");
	   } 
    }
}
