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
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sintegra.tipos.DocumentoFiscal;
import coffeepot.br.sintegra.tipos.Frete;
import coffeepot.br.sintegra.tipos.SituacaoDocumentoFiscal;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "70"),
    @Field(name = "cpfCnpj", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "ie", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "dataEmissaoUtilizacao", length = 8, padding = '0'),
    @Field(name = "uf", length = 2),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "serieDocumento", length = 1),
    @Field(name = "subSerieDocumento", length = 2),
    @Field(name = "numeroDocumento", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "cfop", length = 4, padding = '0', align = Align.RIGHT),
    @Field(name = "valorTotal", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "baseDeCalculoIcms", length = 14, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorIcms", length = 14, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorIsentas", length = 14, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorOutras", length = 14, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "tipoFrete", length = 1),
    @Field(name = "situacaoDocumento", length = 1)
})
public class Registro70 {

    private String cpfCnpj;
    private String ie;
    private Date dataEmissaoUtilizacao;
    private String uf;
    private DocumentoFiscal modeloDocumento;
    private String serieDocumento;
    private String subSerieDocumento;
    private Integer numeroDocumento;
    private Integer cfop;
    private Double valorTotal;
    private Double baseDeCalculoIcms;
    private Double valorIcms;
    private Double valorIsentas;
    private Double valorOutras;
    private Frete tipoFrete;
    private SituacaoDocumentoFiscal situacaoDocumento;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Date getDataEmissaoUtilizacao() {
        return dataEmissaoUtilizacao;
    }

    public void setDataEmissaoUtilizacao(Date dataEmissaoUtilizacao) {
        this.dataEmissaoUtilizacao = dataEmissaoUtilizacao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public DocumentoFiscal getModeloDocumento() {
        return modeloDocumento;
    }

    public void setModeloDocumento(DocumentoFiscal modeloDocumento) {
        this.modeloDocumento = modeloDocumento;
    }

    public String getSerieDocumento() {
        return serieDocumento;
    }

    public void setSerieDocumento(String serieDocumento) {
        this.serieDocumento = serieDocumento;
    }

    public String getSubSerieDocumento() {
        return subSerieDocumento;
    }

    public void setSubSerieDocumento(String subSerieDocumento) {
        this.subSerieDocumento = subSerieDocumento;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getBaseDeCalculoIcms() {
        return baseDeCalculoIcms;
    }

    public void setBaseDeCalculoIcms(Double baseDeCalculoIcms) {
        this.baseDeCalculoIcms = baseDeCalculoIcms;
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

    public Frete getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(Frete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public SituacaoDocumentoFiscal getSituacaoDocumento() {
        return situacaoDocumento;
    }

    public void setSituacaoDocumento(SituacaoDocumentoFiscal situacaoDocumento) {
        this.situacaoDocumento = situacaoDocumento;
    }
}
