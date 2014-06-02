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
 * N - Documento Fiscal Normal.
 *
 * S - Documento Fiscal Cancelado.
 *
 * E - Lançamento Extemporâneo de Documento Fiscal Normal.
 *
 * X - Lançamento Extemporâneo de Documento Fiscal Cancelado.
 *
 * 2 - Documento com USO DENEGADO - exclusivamente para uso dos emitentes de
 * Nota Fiscal Eletrônica - Modelo 55 e Conhecimento de Transporte Eletrônico,
 * Modelo 57.
 *
 * 4 - Documento com USO inutilizado - exclusivamente para uso dos emitentes de
 * Nota Fiscal Eletrônica - Modelo 55 e Conhecimento de Transporte Eletrônico,
 * Modelo 57.
 *
 * @author Jeandeson O. Merelis
 */
public enum SituacaoDocumentoFiscal implements EnumCodificado {

    NORMAL("N"),
    CANCELADO("S"),
    LANC_EXTEMPORANEO_DOC_NORMAL("E"),
    LANC_EXTEMPORANEO_DOC_CANCELADO("X"),
    USO_DENEGADO("2"),
    INUTILIZADO("4");
    private final String codigo;

    private SituacaoDocumentoFiscal(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
}
