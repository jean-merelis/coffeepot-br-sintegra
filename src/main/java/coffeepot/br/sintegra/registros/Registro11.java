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
    @Field(name = "", constantValue = "11"),
    @Field(name = "logradouro", length = 34),
    @Field(name = "numero", length = 5, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "complemento", length = 22),
    @Field(name = "bairro", length = 15),
    @Field(name = "cep", length = 8, padding = '0', params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "responsavel", length = 28),
    @Field(name = "telefone", length = 12, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY)
})
public class Registro11 {

    private String responsavel;
    private String bairro;
    private String cep;
    private Integer numero;
    private String complemento;
    private String logradouro;
    private String telefone;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
