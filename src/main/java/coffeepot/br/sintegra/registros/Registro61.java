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


import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sintegra.tipos.DocumentoFiscal;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "61"),
    @Field(name = "spacer", length = 28, constantValue = " "),
    @Field(name = "dataEmissao", length = 8, padding = '0'),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "serieDocumento", length = 3),
    @Field(name = "subSerieDocumento", length = 2),
    @Field(name = "numeroOrdemInicial", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "numeroOrdemFinal", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "valorTotal", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "totalBaseDeCalculoIcms", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorTotalIcms", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorTotalIsentas", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorTotalOutras", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "aliquotaIcms", length = 4, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "spacer", length = 1, constantValue = " ")
})
public class Registro61 {

    private Date dataEmissao;
    private Double valorTotal;
    private Double valorTotalIcms;
    private Double valorTotalOutras;
    private Double totalBaseDeCalculoIcms;
    private Double valorTotalIsentas;
    private Integer numeroOrdemInicial;
    private Integer numeroOrdemFinal;
    private DocumentoFiscal modeloDocumento;
    private String subSerieDocumento;
    private String serieDocumento;
    private Double aliquotaIcms;

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorTotalIcms() {
        return valorTotalIcms;
    }

    public void setValorTotalIcms(Double valorTotalIcms) {
        this.valorTotalIcms = valorTotalIcms;
    }

    public Double getValorTotalOutras() {
        return valorTotalOutras;
    }

    public void setValorTotalOutras(Double valorTotalOutras) {
        this.valorTotalOutras = valorTotalOutras;
    }

    public Double getTotalBaseDeCalculoIcms() {
        return totalBaseDeCalculoIcms;
    }

    public void setTotalBaseDeCalculoIcms(Double totalBaseDeCalculoIcms) {
        this.totalBaseDeCalculoIcms = totalBaseDeCalculoIcms;
    }

    public Double getValorTotalIsentas() {
        return valorTotalIsentas;
    }

    public void setValorTotalIsentas(Double valorTotalIsentas) {
        this.valorTotalIsentas = valorTotalIsentas;
    }

    public Integer getNumeroOrdemInicial() {
        return numeroOrdemInicial;
    }

    public void setNumeroOrdemInicial(Integer numeroOrdemInicial) {
        this.numeroOrdemInicial = numeroOrdemInicial;
    }

    public Integer getNumeroOrdemFinal() {
        return numeroOrdemFinal;
    }

    public void setNumeroOrdemFinal(Integer numeroOrdemFinal) {
        this.numeroOrdemFinal = numeroOrdemFinal;
    }

    public DocumentoFiscal getModeloDocumento() {
        return modeloDocumento;
    }

    public void setModeloDocumento(DocumentoFiscal modeloDocumento) {
        this.modeloDocumento = modeloDocumento;
    }

    public String getSubSerieDocumento() {
        return subSerieDocumento;
    }

    public void setSubSerieDocumento(String subSerieDocumento) {
        this.subSerieDocumento = subSerieDocumento;
    }

    public String getSerieDocumento() {
        return serieDocumento;
    }

    public void setSerieDocumento(String serieDocumento) {
        this.serieDocumento = serieDocumento;
    }

    public Double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }
}
