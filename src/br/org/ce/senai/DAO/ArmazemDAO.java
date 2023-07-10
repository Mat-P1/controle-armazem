package br.org.ce.senai.DAO;

import br.org.ce.senai.DTO.ArmazemDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class ArmazemDAO {
    Connection conexaoBanco;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ArmazemDTO> lista = new ArrayList<>();
    
    public void cadastrarArmazemDAO(ArmazemDTO objArmazemDTO) {
        String sql = "INSERT INTO armazem (nome, endereco, telefone) VALUES (?, ?, ?)";      
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setString(1, objArmazemDTO.getNomeArmazemDTO());
            pstm.setString(2, objArmazemDTO.getEnderecoArmazemDTO());
            pstm.setString(3, objArmazemDTO.getTelefoneArmazemDTO());
            
            pstm.execute();
            pstm.close();
                    
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\ncadastarArmazemDAO" + error);
        }
    }
    
    public ArrayList<ArmazemDTO> listarArmazensDAO() {
        String sql = "SELECT * FROM armazem";       
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
             pstm = conexaoBanco.prepareStatement(sql);
             rs = pstm.executeQuery();
             
             while (rs.next()) {
                 ArmazemDTO objArmazemDTO = new ArmazemDTO();
                 
                 objArmazemDTO.setIdArmazemDTO(rs.getInt("idArmazem"));
                 objArmazemDTO.setNomeArmazemDTO(rs.getString("nome"));
                 objArmazemDTO.setEnderecoArmazemDTO(rs.getString("endereco"));
                 objArmazemDTO.setTelefoneArmazemDTO(rs.getString("telefone"));
                 
                 lista.add(objArmazemDTO);
            }
             
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nlistarArmazénsDAO" + error);
        }
        
        return lista;
    }
    
    public ArrayList<ArmazemDTO> pesquisarArmazemDAO(String descricao) {
        String sql = "SELECT * FROM armazem WHERE nome LIKE '%" + descricao + "%'";    
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
             pstm = conexaoBanco.prepareStatement(sql);
             rs = pstm.executeQuery();
             
             while (rs.next()) {
                 ArmazemDTO objArmazemDTO = new ArmazemDTO();
                 
                 objArmazemDTO.setIdArmazemDTO(rs.getInt("idArmazem"));
                 objArmazemDTO.setNomeArmazemDTO(rs.getString("nome"));
                 objArmazemDTO.setEnderecoArmazemDTO(rs.getString("endereco"));
                 objArmazemDTO.setTelefoneArmazemDTO(rs.getString("telefone"));
                 
                 lista.add(objArmazemDTO);
            }
             
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\npesquisarArmazemDAO" + error);
        }
        
        return lista;
    }
    
    public void alterarArmazemDAO(ArmazemDTO objArmazemDTO) {
        String sql = "UPDATE armazem SET nome = ?, endereco = ?, telefone = ? WHERE idArmazem = ?"; 
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setString(1, objArmazemDTO.getNomeArmazemDTO());
            pstm.setString(2, objArmazemDTO.getEnderecoArmazemDTO());
            pstm.setString(3, objArmazemDTO.getTelefoneArmazemDTO());
            pstm.setInt(4, objArmazemDTO.getIdArmazemDTO());
            
            pstm.execute();
            pstm.close();
                     
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nalterarArmazemDAO" + error);
        }      
    }
    
    public void excluirArmazemDAO(ArmazemDTO objArmazemDTO) {
        String sql = "DELETE FROM armazem WHERE idArmazem = ?";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setInt(1, objArmazemDTO.getIdArmazemDTO());
            
            pstm.execute();
            pstm.close();
                     
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nexcluirArmazemDAO" + error);
        }  
    }
}
