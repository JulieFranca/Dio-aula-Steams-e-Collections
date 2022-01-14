package br.com.dio.set;

import java.util.Iterator;
import java.util.TreeSet;

public class exercicioFinalTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);
        //exibe os numeros
        System.out.println(numeros);

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()){
            System.out.println("=>"+iterator.next());
        }
        for (Integer numero: numeros) {
            System.out.println("->"+numero);
        }
        numeros.remove(numeros.pollFirst());
        //exibe os numeros
        System.out.println(numeros);
        numeros.add(23);

        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());
        numeros.clear();
        System.out.println(numeros.isEmpty());

        System.out.println("===========================================================");
        //exibe os numeros
        System.out.println(numeros);

    }
}
