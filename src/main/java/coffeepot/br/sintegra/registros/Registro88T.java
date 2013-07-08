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
public class Registro88T {

    private String cpfCnpj;
    private Date dataDocumento;
    private String uf;
    private String modelo;
    private String serie;
    private String numero;
    private String emissorDocumento;
    private String cifFob;
    private String cpfCnpjFrete;
    private String ufFrete;
    private String ieFrete;
    private int modal;
    private String placa1;
    private String ufPlaca1;
    private String placa2;
    private String ufPlaca2;
    private String placa3;
    private String ufPlaca3;

    public String getCifFob() {
        return cifFob;
    }

    public void setCifFob(String cifFob) {
        this.cifFob = cifFob;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getCpfCnpjFrete() {
        return cpfCnpjFrete;
    }

    public void setCpfCnpjFrete(String cpfCnpjFrete) {
        this.cpfCnpjFrete = cpfCnpjFrete;
    }

    public Date getDataDocumento() {
        return dataDocumento;
    }

    public void setDataDocumento(Date dataDocumento) {
        this.dataDocumento = dataDocumento;
    }

    public String getEmissorDocumento() {
        return emissorDocumento;
    }

    public void setEmissorDocumento(String emissorDocumento) {
        this.emissorDocumento = emissorDocumento;
    }

    public String getIeFrete() {
        return ieFrete;
    }

    public void setIeFrete(String ieFrete) {
        this.ieFrete = ieFrete;
    }

    public int getModal() {
        return modal;
    }

    public void setModal(int modal) {
        this.modal = modal;
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

    public String getPlaca1() {
        return placa1;
    }

    public void setPlaca1(String placa1) {
        this.placa1 = placa1;
    }

    public String getPlaca2() {
        return placa2;
    }

    public void setPlaca2(String placa2) {
        this.placa2 = placa2;
    }

    public String getPlaca3() {
        return placa3;
    }

    public void setPlaca3(String placa3) {
        this.placa3 = placa3;
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

    public String getUfFrete() {
        return ufFrete;
    }

    public void setUfFrete(String ufFrete) {
        this.ufFrete = ufFrete;
    }

    public String getUfPlaca1() {
        return ufPlaca1;
    }

    public void setUfPlaca1(String ufPlaca1) {
        this.ufPlaca1 = ufPlaca1;
    }

    public String getUfPlaca2() {
        return ufPlaca2;
    }

    public void setUfPlaca2(String ufPlaca2) {
        this.ufPlaca2 = ufPlaca2;
    }

    public String getUfPlaca3() {
        return ufPlaca3;
    }

    public void setUfPlaca3(String ufPlaca3) {
        this.ufPlaca3 = ufPlaca3;
    }
    
    
}
