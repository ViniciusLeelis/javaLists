package br.fatec.lista13;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Main extends JFrame {

    private ArrayList <String> txtPessoas = new ArrayList<>();
    private ArrayList <String> txtEventos = new ArrayList<>();
    private Contatos contatos = new Contatos();
    private Agenda agenda = new Agenda();
    
    private JTextField tNome = new JTextField(20);
    private JTextField tEndereco = new JTextField(20);
    private JTextField tEmail = new JTextField(20);
    private JTextField tTelefone = new JTextField(20);
    private JTextField tRG = new JTextField(20);   
    private JButton bGravar = new JButton("Gravar");
    private JButton bDeletar = new JButton("Deletar");
    private JButton bAlterar = new JButton("Alterar");
    private JButton bProcurar = new JButton("Procurar");
    private JButton bLimpar = new JButton("Limpar");
    private JButton bSair = new JButton("Sair");
    private JButton bSelecionaE = new JButton("<<");
    private JButton bSelecionaD = new JButton(">>");
    private JLabel lTitulo = new JLabel("Contatos e Eventos SIMPLES");
    private JLabel lNome = new JLabel("Nome:");
    private JLabel lEndereco = new JLabel("Endereço:");
    private JLabel lEmail = new JLabel("Email:");
    private JLabel lTelefone = new JLabel("Telefone:");
    private JLabel lRG = new JLabel("RG:");    
    
    public Main(){

        super ("Adicionar Contato");
        JPanel p1 = new JPanel(null);
      

        DefaultListModel modelo = new DefaultListModel();
        JList lista = new JList();
        JScrollPane scroll = new JScrollPane(lista);

        lTitulo.setFont(new Font("Dialog", Font.PLAIN, 20));

        p1.add(lTitulo);
        p1.add(lNome);
        p1.add(tNome);
        p1.add(lEndereco);
        p1.add(tEndereco);
        p1.add(lEmail);
        p1.add(tEmail);
        p1.add(lTelefone);
        p1.add(tTelefone);
        p1.add(lRG);
        p1.add(tRG);
        p1.add(bGravar);
        p1.add(bDeletar);
        p1.add(bAlterar);
        p1.add(bSelecionaE);
        p1.add(bProcurar);
        p1.add(bSelecionaD);
        p1.add(bLimpar);
        p1.add(bSair);
        p1.add(scroll);
        

        add(p1);

        lista.setModel(modelo);

        lTitulo.setBounds(140, 20, 200, 80);
        lNome.setBounds(40, 130, 100, 25);
        tNome.setBounds(90, 130, 350, 25);
        lEndereco.setBounds(15, 180, 100, 25);
        tEndereco.setBounds(90, 180, 350, 25);
        lEmail.setBounds(45, 230, 100, 25);
        tEmail.setBounds(90, 230, 350, 25);
        lTelefone.setBounds(20, 280, 100, 25);
        tTelefone.setBounds(90, 280, 350, 25);
        lRG.setBounds(20, 330, 100, 25);
        tRG.setBounds(90, 330, 350, 25);
        bGravar.setBounds(60, 370, 100, 23);
        bDeletar.setBounds(200, 370, 100, 23);
        bAlterar.setBounds(340, 370, 100, 23);
        bSelecionaE.setBounds(60, 420, 100, 23);
        bProcurar.setBounds(200, 420, 100, 23);
        bSelecionaD.setBounds(340, 420, 100, 23);
        bLimpar.setBounds(200, 510, 100, 23);
        bSair.setBounds(340, 510, 100, 23);
        scroll.setBounds(540, 90, 400, 400);


        setSize(1100, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //AÇÕES DE BUTÕES

        bGravar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                    Pessoa pessoa = new Pessoa(tNome.getText(), tEndereco.getText(), tTelefone.getText(), tEmail.getText(), tRG.getText());
                    contatos.addPessoa(pessoa);
                    modelo.addElement(pessoa.toStr());
                    cleanCamps();
                }

        });


    }
    public void cleanCamps(){
        tNome.setText("");
        tEndereco.setText("");
        tTelefone.setText("");
        tEmail.setText("");
        tRG.setText("");
    }
    
    public void addEventoGUI(){
        
    }
    public void mainScreenGUI(){
        
    }
    

    public static void main (String args[]){
        new Main();
    }
}
