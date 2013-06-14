package coffeepot.br.sintegra.tipos;

/**
 * Finalidade do arquivo.<br />
 * 1 - Normal;<br /> 
 * 2 - Retificação total de arquivo: substituição total de informações prestadas pelo contribuinte referentes a este período;<br />
 * 3 - Retificação aditiva de arquivo: acréscimo de informação não incluída em arquivos já apresentados;<br /> 
 * 5 - Desfazimento: arquivo de informação referente a operações/prestações não efetivadas . Neste caso, o arquivo deverá <br />
 *      conter, além dos registros tipo 10 e tipo 90, apenas os registros Referentes as operações/prestações não efetivadas.
 *
 * @author Jeandeson O. Merelis <jean.merelis@gmail.com>
 */
public enum FinalidadeArquivo  implements EnumCodificado{
    NORMAL(1, "Normal"),
    RETIFICACAO_TOTAL(2, "Retificação total de arquivo: substituição total de informações prestadas pelo contribuinte referentes a este período"),
    RETIFICACAO_ADITIVA(3, "Retificação aditiva de arquivo: acréscimo de informação não incluída em arquivos já apresentados"),
    DESFAZIMENTO(5, "Desfazimento: arquivo de informação referente a operações/prestações não efetivadas");
    
    private int codigo;
    private String descricao;
    
    private FinalidadeArquivo(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    @Override
    public String getCodigo(){
        return String.valueOf(codigo);
    }
            
    public String getDescricao(){
        return descricao;
    } 
}
