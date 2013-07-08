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
import coffeepot.br.sintegra.tipos.Emitente;
import coffeepot.br.sintegra.tipos.SituacaoDocumentoFiscal;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "53"),
    @Field(name = "cnpj", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "ie", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "dataDocumento", length = 8, padding = '0'),
    @Field(name = "uf", length = 2),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "serieDocumento", length = 3),
    @Field(name = "numeroDocumento", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "cfop", length = 4, padding = '0', align = Align.RIGHT),
    @Field(name = "emitente", length = 1),
    @Field(name = "baseST", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "icmsRetido", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "despesas", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "situacaoDocumento", length = 1),
    @Field(name = "codigoAntecipacao", length = 1),
    @Field(name = "spacer", constantValue = " ", length = 29)
})
public class Registro53 {

    private String serieDocumento;
    private Date dataDocumento;
    private String cnpj;
    private Integer cfop;
    private int numeroDocumento;
    private String ie;
    private SituacaoDocumentoFiscal situacaoDocumento;
    private String uf;
    private Character codigoAntecipacao;
    private Double baseST;
    private DocumentoFiscal modeloDocumento;
    private Emitente emitente;
    private Double despesas;
    private Double icmsRetido;

    public Double getBaseST() {
        return baseST;
    }

    public void setBaseST(Double baseST) {
        this.baseST = baseST;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public Character getCodigoAntecipacao() {
        return codigoAntecipacao;
    }

    public void setCodigoAntecipacao(Character codigoAntecipacao) {
        this.codigoAntecipacao = codigoAntecipacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataDocumento() {
        return dataDocumento;
    }

    public void setDataDocumento(Date dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    public Double getDespesas() {
        return despesas;
    }

    public void setDespesas(Double despesas) {
        this.despesas = despesas;
    }

    public Emitente getEmitente() {
        return emitente;
    }

    public void setEmitente(Emitente emitente) {
        this.emitente = emitente;
    }

    public Double getIcmsRetido() {
        return icmsRetido;
    }

    public void setIcmsRetido(Double icmsRetido) {
        this.icmsRetido = icmsRetido;
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

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
}
