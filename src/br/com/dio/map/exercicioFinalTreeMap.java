package br.com.dio.map;

import java.util.Map;
import java.util.TreeMap;

public class exercicioFinalTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeEstados = new TreeMap<>();

        // Monta a árvore com as capitais
        treeEstados.put("AC", "ACRE");
        treeEstados.put("AL", "ALAGOAS");
        treeEstados.put("AP", "AMAPA");
        treeEstados.put("AM", "AMAZONAS");
        treeEstados.put("BA", "BAHIA");
        treeEstados.put("CE", "CEARA");
        treeEstados.put("DF", "DISTRITO FEDERAL");
        treeEstados.put("ES", "ESPIRITO SANTO");
        treeEstados.put("GO", "GOIAS");
        treeEstados.put("MA", "MARANHAO");
        treeEstados.put("MT", "MATO GROSSO");
        treeEstados.put("MS", "MATO GROSSO DO SUL");
        treeEstados.put("MG", "MINAS GERAIS");
        treeEstados.put("PA", "PARA");
        treeEstados.put("PB", "PARAIBA");
        treeEstados.put("PR", "PARANA");
        treeEstados.put("PE", "PERNAMBUCO");
        treeEstados.put("PI", "PIAUI");
        treeEstados.put("RJ", "RIO DE JANEIRO");
        treeEstados.put("RN", "RIO GRANDE DO NORTE");
        treeEstados.put("RS", "RIO GRANDE DO SUL");
        treeEstados.put("RO", "RONDONIA");
        treeEstados.put("RR", "RORAIMA");
        treeEstados.put("SC", "SANTA CATARINA");
        treeEstados.put("SP", "SAO PAULO");
        treeEstados.put("SE", "SERGIPE");
        treeEstados.put("TO", "TOCANTINS");

        System.out.println(treeEstados);

        treeEstados.remove("MG");

        treeEstados.put("DF", "DISTRITO FEDERAL");

        System.out.println(treeEstados);

        System.out.println("O TAMANHO DO MAPA: " + treeEstados.size());

        /*FALTA REMOVER PELO NOME*/
        for (Map.Entry<String, String> estado : treeEstados.entrySet()) {
            if (estado.getValue().equalsIgnoreCase("MATO GROSSO DO SUL")) {
                treeEstados.remove(estado.getKey());
                break;
            }
        }

        System.out.println(treeEstados);

        for (Map.Entry<String, String> estado : treeEstados.entrySet()) {
            System.out.println(estado.getValue() + " (" + estado.getKey() + ") ");
        }
        //procurando SC
        String keyToSearch = "SC";
        if (treeEstados.containsKey(keyToSearch)) {
            System.out.println(treeEstados.get(keyToSearch));
        } else {
            System.err.println("Chave não existe");
        }
        //procurando MARANHAO
        for (Map.Entry<String, String> estado : treeEstados.entrySet()) {
            if (estado.getValue().equalsIgnoreCase("MARANHAO")) {
                System.out.println(estado.getKey()+ " " + estado.getValue());
            }


        }
    }
}

