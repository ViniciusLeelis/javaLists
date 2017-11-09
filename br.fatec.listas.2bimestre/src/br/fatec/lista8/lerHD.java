package br.fatec.lista8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class lerHD extends JFrame implements ActionListener{
    private ArrayList<String> dataArquivos = new ArrayList<>();
    private ArrayList<String> dataPastas = new ArrayList<>();
    private String diretorio = "C:\\";    
    
    
    
    public lerHD(){
	File file = new File(diretorio);
	File totalfiles[] = file.listFiles();
	int i = 0;
	for (int j = totalfiles.length; i < j; i++) {
		File arquivos = totalfiles[i];
                if(arquivos.isDirectory()) {
                    dataPastas.add(totalfiles[i].getName());
                }else
                    dataArquivos.add(totalfiles[i].getName());
	}
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        JButton pastas = new JButton("Verificar pastas");
        JButton arquivos = new JButton("Verificar Arquivos");
        pastas.addActionListener(this);
        arquivos.addActionListener(this);
        p.add(pastas);
        p.add(arquivos);
        add(p);
        setLocationRelativeTo(null);
        pack();
    }
    
    public static void main(String...args){
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
              new lerHD().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String  arquivos = "" ;
       String  pastas = "" ;
       String comando;
       comando = e.getActionCommand(); 
       
       if(comando.equals("Verificar Arquivos")) {
        for(String a : dataArquivos)
            arquivos += a +"\n";
       JOptionPane.showMessageDialog(this, arquivos);
       }
       if(comando.equals("Verificar pastas")) {
        for(String b: dataPastas)
            pastas += b +"\n";
       
        JOptionPane.showMessageDialog(this, pastas);
    }

}
}