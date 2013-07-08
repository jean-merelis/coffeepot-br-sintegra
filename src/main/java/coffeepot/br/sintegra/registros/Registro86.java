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


import coffeepot.br.sintegra.tipos.DocumentoFiscal;
import java.util.Date;

/**
 * Este registro se destina a informar dados relativos a remessa com fim
 * específico de exportação com declaração de exportação averbada, obrigatório
 * para as Empresas Comerciais Exportadoras e "Trading Companies".
 *
 * @author Jeandeson O. Merelis
 */
public class Registro86 {

    private long numeroRegistro;
    private Date dataRegistro;
    private String cnpjContribuinte;
    private String inscricaoContribuinte;
    private String ufContribuinte;
    private String numeroNotaFiscal;
    private Date dataEmissaoDocumento;
    private DocumentoFiscal modeloDocumento;
    private int serieDocumento;
    private String codigoProduto;
    private Double quantidadeExportada;
    private Double valorUnitarioProduto;
    private Double valorTotalProduto;
    private int codigoRelacionamento;

    public String getCnpjContribuinte() {
        return cnpjContribuinte;
    }

    public void setCnpjContribuinte(String cnpjContribuinte) {
        this.cnpjContribuinte = cnpjContribuinte;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public int getCodigoRelacionamento() {
        return codigoRelacionamento;
    }

    public void setCodigoRelacionamento(int codigoRelacionamento) {
        this.codigoRelacionamento = codigoRelacionamento;
    }

    public Date getDataEmissaoDocumento() {
        return dataEmissaoDocumento;
    }

    public void setDataEmissaoDocumento(Date dataEmissaoDocumento) {
        this.dataEmissaoDocumento = dataEmissaoDocumento;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getInscricaoContribuinte() {
        return inscricaoContribuinte;
    }

    public void setInscricaoContribuinte(String inscricaoContribuinte) {
        this.inscricaoContribuinte = inscricaoContribuinte;
    }

    public DocumentoFiscal getModeloDocumento() {
        return modeloDocumento;
    }

    public void setModeloDocumento(DocumentoFiscal modeloDocumento) {
        this.modeloDocumento = modeloDocumento;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public long getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(long numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Double getQuantidadeExportada() {
        return quantidadeExportada;
    }

    public void setQuantidadeExportada(Double quantidadeExportada) {
        this.quantidadeExportada = quantidadeExportada;
    }

    public int getSerieDocumento() {
        return serieDocumento;
    }

    public void setSerieDocumento(int serieDocumento) {
        this.serieDocumento = serieDocumento;
    }

    public String getUfContribuinte() {
        return ufContribuinte;
    }

    public void setUfContribuinte(String ufContribuinte) {
        this.ufContribuinte = ufContribuinte;
    }

    public Double getValorTotalProduto() {
        return valorTotalProduto;
    }

    public void setValorTotalProduto(Double valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }

    public Double getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(Double valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }
}
