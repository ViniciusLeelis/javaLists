/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista13;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Admin
 */
public class Evento {
    private String nome;
    private Data data;
    private String descricao;
    private Pessoa pessoa;
    Evento(String nome, Data data, String descricao, Pessoa pessoa){
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        this.pessoa = pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setData(Data data) {
        this.data = data;
    }
    
    public Data getData(){
        return data;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
