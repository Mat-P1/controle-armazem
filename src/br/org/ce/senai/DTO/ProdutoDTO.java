package br.org.ce.senai.DTO;

/**
 *
 * @author Mateus
 */
public class ProdutoDTO {
    private int idProdutoDTO, qtdProdutoDTO, idArmazemProdutoDTO, idFornecedorProdutoDTO;
    private String nomeProdutoDTO, dataEntregaProdutoDTO, numeroSerialProdutoDTO;
    private double valorProdutoDTO;

    public int getIdProdutoDTO() {
        return idProdutoDTO;
    }

    public void setIdProdutoDTO(int idProdutoDTO) {
        this.idProdutoDTO = idProdutoDTO;
    }

    public int getQtdProdutoDTO() {
        return qtdProdutoDTO;
    }

    public void setQtdProdutoDTO(int qtdProdutoDTO) {
        this.qtdProdutoDTO = qtdProdutoDTO;
    }

    public int getIdArmazemProdutoDTO() {
        return idArmazemProdutoDTO;
    }

    public void setIdArmazemProdutoDTO(int idArmazemProdutoDTO) {
        this.idArmazemProdutoDTO = idArmazemProdutoDTO;
    }

    public int getIdFornecedorProdutoDTO() {
        return idFornecedorProdutoDTO;
    }

    public void setIdFornecedorProdutoDTO(int idFornecedorProdutoDTO) {
        this.idFornecedorProdutoDTO = idFornecedorProdutoDTO;
    }

    public String getNomeProdutoDTO() {
        return nomeProdutoDTO;
    }

    public void setNomeProdutoDTO(String nomeProdutoDTO) {
        this.nomeProdutoDTO = nomeProdutoDTO;
    }

    public String getNumeroSerialProdutoDTO() {
        return numeroSerialProdutoDTO;
    }

    public void setNumeroSerialProdutoDTO(String numeroSerialProdutoDTO) {
        this.numeroSerialProdutoDTO = numeroSerialProdutoDTO;
    }

    public double getValorProdutoDTO() {
        return valorProdutoDTO;
    }

    public void setValorProdutoDTO(double valorProdutoDTO) {
        this.valorProdutoDTO = valorProdutoDTO;
    }

    public String getDataEntregaProdutoDTO() {
        return dataEntregaProdutoDTO;
    }

    public void setDataEntregaProdutoDTO(String dataEntrega) {
        this.dataEntregaProdutoDTO = dataEntrega;
    }   
}
