    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista10.exercicio2;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_OPTION;

/**
 *
 * @author Admin
 */
public class Main {

    private int Quantidade;
    
        public static void main(String[] args) {
          new Main();
    }
        Main(){
        boolean opcao = false;
            while(!opcao) {
            String texto = JOptionPane.showInputDialog(null, "Digite o texto desejado: ");
            contar(texto);
            int result = JOptionPane.showConfirmDialog(null, "Deseja verificar mais um texto?", "Pergunta", OK_OPTION);
                if(result== OK_OPTION)
                    opcao = false;
                else
                    opcao = true;
            }
        }
        
        public void contar(String texto) {
            for(int i=0; i<texto.length();i++){  
	       char letra = texto.toUpperCase().charAt(i);  
	       String x1 = String.valueOf(letra);  
	       if(x1.equalsIgnoreCase("A") || x1.equalsIgnoreCase("D") || x1.equalsIgnoreCase("O") || x1.equalsIgnoreCase("Q") ||
                       x1.equalsIgnoreCase("R")){ 
                   
		    Quantidade += 1;  
		    }
               else if(x1.equalsIgnoreCase("B")){
                   Quantidade += 2;
               }
            }
            JOptionPane.showMessageDialog(null,"Quantidade de buracos:" + Quantidade);
        }
            
            
        }

