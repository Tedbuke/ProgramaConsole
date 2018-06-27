/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Projeto_exemploCRUD;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *Classe Criada para.
 * @author Polako
 * @since Classe criada em 16/06/2018
 */
public class Projeto_exemploCRUD{
    
    public static void main(String[]args){
        
        try {
           
         //testando a conexão
         JOptionPane.showInputDialog(null, "testando a conexão");
         Connection con = new JDBC.ConnectionFactory().conecta();
         JOptionPane.showInputDialog(null, "está conectada");
        
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, "erro"+ e);
        }
         
    }

}//fim da classe.