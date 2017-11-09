package br.fatec.lista8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class lerEmails {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
 
    System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler.nextLine();
 
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArquivo = new BufferedReader(arq);
 
      String linha = lerArquivo.readLine(); 
      while (!linha.isEmpty()) {
          System.out.printf("%s\n", linha); 
        if((linha.contains(" "))) {
            linha = lerArquivo.readLine(); // Problema de loop infinito
            if(linha.isEmpty())
                System.out.println("STOP");
      }}
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Não foi possível abrir o arquivo: %s.\n",
          e.getMessage());
    }
 
    System.out.println();
  }
}