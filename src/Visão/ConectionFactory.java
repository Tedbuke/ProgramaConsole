package Visão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe Criada para.
 *
 * @author Polako
 * @since Classe criada em 13/06/2018
 */
public class ConectionFactory {

    public Connection conecta() {

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/jogos", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}//fim da classe.
