package coffeepot.br.sintegra.tipos;

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
/**
 *
 * @author Jeandeson O. Merelis
 */
public enum DocumentoFiscal implements EnumCodificado {

    AUTORIZACAO_CARREGAMENTO_TRANSPORTE(24, "Autorização de Carregamento e Transporte, modelo 24"),
    BILHETE_PASSAGEM_AQUAVIARIO(14, "Bilhete de Passagem Aquaviário, modelo 14"),
    BILHETE_PASSAGEM_FERROVIARIO(16, "Bilhete de Passagem Ferroviário, modelo 16"),
    BILHETE_PASSAGEM_NOTA_BAGAGEM(15, "Bilhete de Passagem e Nota de Bagagem, modelo 15"),
    BILHETE_PASSAGEM_RODOVIARIO(13, "Bilhete de Passagem Rodoviário, modelo 13"),
    CONHECIMENTO_AEREO(10, "Conhecimento Aéreo, modelo 10"),
    CONHECIMENTO_TRANSPORTE_AQUAVIARIO_CARGAS(9, "Conhecimento de Transporte Aquaviário de Cargas, modelo 9"),
    CONHECIMENTO_TRANSPORTE_ELETRONICO(57, "Conhecimento de Transporte Eletrônico, modelo 57"),
    CONHECIMENTO_TRANSPORTE_FERROVIARIO_CARGAS(11, "Conhecimento de Transporte Ferroviário de Cargas, modelo 11"),
    CONHECIMENTO_TRANSPORTE_MULTIMODAL_CARGAS(26, "Conhecimento de Transporte Multimodal de Cargas, modelo 26"),
    CONHECIMENTO_TRANSPORTE_RODOVIARIO_CARGAS(8, "Conhecimento de Transporte Rodoviário de Cargas, modelo 8"),
    DESPACHO_TRANSPORTE(17, "Despacho de Transporte, modelo 17"),
    MANIFESTO_DE_CARGA(25, "Manifesto de Carga, modelo 25"),
    NOTA_FISCAL(1, "Nota Fiscal, modelo 1"),
    NOTA_FISCAL_ELETRONICA(55, "Nota Fiscal Eletrônica, modelo 55"),
    NOTA_FISCAL_ENERGIA_ELETRICA(6, "Nota Fiscal de Energia Elétrica, modelo 6"),
    NOTA_FISCAL_ENTRADA(3, "Nota Fiscal de Entrada, modelo 3"),
    NOTA_FISCAL_PRODUTOR(4, "Nota Fiscal de Produtor, modelo 4"),
    NOTA_FISCAL_SERVICO_COMUNICACAO(21, "Nota Fiscal de Serviço de Comunicação, modelo 21"),
    NOTA_FISCAL_SERVICO_TELECOMUNICACAO(22, "Nota Fiscal de Serviço de Telecomunicações, modelo 22"),
    NOTA_FISCAL_SERVICO_TRANSPORTE(7, "Nota Fiscal de Serviço de Transporte, modelo 7"),
    NOTA_FISCAL_SERVICO_TRANSPORTE_FERROVIARIO(27, "Nota Fiscal de Serviço de Transporte Ferroviário, modelo 27"),
    NOTA_FISCAL_VENDA_CONSUMIDOR(2, "Nota Fiscal de Venda a Consumidor, modelo 02"),
    NOTA_FISCAL_CONSUMIDOR_ELETRONICA_VENDA(65, "Nota Fiscal Consumidor Eletronica de Venda, modelo 65"),
    ORDEM_COLETA_CARGA(20, "Ordem de Coleta de Carga, modelo 20"),
    RESUMO_MOVIMENTO_DIARIO(18, "Resumo Movimento Diário, modelo 18");

    private final int codigo;
    private final String descricao;

    private DocumentoFiscal(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }

    public String getDescricao() {
        return descricao;
    }

    public static DocumentoFiscal fromCodigoInt(int i) {
        DocumentoFiscal[] v = DocumentoFiscal.values();
        for (DocumentoFiscal df : v) {
            if (df.codigo == i) {
                return df;
            }
        }
        return null;
    }

    public static DocumentoFiscal fromCodigoStr(String s) {
        int i = Integer.parseInt(s);
        return fromCodigoInt(i);
    }

}
