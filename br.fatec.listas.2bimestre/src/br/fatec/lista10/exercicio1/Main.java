
package br.fatec.lista10.exercicio1;

import javax.swing.JOptionPane;
import br.fatec.lista10.exercicio1.Contatos;
/**
 * Professor Gerson, fiquei totalmente perdido nesse exercício da lista, estão incompletos: Esse exercício, e o exercicio 2 da lista 11
 * 
 */
public class Main {
        Contatos contatos = new Contatos();
        public static void main(String[] args) {
          new Main();
    }
    Main() {
        String opcao = JOptionPane.showInputDialog(null, "Digite a opção desejada: \n (1) Add Contato \n (2) Mostrar contatos  \n (3) Excluir Contato");
        int option = Integer.parseInt(opcao);
        
        switch( option ) {
            case 1:
                    saveContato();
                    salvarAgenda();
                    break;

            case 2:
                    mostrarContatos();
                    carregarAgenda();
                    break;

            case 3:
                    excluirContato();
                    salvarAgenda();
                    break;

            default:
                opcao = JOptionPane.showInputDialog(null, "Digite a opção desejada: \n (1) Add Contato \n (2) Mostrar contatos (3) Excluir Contato");
                option = Integer.parseInt(opcao);
        }
            }
    
    private void saveContato() {
        Pessoa pessoa;
        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ");
        String email = JOptionPane.showInputDialog(null, "Digite o email: ");
        String telefone = JOptionPane.showInputDialog(null, "Digite o telefone: ");
        pessoa = new Pessoa(nome, email, telefone);
        contatos.addPessoa(pessoa);
    }
    private void mostrarContatos(){
        /// ??????

    }
    private void excluirContato() {
      
    }
    private void carregarAgenda(){
       contatos.getContatos();
    }
    private void salvarAgenda() {
       contatos.salvarContatos();
    }
}
