package br.org.ce.senai.DAO;

import br.org.ce.senai.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Mateus
 */
public class UsuarioDAO {
    Connection conexaoBanco;
    PreparedStatement pstm;
    ResultSet rs;
            
    public ResultSet autenticarUsuario(UsuarioDTO objUsuarioDTO) {
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            String sql = "SELECT * FROM usuario WHERE nome = ? AND senha =?";
            
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setString(1, objUsuarioDTO.getNomeUsuarioDTO());
            pstm.setString(2, objUsuarioDTO.getSenhaUsuarioDTO());
            
            rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados\nUsuarioDAO" + error.getMessage());
            return null;
        }
    }
}
