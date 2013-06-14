package coffeepot.br.sintegra.tipos;

/**
 *
 * N - Documento Fiscal Normal.
 *
 * S - Documento Fiscal Cancelado.
 *
 * E - Lançamento Extemporâneo de Documento Fiscal Normal.
 *
 * X - Lançamento Extemporâneo de Documento Fiscal Cancelado.
 *
 * 2 - Documento com USO DENEGADO - exclusivamente para uso dos emitentes de
 * Nota Fiscal Eletrônica - Modelo 55 e Conhecimento de Transporte Eletrônico,
 * Modelo 57.
 *
 * 4 - Documento com USO inutilizado - exclusivamente para uso dos emitentes de
 * Nota Fiscal Eletrônica - Modelo 55 e Conhecimento de Transporte Eletrônico,
 * Modelo 57.
 *
 * @author Jeandeson O. Merelis <jean.merelis@gmail.com>
 */
public enum SituacaoDocumentoFiscal implements EnumCodificado {

    NORMAL("N"),
    CANCELADO("S"),
    LANC_EXTEMPORANEO_DOC_NORMAL("E"),
    LANC_EXTEMPORANEO_DOC_CANCELADO("X"),
    USO_DENEGADO("2"),
    INUTILIZADO("4");
    private String codigo;

    private SituacaoDocumentoFiscal(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }
}
