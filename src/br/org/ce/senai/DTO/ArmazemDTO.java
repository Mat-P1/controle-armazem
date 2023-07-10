package br.org.ce.senai.DTO;

/**
 *
 * @author Mateus
 */
public class ArmazemDTO {
    private int idArmazemDTO;
    private String nomeArmazemDTO, enderecoArmazemDTO, telefoneArmazemDTO;

    public int getIdArmazemDTO() {
        return idArmazemDTO;
    }

    public void setIdArmazemDTO(int idArmazemDTO) {
        this.idArmazemDTO = idArmazemDTO;
    }

    public String getNomeArmazemDTO() {
        return nomeArmazemDTO;
    }

    public void setNomeArmazemDTO(String nomeArmazemDTO) {
        this.nomeArmazemDTO = nomeArmazemDTO;
    }

    public String getEnderecoArmazemDTO() {
        return enderecoArmazemDTO;
    }

    public void setEnderecoArmazemDTO(String enderecoArmazemDTO) {
        this.enderecoArmazemDTO = enderecoArmazemDTO;
    }

    public String getTelefoneArmazemDTO() {
        return telefoneArmazemDTO;
    }

    public void setTelefoneArmazemDTO(String telefoneArmazemDTO) {
        this.telefoneArmazemDTO = telefoneArmazemDTO;
    }
}
