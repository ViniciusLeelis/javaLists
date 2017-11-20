/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista13;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Agenda {
    ArrayList<Evento> eventos;
    
    Agenda() {
        eventos = new ArrayList<>();
    }
    public void addEvento(Evento evento) {
        eventos.add(evento);
    }
    public void removeEvento(String nome){
        for(Evento e:eventos){
            if(e.getNome().equals(nome)){
                eventos.remove(e);
            }
        }        
    }
}
