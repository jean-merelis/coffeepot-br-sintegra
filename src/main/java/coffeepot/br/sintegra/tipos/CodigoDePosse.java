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
public enum CodigoDePosse implements EnumCodificado {

    PROPRIEDADE_INFORMANTE_POSSE_INFORMATANTE("1", "Mercadorias de propriedade do Informante e em seu poder"),
    PROPRIEDADE_INFORMANTE_POSSE_TERCEIROS("2", "Mercadorias de propriedade do Informante em poder de terceiros"),
    PROPRIEDADE_TERCEIROS_POSSE_INFORMANTE("3", "Mercadorias de propriedade de terceiros em poder do Informante");
    private final String codigo;
    private final String descricao;

    private CodigoDePosse(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
