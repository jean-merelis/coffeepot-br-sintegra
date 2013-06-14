package coffeepot.br.sintegra.tipos;

/**
 *
 * Tabela para Código da identificação da natureza das operações informadas.
 *
 * 1 -Interestaduais - somente operações sujeitas ao regime de Substituição
 * Tributária . 2 -Interestaduais - operações com ou sem Substituição
 * Tributária. 3 -Totalidade das operações do informante.
 *
 * @author Jeandeson O. Merelis <jean.merelis@gmail.com>
 */
public enum NaturezaOperacao implements EnumCodificado {

    INTERESTADUAL_OPER_SUJEITAS_REGIME_ST(1),
    INTERESTADUAL_OPER_COM_OU_SEM_ST(2),
    TOTALIDADE_DAS_OPERACOES(3);
    private int codigo;

    private NaturezaOperacao(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return String.valueOf(codigo);
    }
}
