package br.com.dio.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        //mantem a ordem de inserção de dados
        LinkedHashSet <Integer> sequenciaNumerica = new LinkedHashSet<>();
        //adiciona os numeros no set

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        //Exibe Sequencia numerica
        System.out.println(sequenciaNumerica);
        //remove o numero do set
        sequenciaNumerica.remove(4);
        //Exibe Sequencia numerica
        System.out.println(sequenciaNumerica);
        //retorna quantidade de itens
        System.out.println(sequenciaNumerica.size());
        //navega nos itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println("=> "+iterator.next());
        }
        //navega nos itens no foreach
        for (Integer numero:sequenciaNumerica) {
            System.out.println("->"+numero);
        }

        //retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());
        //limpa lista
        sequenciaNumerica.clear();
        //retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
