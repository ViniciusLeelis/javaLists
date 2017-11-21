/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Evento {
    private String nome;
    private Date data;
    private String descricao;

    private String endereco;
    Evento(String nome,String descricao, String endereco){
        this.nome = nome;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public Date getData(){
        return data;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void toData(String data) throws Exception { 
        
            Date date = null;
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date)formatter.parse(data);
            this.data = date;
	}
    
    @Override
    public String toString(){
        return "Evento: " + nome + " Data: " + data + "\n";
    }
}
