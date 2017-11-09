/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista10.exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Main {
    private String[] alfabeto = {"A" ,"B" , "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"
            ,"U", "V", "W", "X", "Y", "Z"};
    private int temp;
    private String temp2;
    private String temp3;
    private String inicialEspaco = "                              ";
    private String letra;
    private String finals;
        public static void main(String[] args) {
          new Main();
        }
        
        Main(){
            letra = JOptionPane.showInputDialog(null, "Digite uma letra");
            if(letra.length() != 1)
                letra = JOptionPane.showInputDialog(null, "Digite apelas uma letra");
            else
                desenhar(letra);
        }
        
        public void darEspaco(int quantidade) {
            
        }
        public void desenhar(String string){
            String remover;
            String up = string.toUpperCase();
            String printEspaco;
            for(int i=0; !alfabeto[i].equals(up);i++){  
                   char[] espaco = new char[i*2];
                   char esp = ' ';
                   Arrays.fill(espaco, esp);
                   printEspaco = new String(espaco);

                   remover = inicialEspaco.substring (0, inicialEspaco.length() - i);
                   finals = finals + "\n" + remover + alfabeto[i] + printEspaco + alfabeto[i];
                   temp = i;
                   temp2 = printEspaco + "  ";
                   temp3 = remover.substring(0, remover.length() - 1);
                }
                   System.out.println(finals + "\n" + temp3 + up + temp2 + up);
                   
            for(int x= temp; x>=0; x--) {
                   char[] espaco = new char[x+x];
                   char esp = ' ';
                   Arrays.fill(espaco, esp);
                   printEspaco = new String(espaco);  
                   remover = inicialEspaco.substring (0, inicialEspaco.length() - x);                   
                   System.out.println(remover + alfabeto[x] + printEspaco + alfabeto[x]);
            }
            
            }
        }

