package br.fatec.lista13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

  

public class Main extends JFrame {

    private ArrayList <String> txtPessoas = new ArrayList<>();
    private ArrayList <String> txtEventos = new ArrayList<>();
    private Contatos contatos = new Contatos();
    private Agenda agenda = new Agenda();
    
    private JTextField tNome = new JTextField(20);
    private JTextField tEndereco = new JTextField(20);
    private JTextField tEmail = new JTextField(20);
    private JFormattedTextField tTelefone;
    private JFormattedTextField tRG;   
    private JButton bGravar = new JButton("Gravar");

    
    
    
    // Tab Eventos
    private JButton eventoGravar = new JButton("Gravar");
    private JButton eventoAlterar = new JButton("Alterar");
    private JButton eventoLimpar = new JButton("Limpar");
    private JButton eventoSair = new JButton("Sair");
    private JButton eventoDeletar = new JButton("Deletar");   
    private JTextField eventoNome = new JTextField(20);
    private JTextField eventoDescricao = new JTextField(20);
    private JFormattedTextField eventoData;
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
    private JButton bLimpar = new JButton("Limpar");
    private JButton bSair = new JButton("Sair");
    private JLabel lTitulo = new JLabel("Contatos");
    private JLabel lNome = new JLabel("Nome:");
    private JLabel lEndereco = new JLabel("Endereço:");
    private JLabel lEmail = new JLabel("Email:");
    private JLabel lTelefone = new JLabel("Telefone:");
    private JLabel lRG = new JLabel("RG:");
    
    public Main() throws ParseException, Exception{
        super ("Contatos e Eventos for Zombies");
        
        lerObjeto ler = new lerObjeto();
        salvarObjeto salvar = new salvarObjeto();
        
        File contatosFile = new File("C:\\ZContatos\\contatos.zombies");
        File eventosFile = new File("C:\\ZContatos\\eventos.zombies");
        // Verifica se o arquivo existe, caso contrário, ele cria um novo
        if(contatosFile.exists()){
           if(eventosFile.exists()) {
                    contatos.contatos = (ArrayList<Pessoa>) ler.deserializar("C:\\ZContatos\\contatos.zombies");
                   agenda.eventos = (ArrayList<Evento>) ler.deserializar("C:\\ZContatos\\eventos.zombies");
            }

         else {
            new File("C:\\ZContatos\\contatos.zombies");
            new File("C:\\ZContatos\\eventos.zombies");
        }
        }
       
        //
        
        
        //Formata os campos para a maneira correta
        eventoData = new JFormattedTextField(new MaskFormatter("##/##/####"));  
        tTelefone = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
        tRG = new JFormattedTextField(new MaskFormatter("##.###.###-#"));
        //
        
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

        for(Pessoa v: contatos.contatos) {
             modeloContatos.addElement(v.toString());          
        } 
        for(Evento x: agenda.eventos) {
             modeloEventos.addElement(x.toString());          
        } 
        
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
        tTelefone.setValue(null);
        tTelefone.setColumns(6);
        

        lRG.setBounds(20, 330, 100, 25);
        lRG.setForeground(Color.BLACK);
        tRG.setBounds(90, 330, 350, 25);
        tRG.setColumns(6);
        tRG.setValue(null);
        bGravar.setBounds(60, 370, 100, 23);
        bGravar.setBackground(new Color(155,201,149));
        bDeletar.setBounds(200, 370, 100, 23);
        bDeletar.setBackground(new Color(203,133,137));
        bAlterar.setBounds(340, 370, 100, 23);
        bAlterar.setBackground(new Color(255,191,105));
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
        eventoData.setValue(null);
	eventoData.setColumns(6);
        eventoLDescricao.setBounds(20, 280, 100, 25);
        eventoLDescricao.setForeground(Color.BLACK);
        eventoDescricao.setBounds(90, 280, 350, 25);
        eventoGravar.setBounds(60, 370, 100, 23);
        eventoGravar.setBackground(new Color(155,201,149));
        eventoDeletar.setBounds(200, 370, 100, 23);
        eventoDeletar.setBackground(new Color(203,133,137));
        eventoAlterar.setBounds(340, 370, 100, 23);
        eventoAlterar.setBackground(new Color(255,191,105));
        eventoSair.setBounds(340, 510, 100, 23);
        scrollEventos.setBounds(540,90,400,400);
        
        setSize(1000, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        


        //AÇÕES DOS BOTÕES DA ABA CONTATO  //////////////////////////////////////////////

        bGravar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    File file = new File("C:\\ZContatos\\");
                    file.mkdir();              
                    Pessoa pessoa = new Pessoa(tNome.getText(), tEndereco.getText(), tTelefone.getText(), tEmail.getText(), tRG.getText());
                    contatos.addPessoa(pessoa);
                    modeloContatos.addElement(pessoa.toString());
                    cleanCamp(tNome); cleanCamp(tEndereco) ; cleanCamp(tTelefone); cleanCamp(tEmail); cleanCamp(tRG);
                try {
                    salvar.salvar("C:\\ZContatos\\contatos.zombies", contatos.contatos);
                    contatos.contatos = (ArrayList<Pessoa>) ler.deserializar("C:\\ZContatos\\contatos.zombies");
                    
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                }

        });
        

