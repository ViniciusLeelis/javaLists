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
    private List inteiros = new ArrayList<>();
 
        public static void main(String[] args) {
          new Main();
    }
        Main() {
            /*String vetor = JOptionPane.showInputDialog(null, "Digite o vetor desejado, separando por uma vírgula");
            for(String letra:vetor.split(",")){
                inteiros.add(letra);
            }
            int valorDoMeio = (int) inteiros.get((inteiros.size()/2)+1); */
                    int notas[] = {15,63,23,99,58,52,98};

        /*****************************************************
         *            ENCONTRANDO O VALOR DO MEIO 
         *****************************************************/

        int valorDoMeio = notas[(notas.length/2)+1]; //O mais um é por que ele vai arredondar pra baixo;



        /*****************************************************
         *            ENCONTRANDO O VALOR MEDIANO 
         *****************************************************/

        // O ideal é iniciar os contadores com o primeiro valor, aí vamos modificando de acordo com a necessidade
        int menor = notas[0];
        int maior = notas[0];


        for(int i =0; i < notas.length; i++){
            if(notas[i] < menor)
                menor = notas[i];

            if(notas[i] > maior)
                maior = notas[i];
        }
        int valorMediano = (maior + menor) /2;
        }
}
