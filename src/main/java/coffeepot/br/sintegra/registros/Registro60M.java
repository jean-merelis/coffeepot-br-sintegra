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
import java.util.List;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "60M"),
    @Field(name = "dataEmissao", length = 8, padding = '0'),
    @Field(name = "numeroSerieEquipamento", length = 20, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "numeroOrdem", length = 3, padding = '0', align = Align.RIGHT),
    @Field(name = "modeloDocumento", length = 2, padding = '0', align = Align.RIGHT),
    @Field(name = "cooInicial", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "cooFinal", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "crz", length = 6, padding = '0', align = Align.RIGHT),
    @Field(name = "cro", length = 3, padding = '0', align = Align.RIGHT),
    @Field(name = "vendaBruta", length = 16, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "valorGT", length = 16, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "spacer", length = 37, constantValue = " "),
    @Field(name = "registros60A"),
    @Field(name = "registros60D"),
    @Field(name = "registros60I")
})
public class Registro60M {

    private Date dataEmissao;
    private String numeroSerieEquipamento;
    private Integer numeroOrdem;
    private String modeloDocumento;
    private Integer cooInicial;
    private Integer cooFinal;
    private Integer crz;
    private Integer cro;
    private Double vendaBruta;
    private Double valorGT;
    private List<Registro60A> registros60A;
    private List<Registro60D> registros60D;
    private List<Registro60I> registros60I;

    public int getCooFinal() {
        return cooFinal;
    }

    public void setCooFinal(int cooFinal) {
        this.cooFinal = cooFinal;
    }

    public int getCooInicial() {
        return cooInicial;
    }

    public void setCooInicial(int cooInicial) {
        this.cooInicial = cooInicial;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    public int getCrz() {
        return crz;
    }

    public void setCrz(int crz) {
        this.crz = crz;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getModeloDocumento() {
        return modeloDocumento;
    }

    public void setModeloDocumento(String modeloDocumento) {
        this.modeloDocumento = modeloDocumento;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    public void setNumeroOrdem(int numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
    }

    public String getNumeroSerieEquipamento() {
        return numeroSerieEquipamento;
    }

    public void setNumeroSerieEquipamento(String numeroSerieEquipamento) {
        this.numeroSerieEquipamento = numeroSerieEquipamento;
    }

    public List<Registro60A> getRegistros60A() {
        return registros60A;
    }

    public void setRegistros60A(List<Registro60A> registros60A) {
        this.registros60A = registros60A;
    }

    public List<Registro60D> getRegistros60D() {
        return registros60D;
    }

    public void setRegistros60D(List<Registro60D> registros60D) {
        this.registros60D = registros60D;
    }

    public List<Registro60I> getRegistros60I() {
        return registros60I;
    }

    public void setRegistros60I(List<Registro60I> registros60I) {
        this.registros60I = registros60I;
    }

    public Double getValorGT() {
        return valorGT;
    }

    public void setValorGT(Double valorGT) {
        this.valorGT = valorGT;
    }

    public Double getVendaBruta() {
        return vendaBruta;
    }

    public void setVendaBruta(Double vendaBruta) {
        this.vendaBruta = vendaBruta;
    }
}
