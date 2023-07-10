package br.org.ce.senai.DAO;

import br.org.ce.senai.DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Mateus
 */
public class ProdutoDAO {
    Connection conexaoBanco;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList<>();
    
    public void cadastrarProdutoDAO(ProdutoDTO objProdutoDTO) {
        String sql = "INSERT INTO produto (numeroSerial, nome, valor, qtd, dataEntrega, idArmazem, idFornecedor) VALUES (?, ?, ?, ?, ?, ?, ?)";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
            
        try {
             pstm = conexaoBanco.prepareStatement(sql);
             
             pstm.setString(1, objProdutoDTO.getNumeroSerialProdutoDTO());
             pstm.setString(2, objProdutoDTO.getNomeProdutoDTO());
             pstm.setDouble(3, objProdutoDTO.getValorProdutoDTO());
             pstm.setInt(4, objProdutoDTO.getQtdProdutoDTO());
             pstm.setString(5, objProdutoDTO.getDataEntregaProdutoDTO());
             pstm.setInt(6, objProdutoDTO.getIdArmazemProdutoDTO());
             pstm.setInt(7, objProdutoDTO.getIdFornecedorProdutoDTO());
             
             pstm.execute();
             pstm.close();      
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\ncadastarProdutoDAO" + error);
        }
    }
    
    public ArrayList<ProdutoDTO> listarProdutosDAO() {
        String sql = "SELECT * FROM produto";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                
                objProdutoDTO.setIdProdutoDTO(rs.getInt("idProduto"));
                objProdutoDTO.setNumeroSerialProdutoDTO(rs.getString("numeroSerial"));
                objProdutoDTO.setNomeProdutoDTO(rs.getString("nome"));
                objProdutoDTO.setValorProdutoDTO(rs.getDouble("valor"));
                objProdutoDTO.setQtdProdutoDTO(rs.getInt("qtd"));
                objProdutoDTO.setDataEntregaProdutoDTO(rs.getString("dataEntrega"));
                objProdutoDTO.setIdArmazemProdutoDTO(rs.getInt("idArmazem"));
                objProdutoDTO.setIdFornecedorProdutoDTO(rs.getInt("idFornecedor"));
                
                lista.add(objProdutoDTO);
            }
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nlistarFuncionariosDAO" + error);
        }
        
        return lista;
    }
    
    public ArrayList<ProdutoDTO> pesquisarProdutoDAO(String descricao) {
        String sql = "SELECT * FROM produto WHERE nome LIKE '%" + descricao + "%'";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                ProdutoDTO objProdutoDTO = new ProdutoDTO();
                
                objProdutoDTO.setIdProdutoDTO(rs.getInt("idProduto"));
                objProdutoDTO.setNumeroSerialProdutoDTO(rs.getString("numeroSerial"));
                objProdutoDTO.setNomeProdutoDTO(rs.getString("nome"));
                objProdutoDTO.setValorProdutoDTO(rs.getDouble("valor"));
                objProdutoDTO.setQtdProdutoDTO(rs.getInt("qtd"));
                objProdutoDTO.setDataEntregaProdutoDTO(rs.getString("dataEntrega"));
                objProdutoDTO.setIdArmazemProdutoDTO(rs.getInt("idArmazem"));
                objProdutoDTO.setIdFornecedorProdutoDTO(rs.getInt("idFornecedor"));
                
                lista.add(objProdutoDTO);
            }
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\npesquisarFuncionarioDAO" + error);
        }
        
        return lista;
    }
    
    public ResultSet listarArmazensProdutoDAO() {
        String sql = "SELECT * FROM armazem ORDER BY nome";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            return pstm.executeQuery();
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nlistarArmazensProdutoDAO" + error);
            return null;
        }
    }
    
    public ResultSet listarFornecedoresProdutoDAO() {
        String sql = "SELECT * FROM fornecedor ORDER BY nome";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            return pstm.executeQuery();
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nlistarFornecedoresProdutoDAO" + error);
            return null;
        }
    }
    
    public void alterarProdutoDAO(ProdutoDTO objProdutoDTO){
        String sql = "UPDATE produto SET numeroSerial = ?, nome = ?, valor = ?, qtd = ?, dataEntrega = ?, idArmazem = ?, idFornecedor = ? WHERE idProduto = ?";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setString(1, objProdutoDTO.getNumeroSerialProdutoDTO());
            pstm.setString(2, objProdutoDTO.getNomeProdutoDTO());
            pstm.setDouble(3, objProdutoDTO.getValorProdutoDTO());
            pstm.setInt(4, objProdutoDTO.getQtdProdutoDTO());
            pstm.setString(5, objProdutoDTO.getDataEntregaProdutoDTO());
            pstm.setInt(6, objProdutoDTO.getIdArmazemProdutoDTO());
            pstm.setInt(7, objProdutoDTO.getIdFornecedorProdutoDTO());
            pstm.setInt(8, objProdutoDTO.getIdProdutoDTO());
                 
            pstm.execute();
            pstm.close();
        
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nalterarFuncionarioDAO" + error);
        }
    }
    
    public void excluirProdutoDAO(ProdutoDTO objProdutoDTO) {
        String sql = "DELETE FROM produto WHERE idProduto = ?";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setInt(1, objProdutoDTO.getIdProdutoDTO());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nexcluirFuncionarioDAO" + error);
        }
    }
}
