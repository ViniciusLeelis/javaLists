/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista12.exercicio2;

import javax.swing.JOptionPane;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.net.UnknownHostException;
import java.io.IOException;

/**
 *
 * @author Admin
 */
 public class Cliente {
   public static void main(String[] args) 
         throws UnknownHostException, IOException {
     // dispara cliente
     String nome = JOptionPane.showInputDialog("Digite seu nome: ");
     new Cliente("127.0.0.1", nome, 12345).executa();
   }
   
   private String host;
   private String nome;
   private int porta;
   
   
   public Cliente (String host, String nome, int porta) {
     this.host = host;
     this.nome = nome;
     this.porta = porta;
   }
   public String getNome(){
       return nome;
   }
   
   public void executa() throws UnknownHostException, IOException {
     Socket cliente = new Socket(this.host, this.porta);
     System.out.println("O " + nome + " se conectou ao servidor!");
 
     Recebedor r = new Recebedor(cliente.getInputStream());
     new Thread(r).start();
     
     Scanner teclado = new Scanner(System.in);
     PrintStream saida = new PrintStream(cliente.getOutputStream());
     while (teclado.hasNextLine()) {
       saida.println(nome + ": " + teclado.nextLine());
     }
     
     saida.close();
     teclado.close();
     cliente.close();    
   }
 }