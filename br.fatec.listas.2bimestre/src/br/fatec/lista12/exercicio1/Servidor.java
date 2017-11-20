/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista12.exercicio1;

/**
 *
 * @author Admin
 */
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
 
 public class Servidor {
   public static void main(String args[]) throws IOException {
     String SPort = JOptionPane.showInputDialog(null, "Digite a porta do servidor");
     int porta = Integer.parseInt(SPort);
     ServerSocket servidor = new ServerSocket(porta);
     JOptionPane.showMessageDialog(null, "Servidor ativado na porta: " + SPort);

     Socket pessoa = servidor.accept();
     System.out.println("Nova conexão com o cliente " +   
     pessoa.getInetAddress().getHostAddress()
     );
     Scanner scanner = new Scanner(pessoa.getInputStream());
     while (scanner.hasNextLine()) {
       System.out.println(scanner.nextLine());
     }
     
     scanner.close();
     servidor.close();
     pessoa.close();
   }
 }
