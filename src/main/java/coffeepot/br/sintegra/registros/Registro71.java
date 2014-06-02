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
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "71"),
    @Field(name = "cpfCnpjTomador", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "inscricaoEstadualTomador", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "dataEmissaoConhecimento", length = 8, padding = '0'),
    @Field(name = "ufTomador", length = 2),
    @Field(name = "modeloConhecimento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "serieConhecimento", length = 1),
    @Field(name = "subSerieConhecimento", length = 2),
    @Field(name = "numeroConhecimento", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "ufDestinatarioRemetente", length = 2),
    @Field(name = "cpfCnpjDestinatarioRemetente", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "inscricaoDestinatarioRemetente", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "dataEmissaoDocumento", length = 8, padding = '0'),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "serieDocumento", length = 3),
    @Field(name = "numeroDocumento", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "valorTotalDocumento", length = 14, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "brancos", length = 12, constantValue = " ")
})
public class Registro71 {

    private String cpfCnpjTomador;
    private String inscricaoEstadualTomador;
    private Date dataEmissaoConhecimento;
    private String ufTomador;
    private DocumentoFiscal modeloConhecimento;
    private String serieConhecimento;
    private String subSerieConhecimento;
    private Integer numeroConhecimento;
    private String ufDestinatarioRemetente;
    private String cpfCnpjDestinatarioRemetente;
    private String inscricaoDestinatarioRemetente;
    private Date dataEmissaoDocumento;
    private DocumentoFiscal modeloDocumento;
    private String serieDocumento;
    private String numeroDocumento;
    private Double valorTotalDocumento;

    public String getCpfCnpjTomador() {
        return cpfCnpjTomador;
    }

    public void setCpfCnpjTomador(String cpfCnpjTomador) {
        this.cpfCnpjTomador = cpfCnpjTomador;
    }

    public String getInscricaoEstadualTomador() {
        return inscricaoEstadualTomador;
    }

    public void setInscricaoEstadualTomador(String inscricaoEstadualTomador) {
        this.inscricaoEstadualTomador = inscricaoEstadualTomador;
    }

    public Date getDataEmissaoConhecimento() {
        return dataEmissaoConhecimento;
    }

    public void setDataEmissaoConhecimento(Date dataEmissaoConhecimento) {
        this.dataEmissaoConhecimento = dataEmissaoConhecimento;
    }

    public String getUfTomador() {
        return ufTomador;
    }

    public void setUfTomador(String ufTomador) {
        this.ufTomador = ufTomador;
    }

    public DocumentoFiscal getModeloConhecimento() {
        return modeloConhecimento;
    }

    public void setModeloConhecimento(DocumentoFiscal modeloConhecimento) {
        this.modeloConhecimento = modeloConhecimento;
    }

    public String getSerieConhecimento() {
        return serieConhecimento;
    }

    public void setSerieConhecimento(String serieConhecimento) {
        this.serieConhecimento = serieConhecimento;
    }

    public String getSubSerieConhecimento() {
        return subSerieConhecimento;
    }

    public void setSubSerieConhecimento(String subSerieConhecimento) {
        this.subSerieConhecimento = subSerieConhecimento;
    }

    public Integer getNumeroConhecimento() {
        return numeroConhecimento;
    }

    public void setNumeroConhecimento(Integer numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
    }

    public String getUfDestinatarioRemetente() {
        return ufDestinatarioRemetente;
    }

    public void setUfDestinatarioRemetente(String ufDestinatarioRemetente) {
        this.ufDestinatarioRemetente = ufDestinatarioRemetente;
    }

    public String getCpfCnpjDestinatarioRemetente() {
        return cpfCnpjDestinatarioRemetente;
    }

    public void setCpfCnpjDestinatarioRemetente(String cpfCnpjDestinatarioRemetente) {
        this.cpfCnpjDestinatarioRemetente = cpfCnpjDestinatarioRemetente;
    }

    public String getInscricaoDestinatarioRemetente() {
        return inscricaoDestinatarioRemetente;
    }

    public void setInscricaoDestinatarioRemetente(String inscricaoDestinatarioRemetente) {
        this.inscricaoDestinatarioRemetente = inscricaoDestinatarioRemetente;
    }

    public Date getDataEmissaoDocumento() {
        return dataEmissaoDocumento;
    }

    public void setDataEmissaoDocumento(Date dataEmissaoDocumento) {
        this.dataEmissaoDocumento = dataEmissaoDocumento;
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

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Double getValorTotalDocumento() {
        return valorTotalDocumento;
    }

    public void setValorTotalDocumento(Double valorTotalDocumento) {
        this.valorTotalDocumento = valorTotalDocumento;
    }
}
