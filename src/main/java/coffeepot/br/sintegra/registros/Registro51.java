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
import coffeepot.br.sintegra.tipos.SituacaoDocumentoFiscal;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "51"),
    @Field(name = "cpfCnpj", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "ie", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "dataDocumento", length = 8, padding = '0'),
    @Field(name = "uf", length = 2),
    @Field(name = "serieDocumento", length = 3),
    @Field(name = "numeroDocumento", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "cfop", length = 4, padding = '0', align = Align.RIGHT),
    @Field(name = "valorTotal", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorIpi", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorIsentas", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorOutras", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "", constantValue = " ", length = 20),
    @Field(name = "situacaoDocumento", length = 1)
})
public class Registro51 {

    private Double valorIpi;
    private Double valorTotal;
    private String serieDocumento;
    private Date dataDocumento;
    private String cpfCnpj;
    private Integer cfop;
    private Integer numeroDocumento;
    private String ie;
    private SituacaoDocumentoFiscal situacaoDocumento;
    private Double valorIsentas;
    private Double valorOutras;
    private String uf;

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
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

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
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
