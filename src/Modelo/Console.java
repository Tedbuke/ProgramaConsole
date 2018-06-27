
package Modelo;

import java.sql.Date;

/**
 * Clasese criada
 * @author Expression TedBukeJojo is undefined on line 12, column 14 in Templates/Classes/Class.java.
 * @since  
 */
public class Console {
 Long id;
    String nome;
    int numeroSerie;
    float preco;
    Date lancamento;
    float valorRevenda;
    float preVenda;
    float valorFornecedor;
   
    
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public int getnumeroSerie() {
        return numeroSerie;
    }
    public void setnumeroSerie( int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public Date gettlancamento( Date lancamento){
        return lancamento;
    }
    public int setlancamento(Date lancemento){
        this.lancamento = lancamento;
         return 0;
    }
     public float gettvalorRevenda(float valorRevenda){
        return valorRevenda;
    }
     public float setvalorRevenda(float valorRevenda){
         this.valorRevenda = valorRevenda;
     return 0;
     }
        
    public float getpreVenda (float preVenda){
        return preVenda;
    }
    public float setpreVenda (float preVenda){
        this.preVenda = preVenda;
        return 0;

    }
    public float getvalorForcenedor(float valorFornecedor){
        return valorFornecedor;
    }
    public float setvalorForcenedor(float valorFornecedor){
        this.valorFornecedor = valorFornecedor;
        return 0;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getpreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getlancamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getvalorRevenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getpreVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getprevalorFornecedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String setnumeroSerie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}// final da classe
