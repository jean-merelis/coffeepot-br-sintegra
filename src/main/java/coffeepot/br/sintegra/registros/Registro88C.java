/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;


/**
 *
 * @author Jeandeson O. Merelis
 */
public class Registro88C {

    private String cpfCnpj;
    private String modelo;
    private String serie;
    private String numero;
    private String cfop;
    private int numeroItem;
    private String codigo;
    private Double quantidade;
    private Double baseST;
    private Double valorIcmsSTRepassar;
    private Double valorIcmsSTComplementar;
    private Double basedeCalculoRetencao;
    private Double valorParcelaImpostoRetido;

    public Double getBaseST() {
        return baseST;
    }

    public void setBaseST(Double baseST) {
        this.baseST = baseST;
    }

    public Double getBasedeCalculoRetencao() {
        return basedeCalculoRetencao;
    }

    public void setBasedeCalculoRetencao(Double basedeCalculoRetencao) {
        this.basedeCalculoRetencao = basedeCalculoRetencao;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double getValorIcmsSTComplementar() {
        return valorIcmsSTComplementar;
    }

    public void setValorIcmsSTComplementar(Double valorIcmsSTComplementar) {
        this.valorIcmsSTComplementar = valorIcmsSTComplementar;
    }

    public Double getValorIcmsSTRepassar() {
        return valorIcmsSTRepassar;
    }

    public void setValorIcmsSTRepassar(Double valorIcmsSTRepassar) {
        this.valorIcmsSTRepassar = valorIcmsSTRepassar;
    }

    public Double getValorParcelaImpostoRetido() {
        return valorParcelaImpostoRetido;
    }

    public void setValorParcelaImpostoRetido(Double valorParcelaImpostoRetido) {
        this.valorParcelaImpostoRetido = valorParcelaImpostoRetido;
    }
    
    
}
