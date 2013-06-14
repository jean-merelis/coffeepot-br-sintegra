/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

import coffeepot.bean.wr.anotation.Field;
import coffeepot.bean.wr.anotation.Record;
import coffeepot.bean.wr.typeHandler.DefaultStringHandler;
import coffeepot.bean.wr.types.Align;
import coffeepot.br.sintegra.tipos.FinalidadeArquivo;
import coffeepot.br.sintegra.tipos.NaturezaOperacao;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "", constantValue = "10"),
    @Field(name = "cnpj", length = 14, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "ie", length = 14, params = DefaultStringHandler.PARAM_FILTER_NUMBER_LETTERS_ONLY),
    @Field(name = "razaoSocial", length = 35),
    @Field(name = "cidade", length = 30),
    @Field(name = "uf", length = 2),
    @Field(name = "fax", length = 10, padding = '0', align = Align.RIGHT, params = DefaultStringHandler.PARAM_FILTER_NUMBER_ONLY),
    @Field(name = "dataInicial", length = 8, padding = '0'),
    @Field(name = "dataFinal", length = 8, padding = '0'),
    @Field(name = "codigoConvenio", length = 1),
    @Field(name = "naturezaOperacao", length = 1),
    @Field(name = "finalidadeArquivo", length = 1)
})
public class Registro10 {

    private char codigoConvenio = '2';
    private FinalidadeArquivo finalidadeArquivo = FinalidadeArquivo.NORMAL;
    private NaturezaOperacao naturezaOperacao = NaturezaOperacao.TOTALIDADE_DAS_OPERACOES;
    private String razaoSocial;
    private String cnpj;
    private String ie;
    private String cidade;
    private String uf;
    private Date dataInicial;
    private Date dataFinal;
    private String fax;

    public char getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(char codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    public FinalidadeArquivo getFinalidadeArquivo() {
        return finalidadeArquivo;
    }

    public void setFinalidadeArquivo(FinalidadeArquivo finalidadeArquivo) {
        this.finalidadeArquivo = finalidadeArquivo;
    }

    public NaturezaOperacao getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
