package coffeepot.br.sintegra.tipos;

/*
 * #%L
 * coffeepot-br-sintegra
 * %%
 * Copyright (C) 2013 Jeandeson O. Merelis
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


/**
 * Finalidade do arquivo.<br />
 * 1 - Normal;<br /> 
 * 2 - Retificação total de arquivo: substituição total de informações prestadas pelo contribuinte referentes a este período;<br />
 * 3 - Retificação aditiva de arquivo: acréscimo de informação não incluída em arquivos já apresentados;<br /> 
 * 5 - Desfazimento: arquivo de informação referente a operações/prestações não efetivadas . Neste caso, o arquivo deverá <br />
 *      conter, além dos registros tipo 10 e tipo 90, apenas os registros Referentes as operações/prestações não efetivadas.
 *
 * @author Jeandeson O. Merelis
 */
public enum FinalidadeArquivo  implements EnumCodificado{
    NORMAL(1, "1 - Normal"),
    RETIFICACAO_TOTAL(2, "2 - Retificação total de arquivo: substituição total de informações prestadas pelo contribuinte referentes a este período"),
    RETIFICACAO_ADITIVA(3, "3 - Retificação aditiva de arquivo: acréscimo de informação não incluída em arquivos já apresentados"),
    DESFAZIMENTO(5, "5 - Desfazimento: arquivo de informação referente a operações/prestações não efetivadas");
    
    private final int codigo;
    private final String descricao;
    
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
