/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista10.exercicio1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Lelis
 */
public class Ler extends Thread implements Serializable {
    private ArrayList contatos;
    Ler(){
    }
    public ArrayList getContatos(){
        return contatos;
    }
    
    @Override
    public void run(){
                 try{
		   

		   FileInputStream fin = new FileInputStream("C://Agenda//dados/contatos.bin");

		   ObjectInputStream ois = new ObjectInputStream(fin);
		 
		   contatos = (ArrayList) ois.readObject();
		   ois.close();

 
	   }catch(Exception ex){
		   JOptionPane.showMessageDialog(null, "Não foi possível abrir");
	   } 
    }
}
