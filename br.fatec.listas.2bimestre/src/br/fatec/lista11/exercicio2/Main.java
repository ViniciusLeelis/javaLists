/*

Um vetor com N números inteiros é dado. O índice de equilíbrio deste vetor é o número inteiro
P (com 0 ≤ P < N) e soma dos elementos do vetor com índices inferiores é igual a soma dos
elementos de índices superiores. Isto é:
A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1]
Assumimos que a soma de zero elementos é igual a zero. Isso pode acontecer se P = 0 ou se
P = N-1.
Por exemplo, tendo o seguinte vetor com 7 elementos:
A[0] = -7 A[1] = 1 A[2] = 5 A[3] = 2 A[4] = -4 A[5] = 3 A[6] = 0
Então:
P = 3 é um índice de equilíbrio deste vetor, já que A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
P = 6 também é um índice de equilíbrio deste vetor, já que A[0] + A[1] + A[2] + A[3] + A[4] +
A[5] = 0 e não existem elementos com índices maiores que 6.
Escreva uma função que, dado um vetor A com índices iniciando em zero, com N número
inteiros, retorna qualquer um de seus índices de equilíbrio.
A função deve retornar -1 se o índice de equilíbrio não existir.
 */
package br.fatec.lista11.exercicio2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Main {

	private List valores = new ArrayList<>();
	private List parte1 = new ArrayList<>();
	private List parte2 = new ArrayList<>();
        private List inteiros = new ArrayList<>();
        private int somaParte1 = 0;
	private int somaParte2 = 0;
    
        public static void main(String[] args) {
          new Main();
    }
        
    Main() {
    	String vetor = JOptionPane.showInputDialog(null, "Digite o vetor separado por ,");
    	for(String letra:vetor.split(",")) {
    		inteiros.add(Integer.parseInt(letra));
    		System.out.println(inteiros);
    	}
    	verificar(inteiros);
    	
    }
    
    
	public void verificar(List lista) {
		
			
		int totalSize = inteiros.size();
		int totalPrimeiroSize = lista.size()/2;
		int temporario = 0;
	
		
		System.out.println(totalPrimeiroSize);
		for(int i = 0; i<=totalPrimeiroSize; i++) {
			parte1.add(lista.get(i));
			
		}
		for(int i = totalPrimeiroSize; i<=lista.size(); i++) {
			parte2.add(lista.get(i));
		}
		
		
		
		System.out.println("Parte 1:" + parte1 + "Soma total: ");
		System.out.println("Parte 2:" + parte2 + "Soma total: ");
		System.out.println("Lista total: " + lista);
		
	}
	
	
	

    
    
    
}
