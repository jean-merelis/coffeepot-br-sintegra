/*
 * Copyright 2013 - Jeandeson O. Merelis
 */
package coffeepot.br.sintegra;

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


import coffeepot.bean.wr.annotation.Field;
import coffeepot.bean.wr.annotation.Record;
import coffeepot.br.sintegra.registros.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

;

/**
 *
 * @author Jeandeson O. Merelis
 */
@Record(fields = {
    @Field(name = "registro10"),
    @Field(name = "registro11"),
    @Field(name = "registros50"),
    @Field(name = "registros51"),
    @Field(name = "registros53"),
    @Field(name = "registros54"),
    @Field(name = "registros56"),
    @Field(name = "registros55"),
    @Field(name = "registros60M"),
    @Field(name = "registros60R"),
    @Field(name = "registros61"),
    @Field(name = "registros61R"),
    @Field(name = "registros70"),
    @Field(name = "registros71"),
    @Field(name = "registros74"),
    @Field(name = "registros75"),
    //TODO: Mapear classes dos registros 76 ao 88.
    //    @Field(name = "registros76"),
    //    @Field(name = "registros77"),
    //    @Field(name = "registros85"),
    //    @Field(name = "registros86"),
    //    @Field(name = "registro88EC"),
    //    @Field(name = "registro88SF"),
    //    @Field(name = "registros88C"),
    //    @Field(name = "registros88D"),
    //    @Field(name = "registros88E"),
    //    @Field(name = "registros88Ean"),
    //    @Field(name = "registros88T"),
    //    @Field(name = "registros88SP02"),
    //    @Field(name = "registros88SP03"),
    //    @Field(name = "registros88STES"),
    //    @Field(name = "registros88STITNF"),
    @Field(name = "registros90")
})
public class Sintegra {

    private Registro10 registro10;
    private Registro11 registro11;
    private List<Registro50> registros50;
    private List<Registro51> registros51;
    private List<Registro53> registros53;
    private List<Registro54> registros54;
    private List<Registro56> registros56;
    private List<Registro55> registros55;
    private List<Registro60M> registros60M;
    private List<Registro60R> registros60R;
    private List<Registro61> registros61;
    private List<Registro61R> registros61R;
    private List<Registro70> registros70;
    private List<Registro71> registros71;
    private List<Registro74> registros74;
    private List<Registro75> registros75;
    private List<Registro76> registros76;
    private List<Registro77> registros77;
    private List<Registro85> registros85;
    private List<Registro86> registros86;
    private Registro88EC registro88EC;
    private Registro88SF registro88SF;
    private List<Registro88C> registros88C;
    private List<Registro88D> registros88D;
    private List<Registro88E> registros88E;
    private List<Registro88Ean> registros88Ean;
    private List<Registro88T> registros88T;
    private List<Registro88SP02> registros88SP02;
    private List<Registro88SP03> registros88SP03;
    private List<Registro88STES> registros88STES;
    private List<Registro88STITNF> registros88STITNF;
    private List<Registro90> registros90;

    public Sintegra() {
    }

    public static List<Registro90> criarRegistros90(Map<String, Integer> totalizadores, String cnpj, String ie) {
        StringBuilder sb = new StringBuilder();
        int totalRegistros = 0;
        int totalTotalizadores = 0;
        Set<Map.Entry<String, Integer>> entrySet = totalizadores.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (!"10".equals(entry.getKey()) && !"11".equals(entry.getKey()) && !"90".equals(entry.getKey())) {
                if (entry.getValue() > 0) {
                    sb.append(entry.getKey());
                    sb.append(padLeft(entry.getValue(), 8, '0'));
                    totalRegistros += entry.getValue();
                    totalTotalizadores++;
                }
            }
        }

        //incluindo totalizador 99
        totalTotalizadores++;

        int totalR90;

        //apurando quantidade de registro tipo 90
        if ((totalTotalizadores) <= 9) {
            totalR90 = 1;
        } else {
            totalR90 = totalTotalizadores / 9;
            int resto = totalTotalizadores % 9;
            if (resto > 0) {
                totalR90++;
            }
        }

