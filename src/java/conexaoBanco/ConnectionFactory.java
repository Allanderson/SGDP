/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Allanderson Nunes
 */
public class ConnectionFactory {

    Connection conexao = null;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/SGDP";
    private String root = "root";
    private String senhaB = "";
    
    //Método para criar uma conexão
    public Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, root, senhaB);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } catch (ClassNotFoundException cfe) {
            cfe.printStackTrace();
        }
        //retorna uma nova conexão
        return conexao = new ConnectionFactory().getConnection();
    }
}
