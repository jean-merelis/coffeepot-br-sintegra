/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Registro88STES {

    private String cnpj;
    private Date dataInventario;
    private String codigoProduto;
    private Double quantidade;
    private Double valorICMSST;
    private Double valorICMSOP;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Date getDataInventario() {
        return dataInventario;
    }

    public void setDataInventario(Date dataInventario) {
        this.dataInventario = dataInventario;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorICMSOP() {
        return valorICMSOP;
    }

    public void setValorICMSOP(Double valorICMSOP) {
        this.valorICMSOP = valorICMSOP;
    }

    public Double getValorICMSST() {
        return valorICMSST;
    }

    public void setValorICMSST(Double valorICMSST) {
        this.valorICMSST = valorICMSST;
    }
    
    
}
