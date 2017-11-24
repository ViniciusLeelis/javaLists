/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista13;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Pessoa implements Serializable {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String RG;
    
    Pessoa(String nome, String endereco, String telefone, String email, String RG) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.RG = RG;
    }
    
    public void setRG(String RG){
        this.RG = RG;
    }
        
    public String getRG() {
        return RG;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String gettelefone(){
        return telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    
    @Override
    public String toString(){
        return nome + "  | " + endereco;
    }
    
}
