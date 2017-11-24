/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.lista13;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class salvarObjeto implements Serializable {


    public salvarObjeto() {    }
     
        public void salvar(String path, ArrayList contatos) throws Exception {
                FileOutputStream outFile = new FileOutputStream(path);
                ObjectOutputStream s = new ObjectOutputStream(outFile);
                s.writeObject(contatos);
                s.close();
        }



}
