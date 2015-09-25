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
import coffeepot.br.sintegra.tipos.EnumCodificado;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "56"),
    @Field(name = "cpfCnpj", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "serieDocumento", length = 3),
    @Field(name = "numeroDocumento", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "cfop", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "cst", length = 3),
    @Field(name = "numeroItem", length = 3, padding = '0', align = Align.RIGHT),
    @Field(name = "codigoProduto", length = 14),
    @Field(name = "tipoOperacao", length = 1),
    @Field(name = "cnpjConcessionaria", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "aliquotaIpi", length = 4, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "chassi", length = 17),
    @Field(name = "spacer", length = 39, constantValue = " ")
})
public class Registro56 {

    public enum TipoOperacao implements EnumCodificado {

        VENDA_PARA_CONCESSIONARIA("1"),
        FATURAMENTO_DIRETO_CONV_ICMS_51_00("2"),
        VENDA_DIRETA("3"),
        OUTRAS("0");
        private String codigo;

        private TipoOperacao(String codigo) {
            this.codigo = codigo;
        }

        @Override
        public String getCodigo() {
            return codigo;
        }
    }
    private String cpfCnpj;
    private DocumentoFiscal modeloDocumento;
    private String serieDocumento;
    private Integer numeroDocumento;
    private Integer cfop;
    private String cst;
    private Integer numeroItem;
    private String codigoProduto;
    private TipoOperacao tipoOperacao;
    private String cnpjConcessionaria;
    private Double aliquotaIpi;
    private String chassi;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
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

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public String getCnpjConcessionaria() {
        return cnpjConcessionaria;
    }

    public void setCnpjConcessionaria(String cnpjConcessionaria) {
        this.cnpjConcessionaria = cnpjConcessionaria;
    }

    public Double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(Double AliquotaIpi) {
        this.aliquotaIpi = AliquotaIpi;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
