package br.org.ce.senai.DAO;

import br.org.ce.senai.DTO.FornecedorDTO;
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
public class FornecedorDAO {
    Connection conexaoBanco;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FornecedorDTO> lista = new ArrayList<>();
            
    public void cadastrarFornecedorDAO(FornecedorDTO objFornecedorDTO) {
        String sql = "INSERT INTO fornecedor (CNPJ, nome, endereco, telefone, email) VALUES (?, ?, ?, ?, ?)";           
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setLong(1, objFornecedorDTO.getCNPJDTO());           
            pstm.setString(2, objFornecedorDTO.getNomeFornecedorDTO());
            pstm.setString(3, objFornecedorDTO.getEnderecoFornecedorDTO());
            pstm.setString(4, objFornecedorDTO.getTelefoneFornecedorDTO());
            pstm.setString(5, objFornecedorDTO.getEmailFornecedorDTO());
            
            pstm.execute();
            pstm.close();
                    
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\ncadastarFornecedorDAO" + error);
        }
    }
    
    public ArrayList<FornecedorDTO> listarFornecedoresDAO() {
        String sql = "SELECT * FROM fornecedor";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
             pstm = conexaoBanco.prepareStatement(sql);
             rs = pstm.executeQuery();
             
             while (rs.next()) {
                 FornecedorDTO objFornecedorDTO = new FornecedorDTO();
                 
                 objFornecedorDTO.setIdFornecedorDTO(rs.getInt("idFornecedor"));
                 objFornecedorDTO.setCNPJDTO(rs.getLong("CNPJ"));
                 objFornecedorDTO.setNomeFornecedorDTO(rs.getString("nome"));
                 objFornecedorDTO.setEnderecoFornecedorDTO(rs.getString("endereco"));
                 objFornecedorDTO.setTelefoneFornecedorDTO(rs.getString("telefone"));
                 objFornecedorDTO.setEmailFornecedorDTO(rs.getString("email"));
                 
                 lista.add(objFornecedorDTO);
            }
             
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nlistarFornecedoresDAO" + error);
        }
        
        return lista;
    }
    
    public ArrayList<FornecedorDTO> pesquisarFornecedorDAO(String descricao) {
        String sql = "SELECT * FROM fornecedor WHERE nome LIKE '%" + descricao + "%'";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
             pstm = conexaoBanco.prepareStatement(sql);
             rs = pstm.executeQuery();
             
             while (rs.next()) {
                 FornecedorDTO objFornecedorDTO = new FornecedorDTO();
                 
                 objFornecedorDTO.setIdFornecedorDTO(rs.getInt("idFornecedor"));
                 objFornecedorDTO.setCNPJDTO(rs.getLong("CNPJ"));
                 objFornecedorDTO.setNomeFornecedorDTO(rs.getString("nome"));
                 objFornecedorDTO.setEnderecoFornecedorDTO(rs.getString("endereco"));
                 objFornecedorDTO.setTelefoneFornecedorDTO(rs.getString("telefone"));
                 objFornecedorDTO.setEmailFornecedorDTO(rs.getString("email"));
                 
                 lista.add(objFornecedorDTO);
            }
             
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nlistarFornecedorDAO" + error);
        }
        
        return lista;
    }
    
    public void alterarFornecedorDAO(FornecedorDTO objFornecedorDTO) {
        String sql = "UPDATE fornecedor SET nome = ?, endereco = ?, telefone = ?, email = ? WHERE idFornecedor = ?";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setString(1, objFornecedorDTO.getNomeFornecedorDTO());
            pstm.setString(2, objFornecedorDTO.getEnderecoFornecedorDTO());
            pstm.setString(3, objFornecedorDTO.getTelefoneFornecedorDTO());
            pstm.setString(4, objFornecedorDTO.getEmailFornecedorDTO());
            pstm.setInt(5, objFornecedorDTO.getIdFornecedorDTO());
            
            pstm.execute();
            pstm.close();
                     
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nalterarFornecedorDAO" + error);
        }      
    }
    
    public void excluirFornecedorDAO(FornecedorDTO objFornecedorDTO) {
        String sql = "DELETE FROM fornecedor WHERE idFornecedor = ?";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setInt(1, objFornecedorDTO.getIdFornecedorDTO());
            
            pstm.execute();
            pstm.close();
                     
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nalterarFornecedorDAO" + error);
        }      
    }
}
