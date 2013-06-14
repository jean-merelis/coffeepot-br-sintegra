package coffeepot.br.sintegra.tipos;

/**
 *
 * @author Jeandeson O. Merelis <jean.merelis@gmail.com>
 */
public enum NaturezaOperacaoExportacao implements EnumCodificado {

    DIRETA("1"),
    INDIRETA("2"),
    DIRETA_REGIME_SIMPLIFICADO("3"),
    INDIRETA_REGIME_SIMPLIFICADO("4");
    private String codigo;

    private NaturezaOperacaoExportacao(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
}
