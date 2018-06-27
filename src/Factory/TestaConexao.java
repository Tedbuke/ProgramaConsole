
package Factory;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clasese criada
 * @author Expression TedBukeJojo is undefined on line 12, column 14 in Templates/Classes/Class.java.
 * @since  
 */
public class TestaConexao {
  public static void main(String[] args) throws SQLException {
      try (Connection connection = new ConnectionFactory().getConnection()) {
          System.out.println("Conexão aberta!");
      }
     }

    private static class ConnectionFactory {

        public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/jogos","root","");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
                 }
        }
        
    }
}// final da classe
