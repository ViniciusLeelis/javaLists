/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista10.exercicio1;

import javax.swing.JFrame;

/**
 *
 * @author Vinicius Lelis
 */
public class Main extends JFrame{
    String ola;
    Contatos contatos;
    public static void main(String[] args) {
        new Main();
    }

    public Main()   { 
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
}

