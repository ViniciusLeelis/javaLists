package br.fatec.lista12.exercicio3;

import java.net.*;
import java.io.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;


public class Servidor {
	public static void main(String[] args) {

		// Criando servidor
		Servidor server = new Servidor();

		// Aguardar conexao de cliente para transferia
		server.waitForClient();
		
	}

	public void waitForClient() {
		// Checa se a transferencia foi completada com sucesso
		OutputStream socketOut = null;
		ServerSocket servsock = null;
		FileInputStream fileIn = null;

		try {
			// Abrindo porta para conexao de clients
                        String porta = JOptionPane.showInputDialog(null, "Digite a porta desejada");
                        int port = Integer.parseInt(porta);
			servsock = new ServerSocket(port);
			System.out.println("Porta de conexao aberta : " + port);

			// Cliente conectado
			Socket sock = servsock.accept();
			System.out.println("Conexao recebida pelo cliente");

			// Criando tamanho de leitura
			byte[] cbuffer = new byte[1024];
			int bytesRead;

			// Criando arquivo que sera transferido pelo servidor
			File file = new File("C:\\Users\\Admin\\Documents\\fiquei_chateado_com_o_tankSERVER.txt");
			fileIn = new FileInputStream(file);
			System.out.println("Lendo arquivo...");
			
			// Criando canal de transferencia
			socketOut = sock.getOutputStream();

			// Lendo arquivo criado e enviado para o canal de transferencia
			System.out.println("Enviando Arquivo...");
			while ((bytesRead = fileIn.read(cbuffer)) != -1) {
				socketOut.write(cbuffer, 0, bytesRead);
				socketOut.flush();
			}

			System.out.println("Arquivo Enviado!");
		} catch (Exception e) {
			// Mostra erro no console
			e.printStackTrace();
		} finally {
			if (socketOut != null) {
				try {
					socketOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (servsock != null) {
				try {
					servsock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fileIn != null) {
				try {
					fileIn.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
