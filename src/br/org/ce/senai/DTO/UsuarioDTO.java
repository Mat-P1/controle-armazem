package br.org.ce.senai.DTO;

/**
 *
 * @author Mateus
 */
public class UsuarioDTO {
    
    private int IdUsuarioDTO;
    private String nomeUsuarioDTO, senhaUsuarioDTO;
    private int cpf_FuncionarioDTO;

    public int getIdUsuarioDTO() {
        return IdUsuarioDTO;
    }

    public void setIdUsuarioDTO(int IdUsuarioDTO) {
        this.IdUsuarioDTO = IdUsuarioDTO;
    }

    public String getNomeUsuarioDTO() {
        return nomeUsuarioDTO;
    }

    public void setNomeUsuarioDTO(String nomeUsuarioDTO) {
        this.nomeUsuarioDTO = nomeUsuarioDTO;
    }

    public String getSenhaUsuarioDTO() {
        return senhaUsuarioDTO;
    }

    public void setSenhaUsuarioDTO(String senhaUsuarioDTO) {
        this.senhaUsuarioDTO = senhaUsuarioDTO;
    }

    public int getCpf_FuncionarioDTO() {
        return cpf_FuncionarioDTO;
    }

    public void setCpf_FuncionarioDTO(int cpf_FuncionarioDTO) {
        this.cpf_FuncionarioDTO = cpf_FuncionarioDTO;
    }
}
