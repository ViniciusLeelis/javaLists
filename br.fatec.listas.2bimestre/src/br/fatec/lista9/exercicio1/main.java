package br.fatec.lista9.exercicio1;


import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class main {
    
    
    public static void main(String[] args) {
        new main();
    }

    public main() {
                JFrame frame = new JFrame("Queria que o tanque fosse tão fácil quanto esse exercício :c");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new RectanguleForm());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setResizable(false);
     
    };
}
