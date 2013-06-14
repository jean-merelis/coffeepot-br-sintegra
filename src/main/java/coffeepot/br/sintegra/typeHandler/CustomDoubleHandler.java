/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.typeHandler;

import coffeepot.bean.wr.typeHandler.HandlerParseException;
import coffeepot.bean.wr.typeHandler.TypeHandler;
import java.text.DecimalFormat;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class CustomDoubleHandler implements TypeHandler<Double> {

    protected DecimalFormat decimalFormat;
    protected int scaleFactor;

    public CustomDoubleHandler() {
        decimalFormat = new DecimalFormat("#0");
        scaleFactor = 100; // scale = 2 e.g. 1.99    
    }

    
    
    @Override
    public Double parse(String text) throws HandlerParseException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString(Double obj) {
        if (obj == null) {
            return null;
        }
        double d = obj * scaleFactor;
        return decimalFormat.format(d);
    }

    @Override
    public void setConfig(String[] params) {
        if (params == null || params.length == 0) {
            setDefaultValues();
            return;
        }
        for (String s : params) {
            String[] keyValue = s.split("=");
            if (keyValue.length > 0) {
                String key = keyValue[0].trim();
                String value;
                if (keyValue.length > 1) {
                    value = keyValue[1].trim();
                } else {
                    value = "";
                }
                switch (key) {
                    case "scale":
                        if (value.length() > 0) {
                            Integer scale = Integer.parseInt(value);
                            StringBuilder sb = new StringBuilder();
                            sb.append("1");
                            for (int i = 0; i < scale; i++) {
                                sb.append("0");
                            }
                            scaleFactor = Integer.parseInt(sb.toString());
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Parametro de configuração não conhecido pelo CustomDoubleHandler");
                }
            }
        }
    }

    private void setDefaultValues() {
        decimalFormat = new DecimalFormat("#0");
        scaleFactor = 100; // scale = 2 e.g. 1.99
    }
}
