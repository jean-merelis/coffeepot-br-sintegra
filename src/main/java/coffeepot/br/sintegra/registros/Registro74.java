/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sintegra.tipos.CodigoDePosse;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "74"),
    @Field(name = "dataInventario", length = 8, padding = '0'),
    @Field(name = "codigoProduto", length = 14),
    @Field(name = "quantidade", length = 13, padding = '0', align = Align.RIGHT, params = "scale=3"),
    @Field(name = "valorTotalProduto", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "codigoPosse", length = 1),
    @Field(name = "cnpjPossuidor", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "iePossuidor", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "ufPossuidor", length = 2),
    @Field(name = "spacer", length = 45, constantValue = " ")
})
public class Registro74 {

    private Double valorTotalProduto;
    private CodigoDePosse codigoPosse;
    private String iePossuidor;
    private String codigoProduto;
    private String cnpjPossuidor;
    private String ufPossuidor;
    private Date dataInventario;
    private Double quantidade;

    public String getCnpjPossuidor() {
        return cnpjPossuidor;
    }

    public void setCnpjPossuidor(String cnpjPossuidor) {
        this.cnpjPossuidor = cnpjPossuidor;
    }

    public CodigoDePosse getCodigoPosse() {
        return codigoPosse;
    }

    public void setCodigoPosse(CodigoDePosse codigoPosse) {
        this.codigoPosse = codigoPosse;
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

    public String getIePossuidor() {
        return iePossuidor;
    }

    public void setIePossuidor(String iePossuidor) {
        this.iePossuidor = iePossuidor;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getUfPossuidor() {
        return ufPossuidor;
    }

    public void setUfPossuidor(String ufPossuidor) {
        this.ufPossuidor = ufPossuidor;
    }

    public Double getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto(Double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }
}
