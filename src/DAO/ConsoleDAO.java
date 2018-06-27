/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javabeans.Console;

/**
 *Classe Criada para.
 * @author Polako
 * @since Classe criada em 16/06/2018
 */
public class ConsoleDAO{
    
    private final Connection conecta;
    //Construtor
    
    public ConsoleDAO(){
        
        this.conecta = new ConnectionFactory().conecta();
        
    }
    
    //metodo cadastrar console
    public void cadastrarConsole(Console obj){
        try {
            
            //1 passo - criar um comando sql
            
            String cmdsql= "insert into tipoconsole(nome,numeroSerie,preco,lancamento,valorRevenda,preVenda,valorFornecedor,console)values(?,?,?,?,?,?,?,?)";
            
            //2 passo - organizar o cdmsql e executar
            
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getNumerodeserie());
            stmt.setFloat(3, (float) obj.getPreco());
            stmt.setInt(4, obj.getLancamento());
            stmt.setFloat(5, (float) obj.getValorderevenda());
            stmt.setFloat(6, (float) obj.getPrevenda());
            stmt.setFloat(7, (float) obj.getValordefornecedor());
            stmt.setString (8, obj.getConsole());
            
            
            
            
            //3 passo - executa o comando
            stmt.execute();
            
            //4 passo - fechar a conexão
            stmt.close();
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
    
}
    


    
    
   
    

