/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista12.exercicio2;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Recebedor implements Runnable {
 
   private InputStream servidor;
 
   public Recebedor(InputStream servidor) {
     this.servidor = servidor;
   }
 
   public void run() {

     Scanner s = new Scanner(this.servidor);
     while (s.hasNextLine()) {
       System.out.println(s.nextLine());
     }
   }
 }