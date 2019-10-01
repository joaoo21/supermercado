/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Supermercado {
    private Integer codigo;
    private String nomefantasia;
    private String razaosocial;
    private LocalDate fundacao;
    private Integer nrfuncionarios;
    private Double valornabolsa;

//é necessário fazer a seguinte importação: java.time.LocalDate;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
    }

    public Integer getNrfuncionarios() {
        return nrfuncionarios;
    }

    public void setNrfuncionarios(Integer nrfuncionarios) {
        this.nrfuncionarios = nrfuncionarios;
    }

    public Double getValornabolsa() {
        return valornabolsa;
    }

    public void setValornabolsa(Double valornabolsa) {
        this.valornabolsa = valornabolsa;
    }

    @Override
    public String toString() {
        return nomefantasia;
    }
    
    
}
