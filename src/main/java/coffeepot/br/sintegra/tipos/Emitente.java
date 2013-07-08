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
 * @author Jeandeson O. Merelis <jean.merelis@gmail.com>
 */
public enum Emitente implements EnumCodificado {

    PROPRIO('P'),
    TERCEIROS('T');
    private char codigo;

    private Emitente(char codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }

    public static Emitente fromString(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        switch (s) {
            case "P":
                return Emitente.PROPRIO;
            case "T":
                return Emitente.TERCEIROS;
        }
        return null;
    }
}
