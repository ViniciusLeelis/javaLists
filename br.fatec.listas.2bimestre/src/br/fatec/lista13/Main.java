package br.fatec.lista13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart;
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

    
    
    
    // Tab Eventos
    private JButton eventoGravar = new JButton("Gravar");
    private JButton eventoAlterar = new JButton("Alterar");
    private JButton eventoProcurar = new JButton("Procurar");
    private JButton eventoLimpar = new JButton("Limpar");
    private JButton eventoSair = new JButton("Sair");
    private JButton eventoDeletar = new JButton("Deletar");
    private JButton eventoSelecionarE = new JButton("<<");
    private JButton eventoSelecionarD = new JButton(">>");    
    private JTextField eventoNome = new JTextField(20);
    private JTextField eventoDescricao = new JTextField(20);
    private JTextField eventoData = new JTextField(20);
    private JTextField eventoEndereco = new JTextField(20);
    private JLabel eventoTitulo = new JLabel("Eventos");
    private JLabel eventoLNome = new JLabel("Nome:");
    private JLabel eventoLEndereco = new JLabel("Endereço:");
    private JLabel eventoLData = new JLabel("Data: ");
    private JLabel eventoLDescricao = new JLabel("Descricao:");
    // // // // / / / / / / / / // / / / /
    
    //Tab contatos
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
        super ("Contatos e Eventos for Zombies");
        JPanel addContato = new JPanel(null);
        JPanel addEvento = new JPanel(null);
        JTabbedPane jTab = new JTabbedPane();
        jTab.addTab("Contatos", addContato);
        jTab.addTab("Eventos", addEvento);
        DefaultListModel modeloContatos = new DefaultListModel();
        DefaultListModel modeloEventos = new DefaultListModel();
        
        JList listaContatos = new JList();
        JList listaEventos = new JList();
       
        JScrollPane scrollContatos = new JScrollPane(listaContatos);
        JScrollPane scrollEventos = new JScrollPane(listaEventos);

        
        lTitulo.setFont(new Font("Dialog", Font.PLAIN, 20));
        // Aba de Adicionar Contato
        addContato.add(lTitulo);
        addContato.add(lNome);
        addContato.add(tNome);
        addContato.add(lEndereco);
        addContato.add(tEndereco);
        addContato.add(lEmail);
        addContato.add(tEmail);
        addContato.add(lTelefone);
        addContato.add(tTelefone);
        addContato.add(lRG);
        addContato.add(tRG);
        addContato.add(bGravar);
        addContato.add(bDeletar);
        addContato.add(bAlterar);
        addContato.add(bSelecionaE);
        addContato.add(bProcurar);
        addContato.add(bSelecionaD);
        addContato.add(bLimpar);
        addContato.add(bSair);
        addContato.add(scrollContatos);
        addContato.setBackground(Color.WHITE);
        // -------------
        
        // Aba de Adicionar Evento 

        eventoTitulo.setFont(new Font("Dialog", Font.PLAIN, 20));             
        addEvento.add(eventoTitulo);
        addEvento.add(eventoLNome);
        addEvento.add(eventoNome);
        addEvento.add(eventoLEndereco);
        addEvento.add(eventoEndereco);
        addEvento.add(eventoLData);
        addEvento.add(eventoData);
        addEvento.add(eventoDescricao);
        addEvento.add(eventoLDescricao);
        addEvento.add(eventoGravar);
        addEvento.add(eventoDeletar);
        addEvento.add(eventoAlterar);
        addEvento.add(eventoSelecionarE);
        addEvento.add(eventoSelecionarD);
        addEvento.add(eventoProcurar);
        addEvento.add(eventoLimpar);
        addEvento.add(eventoSair);
        addEvento.add(scrollEventos);
        addEvento.setBackground(Color.WHITE);      
        getContentPane().add(jTab, BorderLayout.CENTER);
        
        listaEventos.setModel(modeloEventos);
        listaContatos.setModel(modeloContatos);
        
        //TAB CONTATOS
        lTitulo.setBounds(140, 20, 200, 80);
        lTitulo.setForeground(Color.BLACK);
        lNome.setBounds(40, 130, 100, 25);
        lNome.setForeground(Color.BLACK);
        tNome.setBounds(90, 130, 350, 25);
        lEndereco.setBounds(15, 180, 100, 25);
        lEndereco.setForeground(Color.BLACK);
        tEndereco.setBounds(90, 180, 350, 25);
        lEmail.setBounds(45, 230, 100, 25);
        lEmail.setForeground(Color.BLACK);
        tEmail.setBounds(90, 230, 350, 25);
        lTelefone.setBounds(20, 280, 100, 25);
        lTelefone.setForeground(Color.BLACK);
        tTelefone.setBounds(90, 280, 350, 25);
        lRG.setBounds(20, 330, 100, 25);
        lRG.setForeground(Color.BLACK);
        tRG.setBounds(90, 330, 350, 25);
        bGravar.setBounds(60, 370, 100, 23);
        bGravar.setBackground(new Color(155,201,149));
        bDeletar.setBounds(200, 370, 100, 23);
        bDeletar.setBackground(new Color(203,133,137));
        bAlterar.setBounds(340, 370, 100, 23);
        bAlterar.setBackground(new Color(255,191,105));
        bSelecionaE.setBounds(60, 420, 100, 23);
        bProcurar.setBounds(200, 420, 100, 23);
        bSelecionaD.setBounds(340, 420, 100, 23);
        bLimpar.setBounds(200, 510, 100, 23);
        bSair.setBounds(340, 510, 100, 23);
        scrollContatos.setBounds(540, 90, 400, 400);
        // // // // // / / / / / / / / / / / / /
        
        
        // TAB EVENTOS
        eventoTitulo.setBounds(140, 20, 200, 80);
        eventoTitulo.setForeground(Color.BLACK);
        eventoLNome.setBounds(40, 130, 100, 25);
        eventoLNome.setForeground(Color.BLACK);
        eventoNome.setBounds(90, 130, 350, 25);
        eventoLEndereco.setBounds(15, 180, 100, 25);
        eventoLEndereco.setForeground(Color.BLACK);
        eventoEndereco.setBounds(90, 180, 350, 25);
        eventoLData.setBounds(45, 230, 100, 25);
        eventoLData.setForeground(Color.BLACK);
        eventoData.setBounds(90, 230, 350, 25);        
        eventoLDescricao.setBounds(20, 280, 100, 25);
        eventoLDescricao.setForeground(Color.BLACK);
        eventoDescricao.setBounds(90, 280, 350, 25);
        eventoGravar.setBounds(60, 370, 100, 23);
        eventoGravar.setBackground(new Color(155,201,149));
        eventoDeletar.setBounds(200, 370, 100, 23);
        eventoDeletar.setBackground(new Color(203,133,137));
        eventoAlterar.setBounds(340, 370, 100, 23);
        eventoAlterar.setBackground(new Color(255,191,105));
        eventoSelecionarE.setBounds(60, 420, 100, 23);
        eventoProcurar.setBounds(200, 420, 100, 23);
        eventoSelecionarD.setBounds(340, 420, 100, 23);
        eventoLimpar.setBounds(200, 510, 100, 23);
        eventoSair.setBounds(340, 510, 100, 23);
        scrollEventos.setBounds(540,90,400,400);
        
        
        
        
        
        
        setSize(1000, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //AÇÕES DOS BOTÕES DA ABA CONTATO

        bGravar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                    Pessoa pessoa = new Pessoa(tNome.getText(), tEndereco.getText(), tTelefone.getText(), tEmail.getText(), tRG.getText());
                    contatos.addPessoa(pessoa);
                    modeloContatos.addElement(pessoa.toString());
                    cleanCamp(tNome); cleanCamp(tEndereco) ; cleanCamp(tTelefone); cleanCamp(tEmail); cleanCamp(tRG);
                }

        });

        bAlterar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String pesquisa = JOptionPane.showInputDialog(null, "Digite o RG do contato");
                for(Pessoa p: contatos.contatos) {
                    if(p.getRG().equals(pesquisa)){
                        String nome = JOptionPane.showInputDialog(null, "Digite o novo nome: ");
                        p.setNome(nome);
                        String endereco = JOptionPane.showInputDialog(null, "Digite o novo endereco: ");
                        p.setEndereco(endereco);
                        String telefone = JOptionPane.showInputDialog(null, "Digite o novo telefone: ");
                        p.setTelefone(telefone);
                        String email = JOptionPane.showInputDialog(null, "Digite o novo email: "); 
                        p.setEmail(email);
                        cleanCamp(tNome); cleanCamp(tEndereco) ; cleanCamp(tTelefone); cleanCamp(tEmail); cleanCamp(tRG);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "nenhum usuário encontrado");
                    }
                }
                    

                }

        });
        
        bDeletar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    String rg = JOptionPane.showInputDialog("Digite o RG");
                    for(Pessoa pessoa: contatos.contatos) {
                        if(rg.equals(pessoa.getRG())) {
                            JOptionPane.showMessageDialog(null, "Contato: " + pessoa.getNome() + " removido !");
                            contatos.contatos.remove(pessoa);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "RG não encontrado");
                            
                    }}
                    
                }

        });
        
       //AÇÕES DOS BOTÕES DA ABA EVENTOS

        eventoGravar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    
                    Evento evento = new Evento(eventoNome.getText(), eventoDescricao.getText(), eventoEndereco.getText(), (contatos.contatos.size() + 1));

                    try {
                        evento.toData(eventoData.getText());
                        agenda.addEvento(evento);
                        cleanCamp(eventoNome); cleanCamp(eventoEndereco) ; cleanCamp(eventoData); cleanCamp(eventoDescricao);
                        modeloEventos.addElement(evento.toString());

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Insira a data com: dd/MM/yyyy");
                }


                }

        });
        
        eventoAlterar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String pesquisa = JOptionPane.showInputDialog(null, "Digite o ID do evento:");
                
                for(Evento e: agenda.eventos) {
                    if(e.getId().equals(pesquisa)){
                        String nome = JOptionPane.showInputDialog(null, "Digite o novo nome: ");
                        e.setNome(nome);
                        String endereco = JOptionPane.showInputDialog(null, "Digite a nova Descrição: ");
                        e.setDescricao(endereco);
                        String telefone = JOptionPane.showInputDialog(null, "Digite o novo telefone: ");
                        e.setEndereco(telefone);
                        String email = JOptionPane.showInputDialog(null, "Digite o novo email: "); 

                        cleanCamp(tNome); cleanCamp(tEndereco) ; cleanCamp(tTelefone); cleanCamp(tEmail); cleanCamp(tRG);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "nenhum usuário encontrado");
                    }
                }
                    

                }

        });
        
        bDeletar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    String rg = JOptionPane.showInputDialog("Digite o ID");
                    for(Pessoa pessoa: contatos.contatos) {
                        if(rg.equals(pessoa.getRG())) {
                            JOptionPane.showMessageDialog(null, "Contato: " + pessoa.getNome() + " removido !");
                            contatos.contatos.remove(pessoa);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "RG não encontrado");
                            
                    }}
                    
                }

        });


    }
    public void cleanCamp(JTextField camp){
        camp.setText("");
    }
    

    

    public static void main (String args[]){
        new Main();
    }
}
