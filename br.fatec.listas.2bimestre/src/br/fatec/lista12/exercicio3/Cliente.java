package br.fatec.lista12.exercicio3;

import java.net.*;
import java.io.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Cliente {
	public static void main(String[] args) {

		//Criando Classe cliente para receber arquivo
		Cliente cliente = new Cliente();

		//Solicitando arquivo
		cliente.receberArquivo();
	}

	private void receberArquivo() {
            	FileOutputStream fos = null;
		Socket sockServer = null;
		InputStream is = null;

		try {
			// Criando conexão com o servidor
                        String porta = JOptionPane.showInputDialog(null, "Digite a porta desejada");
                        int port = Integer.parseInt(porta);
                        String ip = JOptionPane.showInputDialog(null, "Digite o ip");
                       
			System.out.println("Conectando com Servidor porta " + port);
			sockServer = new Socket(ip , port);
			is = sockServer.getInputStream();

			// Cria arquivo local no cliente
			fos = new FileOutputStream(new File("C:\\Users\\Admin\\Documents\\fiquei_chateado_com_o_tank.txt"));
			System.out.println("Foi criado um arquivo em Documents");
			
			// Prepara variaveis para transferencia
			byte[] cbuffer = new byte[1024];
			int bytesRead;

			// Copia conteudo do canal
			System.out.println("Recebendo arquivo...");
    			while ((bytesRead = is.read(cbuffer)) != -1) {
				fos.write(cbuffer, 0, bytesRead);
				fos.flush();
			}
			
			System.out.println("Arquivo recebido!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sockServer != null) {
				try {
					sockServer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

			if (is != null) {
				try {
					is.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}
}
