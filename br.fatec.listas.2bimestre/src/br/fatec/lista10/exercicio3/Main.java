/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista10.exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Main {
    private String[] alfabeto = {"A" ,"B" , "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"
            ,"U", "V", "W", "X", "Y", "Z"};
    private String letra;
        public static void main(String[] args) {
          new Main();
        }
        
        Main(){
            letra = JOptionPane.showInputDialog(null, "Digite uma letra");
            if(letra.length() > 2)
                letra = JOptionPane.showInputDialog(null, "Digite apelas uma letra");
            else
                desenhar(letra);
        }
        public void desenhar(String string){
            for(int i = 0; i<=alfabeto.length; i++) {
                if(!alfabeto[i].equalsIgnoreCase(string)) {
                    System.out.println(alfabeto[i]);
                }
            }
        }
}
