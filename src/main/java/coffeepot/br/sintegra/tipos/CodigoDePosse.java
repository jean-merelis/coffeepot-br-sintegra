package coffeepot.br.sintegra.tipos;

/**
 *
 * @author Jeandeson O. Merelis <jean.merelis@gmail.com>
 */
public enum CodigoDePosse implements EnumCodificado {

    PROPRIEDADE_INFORMANTE_POSSE_INFORMATANTE("1", "Mercadorias de propriedade do Informante e em seu poder"),
    PROPRIEDADE_INFORMANTE_POSSE_TERCEIROS("2", "Mercadorias de propriedade do Informante em poder de terceiros"),
    PROPRIEDADE_TERCEIROS_POSSE_INFORMANTE("3", "Mercadorias de propriedade de terceiros em poder do Informante");
    private String codigo;
    private String descricao;

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
