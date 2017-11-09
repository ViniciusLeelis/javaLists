/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista9.exercicio2;

import br.fatec.lista9.exercicio1.main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import javax.swing.*;


/**
 *
 * @author Admin
 */
public class Janela extends JFrame implements ActionListener {
    private JButton j1, j2, j3, j4;
    private JTextField t1, t2;
    private double contador = 0;
    private JLabel lContador;
    
    public static void main(String[] args) {
        new Janela();
    }
    public Janela (){
        super("Calculadora");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        t1 = new JTextField("0", 6); 
        t2 = new JTextField("0", 6);
        j1 = new JButton("+");
        j2 = new JButton("-");
        j3 = new JButton("x");
        j4 = new JButton("/");
        lContador = new JLabel("Resultado: " +contador);
        c.add(t1); c.add(t2); c.add(j1); c.add(j2); c.add(j3); c.add(j4); c.add(lContador);
        j1.addActionListener(this); j2.addActionListener(this); j3.addActionListener(this); j4.addActionListener(this);
        pack();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(3);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(j1)) {
            contador =  Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText());
        } else if(e.getSource().equals(j2)) {
            contador =  Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText());
        } else if(e.getSource().equals(j3)) {
            contador =  Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText());
        } else if(e.getSource().equals(j4)) {
            contador =  Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText());            
        }
        lContador.setText("" + contador);
    }

}