        List<Registro90> result = new LinkedList<>();

        totalRegistros += 2;//registros 10 e 11
        totalRegistros += totalR90;

        sb.append("99");
        sb.append(padLeft(totalRegistros, 8, '0'));

        for (int i = 0; i < totalR90; i++) {

            Registro90 r90 = new Registro90();
            r90.setCnpj(cnpj);
            r90.setIe(ie);

            int i9 = i * 90;
            r90.setTotalizadores(sb.substring(i9, (sb.length() > (90 + i9) ? (90 + i9) : sb.length())));
            r90.setQuantidadeR90(totalR90);
            result.add(r90);
        }
        return result;
    }

    public void gerarRegistros90(){
        Map<String, Integer> totalizadores = new LinkedHashMap<>();
        if (registros50 != null && registros50.size() > 0) {
            totalizadores.put("50", registros50.size());
        }

        if (registros51 != null && registros51.size() > 0) {
            totalizadores.put("51", registros51.size());
        }

        if (registros53 != null && registros53.size() > 0) {
            totalizadores.put("53", registros53.size());
        }

        if (registros54 != null && registros54.size() > 0) {
            totalizadores.put("54", registros54.size());
        }

        if (registros55 != null && registros55.size() > 0) {
            totalizadores.put("55", registros55.size());
        }

        if (registros56 != null && registros56.size() > 0) {
           totalizadores.put("56", registros56.size());
        }

        if (registros60M != null && registros60M.size() > 0) {
            int total60 = registros60M.size();

            for (Registro60M r60M : registros60M) {
                if (r60M.getRegistros60A() != null) {
                    total60 += r60M.getRegistros60A().size();
                }
                if (r60M.getRegistros60D() != null) {
                    total60 += r60M.getRegistros60D().size();
                }
                if (r60M.getRegistros60I() != null) {
                    total60 += r60M.getRegistros60I().size();
                }
            }
            if (registros60R != null && registros60R.size() > 0) {
                total60 += registros60R.size();
            }

            totalizadores.put("60", total60);
        }

        int r61=0;
        if (registros61 != null) {
            r61 += registros61.size();
        }
        if (registros61R != null) {
            r61 += registros61R.size();
        }

        if (r61 > 0)
        totalizadores.put("61", r61);
        
        if (registros70 != null && registros70.size() > 0) {
            totalizadores.put("70", registros70.size());
        }

        if (registros71 != null && registros71.size() > 0) {
            totalizadores.put("71", registros71.size());
        }

        if (registros74 != null && registros74.size() > 0) {
            totalizadores.put("74", registros74.size());
        }

        if (registros75 != null && registros75.size() > 0) {
            totalizadores.put("75", registros75.size());
        }

        if (registros76 != null && registros76.size() > 0) {
            totalizadores.put("76", registros76.size());
        }

        if (registros77 != null && registros77.size() > 0) {
            totalizadores.put("77", registros77.size());
        }

                
        if (registros85 != null && registros85.size() > 0) {
            totalizadores.put("85", registros85.size());
        }

        if (registros86 != null && registros86.size() > 0) {
            totalizadores.put("86", registros86.size());
        }

        //TODO: totalizar registros tipo 88
        
        registros90 = criarRegistros90(totalizadores, registro10 == null ? null : registro10.getCnpj(), registro10 == null ? null : registro10.getIe());        
    }

    public void sort() {
        Collections.sort(registros50, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro50 r1 = (Registro50) o1;
                Registro50 r2 = (Registro50) o2;
                if ((r1.getDataDocumento().getTime() < r2.getDataDocumento().getTime()) || (r1.getDataDocumento().equals(r2.getDataDocumento()) && (r1.getNumeroDocumento() < r2.getNumeroDocumento()))) {
                    return -1;
                }

                if (r1.getDataDocumento().equals(r2.getDataDocumento()) && (r1.getNumeroDocumento() == r2.getNumeroDocumento())) {
                    return 0;
                }

                return 1;
            }
        });

        Collections.sort(registros51, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro51 r1 = (Registro51) o1;
                Registro51 r2 = (Registro51) o2;
                if ((r1.getDataDocumento().getTime() < r2.getDataDocumento().getTime()) || (r1.getDataDocumento().equals(r2.getDataDocumento()) && (r1.getNumeroDocumento() < r2.getNumeroDocumento()))) {
                    return -1;
                }

                if (r1.getDataDocumento().equals(r2.getDataDocumento()) && (r1.getNumeroDocumento() == r2.getNumeroDocumento())) {
                    return 0;
                }

                return 1;
            }
        });

        Collections.sort(registros53, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro53 r1 = (Registro53) o1;
                Registro53 r2 = (Registro53) o2;
                if ((r1.getDataDocumento().getTime() < r2.getDataDocumento().getTime()) || (r1.getDataDocumento().equals(r2.getDataDocumento()) && (r1.getNumeroDocumento() < r2.getNumeroDocumento()))) {
                    return -1;
                }

                if (r1.getDataDocumento().equals(r2.getDataDocumento()) && (r1.getNumeroDocumento() == r2.getNumeroDocumento())) {
                    return 0;
                }

                return 1;
            }
        });
        Collections.sort(registros54, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro54 r1 = (Registro54) o1;
                Registro54 r2 = (Registro54) o2;
                int result;
                result = r1.getCpfCnpj().compareTo(r2.getCpfCnpj());
                if (result != 0) {
                    return result;
                }

                String serie1 = r1.getSerieDocumento() == null ? "" : r1.getSerieDocumento();
                result = serie1.compareTo(r2.getSerieDocumento());
                if (result != 0) {
                    return result;
                }

                Integer num1 = r1.getNumeroDocumento() == null ? 0 : r1.getNumeroDocumento();
                result = num1.compareTo(r2.getNumeroDocumento());
                if (result != 0) {
                    return result;
                }

                if (r1.getNumeroItem() > r2.getNumeroItem()) {
                    result = 1;
                } else if (r1.getNumeroItem() < r2.getNumeroItem()) {
                    result = -1;
                } else {
                    result = 0;
                }
                return result;
            }
        });

        Collections.sort(registros60M, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro60M r1 = (Registro60M) o1;
                Registro60M r2 = (Registro60M) o2;

                if (r1.getDataEmissao().getTime() < r2.getDataEmissao().getTime()) {
                    return -1;
                }

                if (r1.getDataEmissao().getTime() > r2.getDataEmissao().getTime()) {
                    return 1;
                }

                if (!r1.getNumeroSerieEquipamento().equalsIgnoreCase(r2.getNumeroSerieEquipamento())) {
                    return r1.getNumeroSerieEquipamento().compareToIgnoreCase(r2.getNumeroSerieEquipamento());
                }

                if (r1.getCro() < r2.getCro()) {
                    return -1;
                }
                if (r1.getCro() > r2.getCro()) {
                    return 1;
                }

                return 0;
            }
        });

        Collections.sort(registros70, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro70 r1 = (Registro70) o1;
                Registro70 r2 = (Registro70) o2;
                if ((r1.getDataEmissaoUtilizacao().getTime() < r2.getDataEmissaoUtilizacao().getTime()) || (r1.getDataEmissaoUtilizacao().equals(r2.getDataEmissaoUtilizacao()) && (r1.getNumeroDocumento() < r2.getNumeroDocumento()))) {
                    return -1;
                }

                if (r1.getDataEmissaoUtilizacao().equals(r2.getDataEmissaoUtilizacao()) && (r1.getNumeroDocumento() == r2.getNumeroDocumento())) {
                    return 0;
                }

                return 1;
            }
        });

        Collections.sort(registros71, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro71 r1 = (Registro71) o1;
                Registro71 r2 = (Registro71) o2;
                if ((r1.getDataEmissaoConhecimento().getTime() < r2.getDataEmissaoConhecimento().getTime()) || (r1.getDataEmissaoConhecimento().equals(r2.getDataEmissaoConhecimento()) && (r1.getNumeroConhecimento() < r2.getNumeroConhecimento()))) {
                    return -1;
                }

                if (r1.getDataEmissaoConhecimento().equals(r2.getDataEmissaoConhecimento()) && (r1.getNumeroConhecimento() == r2.getNumeroConhecimento())) {
                    return 0;
                }

                return 1;
            }
        });

        Collections.sort(registros74, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro74 r1 = (Registro74) o1;
                Registro74 r2 = (Registro74) o2;
                if (r1.getDataInventario().getTime() < r2.getDataInventario().getTime()) {
                    return -1;
                }

                if (r1.getDataInventario().getTime() > r2.getDataInventario().getTime()) {
                    return 1;
                }

                if (r1.getCodigoProduto().equals(r2.getCodigoProduto())) {
                    return 0;
                }

                return r1.getCodigoProduto().compareTo(r2.getCodigoProduto());
            }
        });

        Collections.sort(registros75, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro75 r1 = (Registro75) o1;
                Registro75 r2 = (Registro75) o2;

                return r1.getCodigoProduto().compareTo(r2.getCodigoProduto());
            }
        });

        Collections.sort(registros85, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro85 r1 = (Registro85) o1;
                Registro85 r2 = (Registro85) o2;

                return r1.getDataDeclaracao().compareTo(r2.getDataDeclaracao());
            }
        });

        Collections.sort(registros86, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Registro86 r1 = (Registro86) o1;
                Registro86 r2 = (Registro86) o2;

                return r1.getDataRegistro().compareTo(r2.getDataRegistro());
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="utils ">
    private static String padLeft(Integer i, int length, char pad) {
        return padLeft(i == null ? "" : i.toString(), length, pad);
    }

    private static String padRight(String s, int length, char pad) {
        if (length <= 0) {
            return "";
        }

        if (s == null) {
            s = "";
        }

        if (s.length() >= length) {
            return s.substring(0, length);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        for (int i = s.length(); i < length; i++) {
            sb.append(pad);
        }

        return sb.substring(0, length);
    }

    private static String padLeft(String s, int length, char pad) {
        if (length <= 0) {
            return "";
        }

        if (s == null) {
            s = "";
        }

        if (s.length() >= length) {
            return s.substring(s.length() - length, s.length());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = s.length(); i < length; i++) {
            sb.append(pad);
        }
        sb.append(s);


        return sb.substring(sb.length() - length, sb.length());
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public Registro10 getRegistro10() {
        return registro10;
    }

    public void setRegistro10(Registro10 registro10) {
        this.registro10 = registro10;
    }

    public Registro11 getRegistro11() {
        return registro11;
    }

    public void setRegistro11(Registro11 registro11) {
        this.registro11 = registro11;
    }

    public List<Registro50> getRegistros50() {
        return registros50;
    }

    public void setRegistros50(List<Registro50> registros50) {
        this.registros50 = registros50;
    }

    public List<Registro51> getRegistros51() {
        return registros51;
    }

    public void setRegistros51(List<Registro51> registros51) {
        this.registros51 = registros51;
    }

    public List<Registro53> getRegistros53() {
        return registros53;
    }

    public void setRegistros53(List<Registro53> registros53) {
        this.registros53 = registros53;
    }

    public List<Registro54> getRegistros54() {
        return registros54;
    }

    public void setRegistros54(List<Registro54> registros54) {
        this.registros54 = registros54;
    }

    public List<Registro56> getRegistros56() {
        return registros56;
    }

    public void setRegistros56(List<Registro56> registros56) {
        this.registros56 = registros56;
    }

    public List<Registro55> getRegistros55() {
        return registros55;
    }

    public void setRegistros55(List<Registro55> registros55) {
        this.registros55 = registros55;
    }

    public List<Registro60M> getRegistros60M() {
        return registros60M;
    }

    public void setRegistros60M(List<Registro60M> registros60M) {
        this.registros60M = registros60M;
    }

    public List<Registro60R> getRegistros60R() {
        return registros60R;
    }

    public void setRegistros60R(List<Registro60R> registros60R) {
        this.registros60R = registros60R;
    }

    public List<Registro61> getRegistros61() {
        return registros61;
    }

    public void setRegistros61(List<Registro61> registros61) {
        this.registros61 = registros61;
    }

    public List<Registro61R> getRegistros61R() {
        return registros61R;
    }

    public void setRegistros61R(List<Registro61R> registros61R) {
        this.registros61R = registros61R;
    }

    public List<Registro70> getRegistros70() {
        return registros70;
    }

    public void setRegistros70(List<Registro70> registros70) {
        this.registros70 = registros70;
    }

    public List<Registro71> getRegistros71() {
        return registros71;
    }

    public void setRegistros71(List<Registro71> registros71) {
        this.registros71 = registros71;
    }

    public List<Registro74> getRegistros74() {
        return registros74;
    }

    public void setRegistros74(List<Registro74> registros74) {
        this.registros74 = registros74;
    }

    public List<Registro75> getRegistros75() {
        return registros75;
    }

    public void setRegistros75(List<Registro75> registros75) {
        this.registros75 = registros75;
    }

    public List<Registro76> getRegistros76() {
        return registros76;
    }

    public void setRegistros76(List<Registro76> registros76) {
        this.registros76 = registros76;
    }

    public List<Registro77> getRegistros77() {
        return registros77;
    }

    public void setRegistros77(List<Registro77> registros77) {
        this.registros77 = registros77;
    }

    public List<Registro85> getRegistros85() {
        return registros85;
    }

    public void setRegistros85(List<Registro85> registros85) {
        this.registros85 = registros85;
    }

    public List<Registro86> getRegistros86() {
        return registros86;
    }

    public void setRegistros86(List<Registro86> registros86) {
        this.registros86 = registros86;
    }

    public Registro88EC getRegistro88EC() {
        return registro88EC;
    }

    public void setRegistro88EC(Registro88EC registro88EC) {
        this.registro88EC = registro88EC;
    }

    public Registro88SF getRegistro88SF() {
        return registro88SF;
    }

    public void setRegistro88SF(Registro88SF registro88SF) {
        this.registro88SF = registro88SF;
    }

    public List<Registro88C> getRegistros88C() {
        return registros88C;
    }

    public void setRegistros88C(List<Registro88C> registros88C) {
        this.registros88C = registros88C;
    }

    public List<Registro88D> getRegistros88D() {
        return registros88D;
    }

    public void setRegistros88D(List<Registro88D> registros88D) {
        this.registros88D = registros88D;
    }

    public List<Registro88E> getRegistros88E() {
        return registros88E;
    }

    public void setRegistros88E(List<Registro88E> registros88E) {
        this.registros88E = registros88E;
    }

    public List<Registro88Ean> getRegistros88Ean() {
        return registros88Ean;
    }

    public void setRegistros88Ean(List<Registro88Ean> registros88Ean) {
        this.registros88Ean = registros88Ean;
    }

    public List<Registro88T> getRegistros88T() {
        return registros88T;
    }

    public void setRegistros88T(List<Registro88T> registros88T) {
        this.registros88T = registros88T;
    }

    public List<Registro88SP02> getRegistros88SP02() {
        return registros88SP02;
    }

    public void setRegistros88SP02(List<Registro88SP02> registros88SP02) {
        this.registros88SP02 = registros88SP02;
    }

    public List<Registro88SP03> getRegistros88SP03() {
        return registros88SP03;
    }

    public void setRegistros88SP03(List<Registro88SP03> registros88SP03) {
        this.registros88SP03 = registros88SP03;
    }

    public List<Registro88STES> getRegistros88STES() {
        return registros88STES;
    }

    public void setRegistros88STES(List<Registro88STES> registros88STES) {
        this.registros88STES = registros88STES;
    }

    public List<Registro88STITNF> getRegistros88STITNF() {
        return registros88STITNF;
    }

    public void setRegistros88STITNF(List<Registro88STITNF> registros88STITNF) {
        this.registros88STITNF = registros88STITNF;
    }

    public List<Registro90> getRegistros90() {
        return registros90;
    }

    public void setRegistros90(List<Registro90> registros90) {
        this.registros90 = registros90;
    }
    //</editor-fold>
}
