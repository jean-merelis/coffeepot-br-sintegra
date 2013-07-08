/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
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
 *
 * @author Jeandeson O. Merelis
 */
public enum Convenio implements EnumCodificado {

    CONV_1_5795_3002("1", "1 - Convênio 57/95 Versão 31/99 Alt. 30/02"),
    CONV_2_5795_14202("2", "2 - Convênio 57/95 Versão 69/02 Alt. 142/02"),
    CONV_3_5795_7603("3", "3 - Convênio 57/95 Alt. 76/03");
    private String codigo;
    private String descricao;

    private Convenio(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
}
