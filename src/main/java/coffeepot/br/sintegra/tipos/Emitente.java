package coffeepot.br.sintegra.tipos;

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
