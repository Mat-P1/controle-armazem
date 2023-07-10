package br.org.ce.senai.DTO;


/**
 *
 * @author Mateus
 */
public class FuncionarioDTO {
    private int idFuncionarioDTO,idArmazemFuncionarioDTO; 
    private Long CPFDTO;
    private String nomeFuncionarioDTO, funcaoFuncionarioDTO;
    private double salarioFuncionarioDTO;

    public double getSalarioFuncionarioDTO() {
        return salarioFuncionarioDTO;
    }

    public void setSalarioFuncionarioDTO(double salarioFuncionarioDTO) {
        this.salarioFuncionarioDTO = salarioFuncionarioDTO;
    }

    public int getIdFuncionarioDTO() {
        return idFuncionarioDTO;
    }

    public void setIdFuncionarioDTO(int idFuncionarioDTO) {
        this.idFuncionarioDTO = idFuncionarioDTO;
    }

    public Long getCPFDTO() {
        return CPFDTO;
    }

    public void setCPFDTO(Long CPFDTO) {
        this.CPFDTO = CPFDTO;
    }

    public int getIdArmazemFuncionarioDTO() {
        return idArmazemFuncionarioDTO;
    }

    public void setIdArmazemFuncionarioDTO(int idArmazemFuncionarioDTO) {
        this.idArmazemFuncionarioDTO = idArmazemFuncionarioDTO;
    }

    public String getNomeFuncionarioDTO() {
        return nomeFuncionarioDTO;
    }

    public void setNomeFuncionarioDTO(String nomeFuncionarioDTO) {
        this.nomeFuncionarioDTO = nomeFuncionarioDTO;
    }

    public String getFuncaoFuncionarioDTO() {
        return funcaoFuncionarioDTO;
    }

    public void setFuncaoFuncionarioDTO(String funcaoFuncionarioDTO) {
        this.funcaoFuncionarioDTO = funcaoFuncionarioDTO;
    }
}
