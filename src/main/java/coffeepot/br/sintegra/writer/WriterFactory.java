/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra.writer;

import coffeepot.bean.wr.typeHandler.DefaultDateHandler;
import coffeepot.bean.wr.typeHandler.TypeHandler;
import coffeepot.bean.wr.writer.FixedLengthWriter;
import coffeepot.bean.wr.writer.ObjectWriter;
import coffeepot.br.sintegra.typeHandler.CustomDoubleHandler;
import coffeepot.br.sintegra.typeHandler.CustomEnumHandler;
import java.io.Writer;
import java.util.Date;

/**
 *
 * @author Jeandeson O. Merelis
 */
public class WriterFactory {

    public static ObjectWriter createObjectWriter(Writer w) {
        ObjectWriter beanWriter = FixedLengthWriter.create(w)                                
                .withRecordTerminator("\r\n");
                
        beanWriter.getObjectParserFactory().getHandlerFactory().registerTypeHandlerClassFor(Enum.class, CustomEnumHandler.class);
        beanWriter.getObjectParserFactory().getHandlerFactory().registerTypeHandlerClassFor(Double.class, CustomDoubleHandler.class);
        
        beanWriter.getObjectParserFactory().getHandlerFactory().registerTypeHandlerInstanceAsDefaultFor(Date.class, WriterFactory.createDefaultDateHandler());

        return beanWriter;
    }

    private static TypeHandler createDefaultDateHandler() {
        DefaultDateHandler handler = new DefaultDateHandler();
        String[] params = new String[]{"patternForDate=yyyyMMdd", "patternForTime=HHmmss", "pattern=yyyyMMdd"};
        handler.setConfig(params);
        return handler;
    }

}
