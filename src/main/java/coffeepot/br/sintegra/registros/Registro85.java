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
import coffeepot.br.sintegra.tipos.NaturezaOperacaoExportacao;
import java.util.Date;

/**
 * Este registro se destina a informar dados relativos à exportação, obrigatório
 * para os exportadores, inclusive Comerciais Exportadoras e "Trading
 * Companies".
 *
 * @author Jeandeson O. Merelis
 */
public class Registro85 {

    private long numeroDeclaracao;
    private Date dataDeclaracao;
    private NaturezaOperacaoExportacao naturezaExportacao;
    private long numeroRegistroExportacao;
    private Date dataRegistroExportacao;
    private String tipoConhecimento;
    private String numeroConhecimento;
    private Date dataConhecimento;
    private String codigoPaisDestino;
    private Date dataAverbacao;
    private String numeroNotaFiscal;
    private Date dataEmissaoNotaFiscal;
    private DocumentoFiscal modeloNotaFiscal;
    private int serieNotaFiscal;

    public String getCodigoPaisDestino() {
        return codigoPaisDestino;
    }

    public void setCodigoPaisDestino(String codigoPaisDestino) {
        this.codigoPaisDestino = codigoPaisDestino;
    }

    public Date getDataAverbacao() {
        return dataAverbacao;
    }

    public void setDataAverbacao(Date dataAverbacao) {
        this.dataAverbacao = dataAverbacao;
    }

    public Date getDataConhecimento() {
        return dataConhecimento;
    }

    public void setDataConhecimento(Date dataConhecimento) {
        this.dataConhecimento = dataConhecimento;
    }

    public Date getDataDeclaracao() {
        return dataDeclaracao;
    }

    public void setDataDeclaracao(Date dataDeclaracao) {
        this.dataDeclaracao = dataDeclaracao;
    }

    public Date getDataEmissaoNotaFiscal() {
        return dataEmissaoNotaFiscal;
    }

    public void setDataEmissaoNotaFiscal(Date dataEmissaoNotaFiscal) {
        this.dataEmissaoNotaFiscal = dataEmissaoNotaFiscal;
    }

    public Date getDataRegistroExportacao() {
        return dataRegistroExportacao;
    }

    public void setDataRegistroExportacao(Date dataRegistroExportacao) {
        this.dataRegistroExportacao = dataRegistroExportacao;
    }

    public DocumentoFiscal getModeloNotaFiscal() {
        return modeloNotaFiscal;
    }

    public void setModeloNotaFiscal(DocumentoFiscal modeloNotaFiscal) {
        this.modeloNotaFiscal = modeloNotaFiscal;
    }

    public NaturezaOperacaoExportacao getNaturezaExportacao() {
        return naturezaExportacao;
    }

    public void setNaturezaExportacao(NaturezaOperacaoExportacao naturezaExportacao) {
        this.naturezaExportacao = naturezaExportacao;
    }

    public String getNumeroConhecimento() {
        return numeroConhecimento;
    }

    public void setNumeroConhecimento(String numeroConhecimento) {
        this.numeroConhecimento = numeroConhecimento;
    }

    public long getNumeroDeclaracao() {
        return numeroDeclaracao;
    }

    public void setNumeroDeclaracao(long numeroDeclaracao) {
        this.numeroDeclaracao = numeroDeclaracao;
    }

    public String getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public long getNumeroRegistroExportacao() {
        return numeroRegistroExportacao;
    }

    public void setNumeroRegistroExportacao(long numeroRegistroExportacao) {
        this.numeroRegistroExportacao = numeroRegistroExportacao;
    }

    public int getSerieNotaFiscal() {
        return serieNotaFiscal;
    }

    public void setSerieNotaFiscal(int serieNotaFiscal) {
        this.serieNotaFiscal = serieNotaFiscal;
    }

    public String getTipoConhecimento() {
        return tipoConhecimento;
    }

    public void setTipoConhecimento(String tipoConhecimento) {
        this.tipoConhecimento = tipoConhecimento;
    }
}
