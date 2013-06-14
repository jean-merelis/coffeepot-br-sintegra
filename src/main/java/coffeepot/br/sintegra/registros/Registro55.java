/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "55"),
    @Field(name = "cnpjSubstituto", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "ieSubstituto", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "dataPagamento", length = 8, padding = '0'),
    @Field(name = "ufSubstituto", length = 2),
    @Field(name = "ufFavorecida", length = 2),
    @Field(name = "bancoGnre", length = 3, padding = '0', align = Align.RIGHT),
    @Field(name = "agenciaGnre", length = 4, padding = '0', align = Align.RIGHT),
    @Field(name = "numeroAutenticacao", length = 20),
    @Field(name = "valorRecolhido", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "dataPagamento", length = 8, padding = '0'),
    @Field(name = "mesAnoReferencia", length = 6, padding = '0'),
    @Field(name = "numeroConvenio", length = 30)
})
public class Registro55 {

    private Double valorRecolhido;
    private Integer agenciaGnre;
    private Integer bancoGnre;
    private String numeroConvenio;
    private String ieSubstituto;
    private String cnpjSubstituto;
    private String ufSubstituto;
    private String ufFavorecida;
    private String numeroAutenticacao;
    private Date dataPagamento;
    private Date dataVencimento;
    private String mesAnoReferencia;

    public Integer getAgenciaGnre() {
        return agenciaGnre;
    }

    public void setAgenciaGnre(Integer agenciaGnre) {
        this.agenciaGnre = agenciaGnre;
    }

    public Integer getBancoGnre() {
        return bancoGnre;
    }

    public void setBancoGnre(Integer bancoGnre) {
        this.bancoGnre = bancoGnre;
    }

    public String getCnpjSubstituto() {
        return cnpjSubstituto;
    }

    public void setCnpjSubstituto(String cnpjSubstituto) {
        this.cnpjSubstituto = cnpjSubstituto;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getIeSubstituto() {
        return ieSubstituto;
    }

    public void setIeSubstituto(String ieSubstituto) {
        this.ieSubstituto = ieSubstituto;
    }

    public String getMesAnoReferencia() {
        return mesAnoReferencia;
    }

    public void setMesAnoReferencia(String mesAnoReferencia) {
        this.mesAnoReferencia = mesAnoReferencia;
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getNumeroAutenticacao() {
        return numeroAutenticacao;
    }

    public void setNumeroAutenticacao(String numeroAutenticacao) {
        this.numeroAutenticacao = numeroAutenticacao;
    }

    public String getUfFavorecida() {
        return ufFavorecida;
    }

    public void setUfFavorecida(String ufFavorecida) {
        this.ufFavorecida = ufFavorecida;
    }

    public String getUfSubstituto() {
        return ufSubstituto;
    }

    public void setUfSubstituto(String ufSubstituto) {
        this.ufSubstituto = ufSubstituto;
    }

    public Double getValorRecolhido() {
        return valorRecolhido;
    }

    public void setValorRecolhido(Double valorRecolhido) {
        this.valorRecolhido = valorRecolhido;
    }
}
