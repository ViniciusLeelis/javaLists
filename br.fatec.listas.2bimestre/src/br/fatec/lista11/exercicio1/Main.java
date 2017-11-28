/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista11.exercicio1;

import br.fatec.lista10.exercicio1.*;
import javax.swing.JOptionPane;
import br.fatec.lista10.exercicio1.Contatos;
/**
 *
 * @author Admin
 */
public class Main {
        ContatosSet contatos = new ContatosSet();
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
        salvarAgenda();
    }
    private void mostrarContatos(){
        carregarAgenda();
        for(Object obj: contatos.contatos) {
            System.out.println(contatos.toString());
    }

    }
    private void excluirContato() {
      String contact = JOptionPane.showInputDialog(null, "Digite o nome do contato");
      for(Object x: contatos.contatos) {
          if(x.toString().equals(contact)){
              contatos.contatos.remove(x);
          }
          else
              JOptionPane.showMessageDialog(null, "Nada foi encontrado :C");
      }
      salvarAgenda();
    }
    private void carregarAgenda(){
       contatos.getContatos();
    }
    private void salvarAgenda() {
       contatos.salvarContatos();
    }
}
