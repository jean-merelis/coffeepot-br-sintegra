package coffeepot.br.sintegra.tipos;

/**
 *
 * @author Jeandeson O. Merelis <jean.merelis@gmail.com>
 */
public enum Frete implements EnumCodificado {

    CIF(1),
    FOB(2),
    OUTROS(0);
    private int codigo;

    private Frete(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }
}
