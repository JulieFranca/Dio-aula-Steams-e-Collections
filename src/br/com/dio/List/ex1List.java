package br.com.dio.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ex1List {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("Juliana");
        nomes.add("João");
        nomes.add("Amadeu");
        nomes.add("Francine");

        nomes.set(2,"Larissa");
        System.out.println(nomes);

        nomes.remove(1);
        System.out.println(nomes);

        nomes.remove("Carlos");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        Collections.sort(nomes);
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);

        int posicao = nomes.indexOf("Francine");
        System.out.println(posicao);

        int posicao1 = nomes.indexOf("Wesley");
        System.out.println(posicao1);

        for (String nomeDoItem:nomes) {
            System.out.println("===>" + nomeDoItem);
        }

        Iterator <String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("--->" + iterator.next());
        }

        boolean listaVazia = nomes.isEmpty();
        nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println(nomes);



    }
}
