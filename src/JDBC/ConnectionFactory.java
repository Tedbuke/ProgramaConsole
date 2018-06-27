/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Classe Criada para.
 * @author Polako
 * @since Classe criada em 16/06/2018
 */
public class ConnectionFactory{
    
    
    public static Connection conecta(){
        try {
            
         return DriverManager.getConnection("jdbc:mysql://localhost/jogos", "root", "");
        
        } catch (SQLException e) {
            
            throw new RuntimeException(e);
        }
    }

}//fim da classe.