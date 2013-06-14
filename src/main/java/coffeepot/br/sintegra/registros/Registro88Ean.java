/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Registro88Ean {

    private String codigoBarras;
    private String unidade;
    private String descricao;
    private long codigo;
    private String versaoEan;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getVersaoEan() {
        return versaoEan;
    }

    public void setVersaoEan(String versaoEan) {
        this.versaoEan = versaoEan;
    }
    
    
}
