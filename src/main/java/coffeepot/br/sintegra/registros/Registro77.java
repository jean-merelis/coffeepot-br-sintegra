/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.registros;


/**
 * Este registro deverá ser composto por contribuintes do ICMS, prestadores de
 * serviço de comunicação e telecomunicação.
 *
 * @author Jeandeson O. Merelis
 */
public class Registro77 {

    private Double quantidade;
    private Double valorServico;
    private Double valorDesconto;
    private Double baseDeCalculo;
    private int modelo;
    private int numero;
    private int numeroTerminal;
    private int numeroItem;
    private int aliquota;
    private String cnpjMf;
    private String cfop;
    private String codigo;
    private String subSerie;
    private String cpfCnpj;
    private String serie;
    private int tipoReceita;

    public int getAliquota() {
        return aliquota;
    }

    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }

    public Double getBaseDeCalculo() {
        return baseDeCalculo;
    }

    public void setBaseDeCalculo(Double baseDeCalculo) {
        this.baseDeCalculo = baseDeCalculo;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCnpjMf() {
        return cnpjMf;
    }

    public void setCnpjMf(String cnpjMf) {
        this.cnpjMf = cnpjMf;
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

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public int getNumeroTerminal() {
        return numeroTerminal;
    }

    public void setNumeroTerminal(int numeroTerminal) {
        this.numeroTerminal = numeroTerminal;
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

    public String getSubSerie() {
        return subSerie;
    }

    public void setSubSerie(String subSerie) {
        this.subSerie = subSerie;
    }

    public int getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(int tipoReceita) {
        this.tipoReceita = tipoReceita;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }
}
