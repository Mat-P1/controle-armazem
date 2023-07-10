package br.org.ce.senai.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class ConexaoBancoDAO {
    
    public Connection conectarBanco() {
        Connection conexaoBanco = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/controle_armazem?user=root&password=";
            conexaoBanco = DriverManager.getConnection(url);
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados\nConexãoBancoDAO" + error.getMessage());
        }
        
        return conexaoBanco;
    }
}
