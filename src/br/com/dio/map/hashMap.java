package br.com.dio.map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiais = new HashMap<>();

        //adicionando valores as chaves

        campeoesMundiais.put("BRASIL", 5);
        campeoesMundiais.put("ALEMANHA", 4);
        campeoesMundiais.put("ITALIA", 4);
        campeoesMundiais.put("URUGUAI", 2);
        campeoesMundiais.put("ARGENTINA", 2);
        campeoesMundiais.put("FRANCA", 2);
        campeoesMundiais.put("INGLATERRA", 1);
        campeoesMundiais.put("ESPANHA", 1);

        System.out.println(campeoesMundiais);

        //atualizando valores a variavel Brasil
        campeoesMundiais.put("BRASIL", 6);
        System.out.println(campeoesMundiais);

        //retorna a argentina
        System.out.println(campeoesMundiais.get("ARGENTINA"));

        //retorna se existe ou não um campeao Franca
        System.out.println(campeoesMundiais.containsKey("FRANCA"));
        //retorna se existe ou não um campeao Belgica
        System.out.println(campeoesMundiais.containsKey("BELGICA"));

        // Remove o campeão França
        campeoesMundiais.remove("FRANCA");

        System.out.println(campeoesMundiais);

        //retorna se existe ou não uma Hexa campeao
        System.out.println(campeoesMundiais.containsValue(6));

        //retorna o tamanho do mapa
        System.out.println(campeoesMundiais.size());

        System.out.println(campeoesMundiais);

        for (Map.Entry<String,Integer> entry :campeoesMundiais.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
        for (String key: campeoesMundiais.keySet()){
            System.out.println(key + " | "  + campeoesMundiais.get(key));
            }
        System.out.println(campeoesMundiais);

        //verifica se o mapa contem chave Estados Unidos
        System.out.println(campeoesMundiais.containsKey("ESTADOS UNIDOS"));
        if(campeoesMundiais.containsKey("ESTADOS UNIDOS") == false){
            System.out.println("ESTADUNIDENSES NAO TEM MUNDIAL");
        }

        //verifica se mapa contem o valor 5
        System.out.println(campeoesMundiais.containsValue(5));

        //exibe tamanho
        System.out.println(campeoesMundiais.size());

        //limpar e exibir apos limpar
        campeoesMundiais.clear();
        System.out.println(campeoesMundiais);

    }
}
