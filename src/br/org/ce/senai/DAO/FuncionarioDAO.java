package br.org.ce.senai.DAO;

import br.org.ce.senai.DTO.FuncionarioDTO;
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
public class FuncionarioDAO {
    Connection conexaoBanco;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    
    public void cadastrarFuncionarioDAO(FuncionarioDTO objFuncionarioDTO) {
        String sql = "INSERT INTO funcionario (CPF, nome, funcao, salario, idArmazem) VALUES (?, ?, ?, ?, ?)";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
            
        try {
             pstm = conexaoBanco.prepareStatement(sql);
             
             pstm.setLong(1, objFuncionarioDTO.getCPFDTO());
             pstm.setString(2, objFuncionarioDTO.getNomeFuncionarioDTO());
             pstm.setString(3, objFuncionarioDTO.getFuncaoFuncionarioDTO());
             pstm.setDouble(4, objFuncionarioDTO.getSalarioFuncionarioDTO());
             pstm.setInt(5, objFuncionarioDTO.getIdArmazemFuncionarioDTO());
             
             pstm.execute();
             pstm.close();      
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\ncadastarFuncionarioDAO" + error);
        }
    }
    
    public ArrayList<FuncionarioDTO> listarFuncionariosDAO() {
        String sql = "SELECT * FROM funcionario";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
                FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
                
                objFuncionarioDTO.setIdFuncionarioDTO(rs.getInt("idFuncionario"));
                objFuncionarioDTO.setCPFDTO(rs.getLong("CPF"));
                objFuncionarioDTO.setNomeFuncionarioDTO(rs.getString("nome"));
                objFuncionarioDTO.setFuncaoFuncionarioDTO(rs.getString("funcao"));
                objFuncionarioDTO.setSalarioFuncionarioDTO(rs.getDouble("salario"));
                objFuncionarioDTO.setIdArmazemFuncionarioDTO(rs.getInt("idArmazem"));
                
                lista.add(objFuncionarioDTO);
            }
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nlistarFuncionariosDAO" + error);
        }
        
        return lista;
    }
    
    public ArrayList<FuncionarioDTO> pesquisarFuncionarioDAO(String descricao) {
        String sql = "SELECT * FROM funcionario WHERE nome LIKE '%" + descricao + "%'";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()) {
            FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
                
            objFuncionarioDTO.setIdFuncionarioDTO(rs.getInt("idFuncionario"));
            objFuncionarioDTO.setCPFDTO(rs.getLong("CPF"));
            objFuncionarioDTO.setNomeFuncionarioDTO(rs.getString("nome"));
            objFuncionarioDTO.setFuncaoFuncionarioDTO(rs.getString("funcao"));
            objFuncionarioDTO.setSalarioFuncionarioDTO(rs.getDouble("salario"));
            objFuncionarioDTO.setIdArmazemFuncionarioDTO(rs.getInt("idArmazem"));
                
            lista.add(objFuncionarioDTO);
            }
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\npesquisarFuncionarioDAO" + error);
        }
        
        return lista;
    }
    
    public ResultSet listarArmazensFuncionarioDAO() {
        String sql = "SELECT * FROM armazem ORDER BY nome";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            return pstm.executeQuery();
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nlistarArmazens" + error);
            return null;
        }
    }
    
    public void alterarFuncionarioDAO(FuncionarioDTO objFuncionarioDTO) {
        String sql = "UPDATE funcionario SET nome = ?, funcao = ?, salario = ?, idArmazem = ? WHERE idFuncionario = ?";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setString(1, objFuncionarioDTO.getNomeFuncionarioDTO());
            pstm.setString(2, objFuncionarioDTO.getFuncaoFuncionarioDTO());
            pstm.setDouble(3, objFuncionarioDTO.getSalarioFuncionarioDTO());
            pstm.setInt(4, objFuncionarioDTO.getIdArmazemFuncionarioDTO());
            pstm.setInt(5, objFuncionarioDTO.getIdFuncionarioDTO());
            
            pstm.execute();
            pstm.close();
        
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nalterarFuncionarioDAO" + error);
        }
    }
    
    public void excluirFuncionarioDAO(FuncionarioDTO objFuncionarioDTO) {
        String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
        conexaoBanco = new ConexaoBancoDAO().conectarBanco();
        
        try {
            pstm = conexaoBanco.prepareStatement(sql);
            
            pstm.setInt(1, objFuncionarioDTO.getIdFuncionarioDTO());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException error) {
            JOptionPane.showConfirmDialog(null, "Erro\nexcluirFuncionarioDAO" + error);
        }
    }
}
