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
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "75"),
    @Field(name = "dataInicial", length = 8, padding = '0'),
    @Field(name = "dataFinal", length = 8, padding = '0'),
    @Field(name = "codigoProduto", length = 14),
    @Field(name = "ncm", length = 8, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "descricaoProduto", length = 53),
    @Field(name = "unidade", length = 6),
    @Field(name = "aliquotaIpi", length = 5, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "aliquotaIcms", length = 4, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "percentualReducaoBaseCalculoIcms", length = 5, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "baseCalculoIcmsST", length = 13, padding = '0', align = Align.RIGHT, params = "scale=2")
})
public class Registro75 {

    private String codigoProduto;
    private String descricaoProduto;
    private Double percentualReducaoBaseCalculoIcms;
    private Double baseCalculoIcmsST;
    private Double aliquotaIpi;
    private String ncm;
    private String unidade;
    private Double aliquotaIcms;
    private Date dataFinal;
    private Date dataInicial;

    public Double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(Double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public Double getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(Double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public Double getBaseCalculoIcmsST() {
        return baseCalculoIcmsST;
    }

    public void setBaseCalculoIcmsST(Double baseCalculoIcmsST) {
        this.baseCalculoIcmsST = baseCalculoIcmsST;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Double getPercentualReducaoBaseCalculoIcms() {
        return percentualReducaoBaseCalculoIcms;
    }

    public void setPercentualReducaoBaseCalculoIcms(Double percentualReducaoBaseCalculoIcms) {
        this.percentualReducaoBaseCalculoIcms = percentualReducaoBaseCalculoIcms;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
