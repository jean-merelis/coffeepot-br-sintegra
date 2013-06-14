/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.typeHandler;

import coffeepot.bean.wr.typeHandler.DefaultEnumHandler;
import coffeepot.bean.wr.typeHandler.HandlerParseException;
import coffeepot.br.sintegra.tipos.EnumCodificado;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class CustomEnumHandler extends DefaultEnumHandler {

    @Override
    public Enum parse(String text) throws HandlerParseException {
        throw new HandlerParseException("Não é possível fazer converter o texto para um tipo específico.\nTypeHandler não desenvolvido para leitura");
    }

    @Override
    public String toString(Enum obj) {
        if (obj == null) {
            return null;
        }

        if (obj instanceof EnumCodificado) {
            return ((EnumCodificado) obj).getCodigo();
        }

        return super.toString(obj);
    }
}
