/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sintegra.tipos.Emitente;
import coffeepot.br.sintegra.tipos.DocumentoFiscal;
import coffeepot.br.sintegra.tipos.SituacaoDocumentoFiscal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "50"),
    @Field(name = "cpfCnpj", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "ie", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "dataDocumento", length = 8, padding = '0'),
    @Field(name = "uf", length = 2),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "serieDocumento", length = 3),
    @Field(name = "numeroDocumento", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "cfop", length = 4, padding = '0', align = Align.RIGHT),
    @Field(name = "emitente", length = 1),
    @Field(name = "valorTotal", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "baseDeCalculoIcms", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorIcms", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorIsentas", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorOutras", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "aliquotaIcms", length = 4, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "situacaoDocumento", length = 1)
})
public class Registro50 {

    private Double valorOutras;
    private SituacaoDocumentoFiscal situacaoDocumento;
    private Double aliquotaIcms;
    private Double valorIsentas;
    private Double valorIcms;
    private Double valorTotal;
    private Double baseDeCalculoIcms;
    private Emitente emitente;
    private int cfop;
    private String ie;
    private String uf;
    private String serieDocumento;
    private String cpfCnpj;
    private DocumentoFiscal modeloDocumento;
    private int numeroDocumento;
    private Date dataDocumento;
    private List<Registro54> registros54 = new ArrayList<>();
    private List<Registro56> registros56 = new ArrayList<>();

    public Double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public Double getBaseDeCalculoIcms() {
        return baseDeCalculoIcms;
    }

    public void setBaseDeCalculoIcms(Double baseDeCalculoIcms) {
        this.baseDeCalculoIcms = baseDeCalculoIcms;
    }

    public int getCfop() {
        return cfop;
    }

    public void setCfop(int cfop) {
        this.cfop = cfop;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Date getDataDocumento() {
        return dataDocumento;
    }

    public void setDataDocumento(Date dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    public Emitente getEmitente() {
        return emitente;
    }

    public void setEmitente(Emitente emitente) {
        this.emitente = emitente;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public DocumentoFiscal getModeloDocumento() {
        return modeloDocumento;
    }

    public void setModeloDocumento(DocumentoFiscal modeloDocumento) {
        this.modeloDocumento = modeloDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public List<Registro54> getRegistros54() {
        return registros54;
    }

    public void setRegistros54(List<Registro54> registros54) {
        this.registros54 = registros54;
    }

    public List<Registro56> getRegistros56() {
        return registros56;
    }

    public void setRegistros56(List<Registro56> registros56) {
        this.registros56 = registros56;
    }

    public String getSerieDocumento() {
        return serieDocumento;
    }

    public void setSerieDocumento(String serieDocumento) {
        this.serieDocumento = serieDocumento;
    }

    public SituacaoDocumentoFiscal getSituacaoDocumento() {
        return situacaoDocumento;
    }

    public void setSituacaoDocumento(SituacaoDocumentoFiscal situacaoDocumento) {
        this.situacaoDocumento = situacaoDocumento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(Double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public Double getValorIsentas() {
        return valorIsentas;
    }

    public void setValorIsentas(Double valorIsentas) {
        this.valorIsentas = valorIsentas;
    }

    public Double getValorOutras() {
        return valorOutras;
    }

    public void setValorOutras(Double valorOutras) {
        this.valorOutras = valorOutras;
    }
}
