/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista9.exercicio1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Admin
 */
public class RectanguleForm extends JComponent{

  @Override
  public Dimension getPreferredSize() {
            return new Dimension(480,420);
        }
  @Override
  public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i<= 15; i++){
            g.setColor(Color.RED);
            g.drawRect(10 + i*10 , 10 + i*10, 50+i*10, 50+i*10);
          
        }        
	
	}
  
}

