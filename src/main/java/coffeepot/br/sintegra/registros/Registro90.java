/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "90"),
    @Field(name = "cnpj", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "ie", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "totalizadores", length = 95),
    @Field(name = "quantidadeR90", length = 1)
})
public class Registro90 {

    private String cnpj;
    private String ie;
    private String totalizadores;
    private Integer quantidadeR90;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getTotalizadores() {
        return totalizadores;
    }

    public void setTotalizadores(String totalizadores) {
        this.totalizadores = totalizadores;
    }

    public Integer getQuantidadeR90() {
        return quantidadeR90;
    }

    public void setQuantidadeR90(Integer quantidadeR90) {
        this.quantidadeR90 = quantidadeR90;
    }
}
