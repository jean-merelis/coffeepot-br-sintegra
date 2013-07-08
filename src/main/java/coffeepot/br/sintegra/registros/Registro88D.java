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


import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class Registro88D {

    private String cpfCnpj;
    private String inscricao;
    private String uf;
    private String modelo;
    private String serie;
    private String numero;
    private String emissorDocumento;
    private Date dataDocumento;
    private Date dataSaidaEntrada;
    private String cnpjLocalSaida;
    private String ufLocalSaida;
    private String ieLocalSaida;
    private String cnpjLocalEntrega;
    private String ufLocalEntrega;
    private String ieLocalEntrega;

    public String getCnpjLocalEntrega() {
        return cnpjLocalEntrega;
    }

    public void setCnpjLocalEntrega(String cnpjLocalEntrega) {
        this.cnpjLocalEntrega = cnpjLocalEntrega;
    }

    public String getCnpjLocalSaida() {
        return cnpjLocalSaida;
    }

    public void setCnpjLocalSaida(String cnpjLocalSaida) {
        this.cnpjLocalSaida = cnpjLocalSaida;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Date getDataDocumento() {
        return dataDocumento;
    }

    public void setDataDocumento(Date dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    public Date getDataSaidaEntrada() {
        return dataSaidaEntrada;
    }

    public void setDataSaidaEntrada(Date dataSaidaEntrada) {
        this.dataSaidaEntrada = dataSaidaEntrada;
    }

    public String getEmissorDocumento() {
        return emissorDocumento;
    }

    public void setEmissorDocumento(String emissorDocumento) {
        this.emissorDocumento = emissorDocumento;
    }

    public String getIeLocalEntrega() {
        return ieLocalEntrega;
    }

    public void setIeLocalEntrega(String ieLocalEntrega) {
        this.ieLocalEntrega = ieLocalEntrega;
    }

    public String getIeLocalSaida() {
        return ieLocalSaida;
    }

    public void setIeLocalSaida(String ieLocalSaida) {
        this.ieLocalSaida = ieLocalSaida;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUfLocalEntrega() {
        return ufLocalEntrega;
    }

    public void setUfLocalEntrega(String ufLocalEntrega) {
        this.ufLocalEntrega = ufLocalEntrega;
    }

    public String getUfLocalSaida() {
        return ufLocalSaida;
    }

    public void setUfLocalSaida(String ufLocalSaida) {
        this.ufLocalSaida = ufLocalSaida;
    }
    
    
}
