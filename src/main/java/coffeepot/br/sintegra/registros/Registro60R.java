/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

/*
 * #%L
 * coffeepot-br-sintegra
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
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
