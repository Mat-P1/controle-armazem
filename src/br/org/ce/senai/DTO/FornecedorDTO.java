package br.org.ce.senai.DTO;

/**
 *
 * @author Mateus
 */
public class FornecedorDTO {
    private int idFornecedorDTO;
    private String nomeFornecedorDTO, enderecoFornecedorDTO, telefoneFornecedorDTO, emailFornecedorDTO;
    private Long CNPJDTO;

    public int getIdFornecedorDTO() {
        return idFornecedorDTO;
    }

    public void setIdFornecedorDTO(int idFornecedorDTO) {
        this.idFornecedorDTO = idFornecedorDTO;
    }

    public Long getCNPJDTO() {
        return CNPJDTO;
    }

    public void setCNPJDTO(Long CNPJDTO) {
        this.CNPJDTO = CNPJDTO;
    }

    public String getNomeFornecedorDTO() {
        return nomeFornecedorDTO;
    }

    public void setNomeFornecedorDTO(String nomeFornecedorDTO) {
        this.nomeFornecedorDTO = nomeFornecedorDTO;
    }

    public String getEnderecoFornecedorDTO() {
        return enderecoFornecedorDTO;
    }

    public void setEnderecoFornecedorDTO(String enderecoFornecedorDTO) {
        this.enderecoFornecedorDTO = enderecoFornecedorDTO;
    }

    public String getTelefoneFornecedorDTO() {
        return telefoneFornecedorDTO;
    }

    public void setTelefoneFornecedorDTO(String telefoneFornecedorDTO) {
        this.telefoneFornecedorDTO = telefoneFornecedorDTO;
    }

    public String getEmailFornecedorDTO() {
        return emailFornecedorDTO;
    }

    public void setEmailFornecedorDTO(String emailFornecedorDTO) {
        this.emailFornecedorDTO = emailFornecedorDTO;
    }   
}
