/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Registro88SP03 {

    private String cnpj;
    private String ie;
    private Date dataRecebimento;
    private String uf;
    private String modelo;
    private String serie;
    private String numero;
    private String cfop;
    private String emitente;
    private Double valorTotal;
    private Double baseCalculo;
    private Double valorIcms;
    private Double isentas;
    private Double outras;
    private Double aliquota;
    private String situacao;
    private String beneficioFiscal;
    private Double aliquotaInterna;
    private Date dataEmissao;
    private String microEmpresa;

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public Double getAliquotaInterna() {
        return aliquotaInterna;
    }

    public void setAliquotaInterna(Double aliquotaInterna) {
        this.aliquotaInterna = aliquotaInterna;
    }

    public Double getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(Double baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public String getBeneficioFiscal() {
        return beneficioFiscal;
    }

    public void setBeneficioFiscal(String beneficioFiscal) {
        this.beneficioFiscal = beneficioFiscal;
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

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Double getIsentas() {
        return isentas;
    }

    public void setIsentas(Double isentas) {
        this.isentas = isentas;
    }

    public String getMicroEmpresa() {
        return microEmpresa;
    }

    public void setMicroEmpresa(String microEmpresa) {
        this.microEmpresa = microEmpresa;
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

    public Double getOutras() {
        return outras;
    }

    public void setOutras(Double outras) {
        this.outras = outras;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(Double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    

}
