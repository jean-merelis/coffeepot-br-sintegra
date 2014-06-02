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
 * Tabela para Código da identificação da natureza das operações informadas.
 *
 * 1 -Interestaduais - somente operações sujeitas ao regime de Substituição
 * Tributária . 2 -Interestaduais - operações com ou sem Substituição
 * Tributária. 3 -Totalidade das operações do informante.
 *
 * @author Jeandeson O. Merelis
 */
public enum NaturezaOperacao implements EnumCodificado {

    INTERESTADUAL_OPER_SUJEITAS_REGIME_ST(1, "1 - Interestaduais - Somente operações sujeitas à Substituição Tributária"),
    INTERESTADUAL_OPER_COM_OU_SEM_ST(2, "2 - Interestaduais - Operações com ou sem Substituição Tributária"),
    TOTALIDADE_DAS_OPERACOES(3, "3 - Totalidade das operações do informante");
    private final int codigo;
    private final String descricao;

    private NaturezaOperacao(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }
}
