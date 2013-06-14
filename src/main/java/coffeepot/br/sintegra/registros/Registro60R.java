/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.types.Align;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "60R"),
    @Field(name = "mesAno", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "codigoProduto", length = 14),
    @Field(name = "quantidade", length = 13, padding = '0', align = Align.RIGHT, params = "scale=3"),
    @Field(name = "valorLiquidoProduto", length = 16, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "baseDeCalculoIcms", length = 16, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "totalizadorParcial", length = 4),
    @Field(name = "spacer", length = 54, constantValue = " ")
})
public class Registro60R {

    private Double baseDeCalculoIcms;
    private Double valorLiquidoProduto;
    private Double quantidade;
    private String mesAno;
    private String codigoProduto;
    private String totalizadorParcial;

    public Double getBaseDeCalculoIcms() {
        return baseDeCalculoIcms;
    }

    public void setBaseDeCalculoIcms(Double baseDeCalculoIcms) {
        this.baseDeCalculoIcms = baseDeCalculoIcms;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getMesAno() {
        return mesAno;
    }

    public void setMesAno(String mesAno) {
        this.mesAno = mesAno;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getTotalizadorParcial() {
        return totalizadorParcial;
    }

    public void setTotalizadorParcial(String totalizadorParcial) {
        this.totalizadorParcial = totalizadorParcial;
    }

    public Double getValorLiquidoProduto() {
        return valorLiquidoProduto;
    }

    public void setValorLiquidoProduto(Double valorLiquidoProduto) {
        this.valorLiquidoProduto = valorLiquidoProduto;
    }
}
