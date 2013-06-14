/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Registro88STITNF {

    private String cnpj;
    private String modelo;
    private String serie;
    private String numero;
    private String cfop;
    private String cst;
    private int numeroItem;
    private Date dataEntrada;
    private String codigoProduto;
    private Double quantidade;
    private Double valorProduto;
    private Double valorDesconto;
    private Double baseIcmsOp;
    private Double baseIcmsSt;
    private Double aliquotaIcmsSt;
    private Double aliquotaIcmsOp;
    private Double valorIpi;

    public Double getAliquotaIcmsOp() {
        return aliquotaIcmsOp;
    }

    public void setAliquotaIcmsOp(Double aliquotaIcmsOp) {
        this.aliquotaIcmsOp = aliquotaIcmsOp;
    }

    public Double getAliquotaIcmsSt() {
        return aliquotaIcmsSt;
    }

    public void setAliquotaIcmsSt(Double aliquotaIcmsSt) {
        this.aliquotaIcmsSt = aliquotaIcmsSt;
    }

    public Double getBaseIcmsOp() {
        return baseIcmsOp;
    }

    public void setBaseIcmsOp(Double baseIcmsOp) {
        this.baseIcmsOp = baseIcmsOp;
    }

    public Double getBaseIcmsSt() {
        return baseIcmsSt;
    }

    public void setBaseIcmsSt(Double baseIcmsSt) {
        this.baseIcmsSt = baseIcmsSt;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

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

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    
}
