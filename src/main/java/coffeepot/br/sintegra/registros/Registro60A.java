/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

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
    @Field(name = "", constantValue = "60A"),
    @Field(name = "dataEmissao", length = 8, padding = '0'),
    @Field(name = "numeroSerieEquipamento", length = 20, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "totalizadorParcial", length = 4),
    @Field(name = "valorAcumulado", length = 12, padding = '0', align = Align.RIGHT, params = "scale=2"),
    @Field(name = "spacer", length = 79, constantValue = " ")
})
public class Registro60A {

    private Date dataEmissao;
    private String numeroSerieEquipamento;
    private String totalizadorParcial;
    private Double valorAcumulado;

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNumeroSerieEquipamento() {
        return numeroSerieEquipamento;
    }

    public void setNumeroSerieEquipamento(String numeroSerieEquipamento) {
        this.numeroSerieEquipamento = numeroSerieEquipamento;
    }

    public String getTotalizadorParcial() {
        return totalizadorParcial;
    }

    public void setTotalizadorParcial(String totalizadorParcial) {
        this.totalizadorParcial = totalizadorParcial;
    }

    public Double getValorAcumulado() {
        return valorAcumulado;
    }

    public void setValorAcumulado(Double valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }
}
