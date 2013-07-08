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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sintegra.tipos.DocumentoFiscal;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "54"),
    @Field(name = "cpfCnpj", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "serieDocumento", length = 3),
    @Field(name = "numeroDocumento", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "cfop", length = 4, padding = '0', align = Align.RIGHT),
    @Field(name = "cst", length = 3),
    @Field(name = "numeroItem", length = 3, padding = '0', align = Align.RIGHT),
    @Field(name = "codigoProduto", length = 14),
    @Field(name = "quantidade", length = 11, padding = '0', align = Align.RIGHT, params = "scale=3"),
    @Field(name = "valorBrutoItem", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorDesconto", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "basedeCalculoIcms", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "baseDeCalculoIcmsST", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorIpi", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "aliquotaIcms", length = 4, padding = '0', align = Align.RIGHT, params = "scale=2")
})
public class Registro54 {

    private Double aliquotaIcms;
    private Double baseDeCalculoIcmsST;
    private Double basedeCalculoIcms;
    private Double quantidade;
    private Double valorDesconto;
    private Double valorIpi;
    private Double valorBrutoItem;
    private int numeroItem;
    private String cst;
    private String codigoProduto;
    private Integer cfop;
    private String cpfCnpj;
    private Integer numeroDocumento;
    private DocumentoFiscal modeloDocumento;
    private String serieDocumento;

    public Double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public Double getBaseDeCalculoIcmsST() {
        return baseDeCalculoIcmsST;
    }

    public void setBaseDeCalculoIcmsST(Double baseDeCalculoIcmsST) {
        this.baseDeCalculoIcmsST = baseDeCalculoIcmsST;
    }

    public Double getBasedeCalculoIcms() {
        return basedeCalculoIcms;
    }

    public void setBasedeCalculoIcms(Double basedeCalculoIcms) {
        this.basedeCalculoIcms = basedeCalculoIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public DocumentoFiscal getModeloDocumento() {
        return modeloDocumento;
    }

    public void setModeloDocumento(DocumentoFiscal modeloDocumento) {
        this.modeloDocumento = modeloDocumento;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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

    public String getSerieDocumento() {
        return serieDocumento;
    }

    public void setSerieDocumento(String serieDocumento) {
        this.serieDocumento = serieDocumento;
    }

    public Double getValorBrutoItem() {
        return valorBrutoItem;
    }

    public void setValorBrutoItem(Double valorBrutoItem) {
        this.valorBrutoItem = valorBrutoItem;
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
}