        bAlterar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = listaContatos.getSelectedIndex();
                Object obj = modeloContatos.getElementAt(selected);
                if(selected == -1){
                	JOptionPane.showMessageDialog(null, "Selecione um contato ao lado");
                } else {
	                for(Pessoa p: contatos.contatos) {
	                    if(p.toString().equals(obj.toString())){
	                    	
	                        String nome = JOptionPane.showInputDialog(null, "Digite o novo nome: ");
	                        if(nome.trim().equals(""))
	                        	p.setNome(p.getNome());
	                        else
	                        	p.setNome(nome);
	                      
	                        String endereco = JOptionPane.showInputDialog(null, "Digite o novo endereco: ");
	                        if(endereco.trim().equals(""))
	                        	p.setNome(p.getNome());
	                        else
	                        	p.setEndereco(endereco);
	                        String telefone = JOptionPane.showInputDialog(null, "Digite o novo telefone: ");
	                        if(telefone.trim().equals(""))
	                        	p.setTelefone(p.gettelefone());
	                        else
	                        	p.setTelefone(telefone);
        
	                        String email = JOptionPane.showInputDialog(null, "Digite o novo email: "); 
	                        if(email.trim().equals(""))
	                        	p.setEmail(p.getEmail());
	                        else
	                        	p.setEmail(email);
	                       
                                try {
                                    salvar.salvar("C:\\ZContatos\\contatos.zombies", contatos.contatos);
                                    modeloContatos.setElementAt(p.toString(), selected);
                                    cleanCamp(tNome); cleanCamp(tEndereco) ; cleanCamp(tTelefone); cleanCamp(tEmail); cleanCamp(tRG);
                                } catch (Exception ex) {
                                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                }

	                    }
                       
                    
                }
                    

                }
            	}

        });
        
        
        bDeletar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = listaContatos.getSelectedIndex();
                Object obj = modeloContatos.getElementAt(selected);
                if(selected == -1){
                	JOptionPane.showMessageDialog(null, "Selecione um contato ao lado");
                } else {
	                for(Pessoa p: contatos.contatos) {
	                    if(p.toString().equals(obj.toString())) {
                                String escolha = JOptionPane.showInputDialog(null, "Deseja remover? S/N");
                                if(escolha.toUpperCase().equals("S")) {
                                    contatos.removePessoa(p);
                                    JOptionPane.showMessageDialog(null, "Contato: " + p.getNome() + " Removido com sucesso ! !!");
                                    modeloContatos.remove(selected);
                                    
                                }  else {
                                    JOptionPane.showMessageDialog(null, "Contato não removido, e ação cancelada");
                                }
                                    
                            }

        }}}});
        
        bSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
                }
            });
        
        
       //AÇÕES DOS BOTÕES DA ABA EVENTOS

        eventoGravar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    
                    Evento evento = new Evento(eventoNome.getText(), eventoDescricao.getText(), eventoEndereco.getText(), eventoNome.getText());

                    try {
                        evento.toData(eventoData.getText());
                        agenda.addEvento(evento);
                        cleanCamp(eventoNome); cleanCamp(eventoEndereco) ; cleanCamp(eventoData); cleanCamp(eventoDescricao);
                        modeloEventos.addElement(evento.toString());
                        salvar.salvar("C:\\ZContatos\\eventos.zombies", agenda.eventos);
                        agenda.eventos = (ArrayList<Evento>) ler.deserializar("C:\\ZContatos\\eventos.zombies");

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Insira a data com: dd/MM/yyyy");
                }

            }

        });
        
        eventoAlterar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = listaEventos.getSelectedIndex();
                Object obj = modeloEventos.getElementAt(selected);
                if(selected == -1){
                	JOptionPane.showMessageDialog(null, "Selecione um evento ao lado");
                } else {
                    for (Evento z:agenda.eventos) {
                        if(z.toString().equals(obj.toString())){
                            
                            String nome = JOptionPane.showInputDialog(null, "Digite o novo nome: ");
                            if(nome.trim().equals(""))
                                z.setNome(z.getNome());
                            else
                                z.setNome(nome);
                            
                            String descricao = JOptionPane.showInputDialog(null, "Digite a nova Descrição: ");
                            if(descricao.trim().equals(""))
                                z.setDescricao(z.getDescricao());
                            else
                                z.setDescricao(descricao);
                            
                            String endereco = JOptionPane.showInputDialog(null, "Digite o novo endereço: ");
                            if(endereco.trim().equals(""))
                                z.setEndereco(z.getEndereco());
                            else
                                z.setEndereco(endereco);
                            
                            String data = JOptionPane.showInputDialog(null, "Digite a nova data: (01/01/2001)");
                            if(data.trim().equals(""))
                                z.setData(z.getData());
                            else
                                try {
                                    z.toData(data);
                                    salvar.salvar("C:\\ZContatos\\eventos.zombies", agenda.eventos);
                                    agenda.eventos = (ArrayList<Evento>) ler.deserializar("C:\\ZContatos\\eventos.zombies");
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Digite a data corretamente!");
                            }

                            modeloEventos.setElementAt(e.toString(), selected);
                            cleanCamp(eventoNome); cleanCamp(eventoDescricao) ; cleanCamp(eventoEndereco); cleanCamp(eventoData);
                        }
                    }
                    
                    

                }
            	}

        });
        
        eventoDeletar.addActionListener(new ActionListener() {   // Deleta um evento, ops2: Corrigir bug

            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = listaContatos.getSelectedIndex();
                Object obj = modeloContatos.getElementAt(selected);
                if(selected == -1){
                	JOptionPane.showMessageDialog(null, "Selecione um evento ao lado");
                } else {
	                for(Evento z: agenda.eventos) {
	                    if(z.toString().equals(obj.toString())) {
                                String escolha = JOptionPane.showInputDialog(null, "Deseja remover? S/N");
                                if(escolha.toUpperCase().equals("S")) {
                                    agenda.removeEvento(z);
                                    JOptionPane.showMessageDialog(null, "Evento: " + z.getNome() + " Removido com sucesso ! !!");
                                    modeloEventos.remove(selected);
                                    try {
                                        salvar.salvar("C:\\ZContatos\\eventos.zombies", agenda.eventos);
                                        agenda.eventos = (ArrayList<Evento>) ler.deserializar("C:\\ZContatos\\eventos.zombies");

                                    }  catch (Exception ex) {
                                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }  else {
                                    JOptionPane.showMessageDialog(null, "Evento não removido, e ação cancelada");
                                }
                                    
                            }

        }
                    
       }}});
       eventoSair.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
                }
            });
        
    
    
    }

    
    public void cleanCamp(JTextField camp){  //Para limpar campos
        camp.setText("");
    }
    
    public static void main (String args[]) throws ParseException{
        
        try {
            new Main();
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Erro ao abrir o programa, verifique o directorio C:\\ZContatos\\");
        }
    }
}
