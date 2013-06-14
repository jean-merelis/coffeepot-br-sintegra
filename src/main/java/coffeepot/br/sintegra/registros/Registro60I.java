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
    @Field(name = "", constantValue = "60I"),
    @Field(name = "dataEmissao", length = 8, padding = '0'),
    @Field(name = "numeroSerieEquipamento", length = 20, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "coo", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "numeroItem", length = 3, padding = '0', align = Align.RIGHT),
    @Field(name = "codigoProduto", length = 14),
    @Field(name = "quantidade", length = 13, padding = '0', align = Align.RIGHT, params = "scale=3"),
    @Field(name = "valorLiquido", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "baseDeCalculoIcms", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "totalizadorParcial", length = 4),
    @Field(name = "valorIcms", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "spacer", length = 16, constantValue = " ")
})
public class Registro60I {

    private Date dataEmissao;
    private String numeroSerieEquipamento;
    private String modeloDocumento;
    private String totalizadorParcial;
    private Double valorLiquido;
    private String codigoProduto;
    private Double valorIcms;
    private Double quantidade;
    private Double baseDeCalculoIcms;
    private Integer numeroItem;
    private Integer coo;

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNumeroSerieEquipamento() {
        return numeroSerieEquipamento;
    }

    public void setNumeroSerieEquipamento(String numeroSerieEquipamento) {
        this.numeroSerieEquipamento = numeroSerieEquipamento;
    }

    public String getModeloDocumento() {
        return modeloDocumento;
    }

    public void setModeloDocumento(String modeloDocumento) {
        this.modeloDocumento = modeloDocumento;
    }

    public String getTotalizadorParcial() {
        return totalizadorParcial;
    }

    public void setTotalizadorParcial(String totalizadorParcial) {
        this.totalizadorParcial = totalizadorParcial;
    }

    public Double getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(Double valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(Double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getBaseDeCalculoIcms() {
        return baseDeCalculoIcms;
    }

    public void setBaseDeCalculoIcms(Double baseDeCalculoIcms) {
        this.baseDeCalculoIcms = baseDeCalculoIcms;
    }

    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public Integer getCoo() {
        return coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }
}
