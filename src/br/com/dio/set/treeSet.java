package br.com.dio.set;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {

        //
        TreeSet <String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Brasilia");

        //exibe lista
        System.out.println(treeCapitais);
        //retorna primeira capital do topo da arvore
        System.out.println(treeCapitais.first());

        //retorna ultima capital da arvore
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixo na arvore da capital de parametro
        System.out.println(treeCapitais.lower("Florianopolis"));

        //retorna a primeira capital acima na arvore da capital de parametro
        System.out.println(treeCapitais.higher("Florianopolis"));

        //exibe todas as capitais
        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore, removendo o set
        System.out.println(treeCapitais.pollFirst());

        //retorna a primeira capital no final da arvore, removendo o set
        System.out.println(treeCapitais.pollLast());

        //exibe todas as capitais
        System.out.println("'"+treeCapitais+"'");

        Iterator <String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()){
            System.out.println("=>"+iterator.next());
        }
        for (String capital: treeCapitais) {
            System.out.println("->"+capital);
        }

        //retorna se o set está vazio ou não
        System.out.println(treeCapitais.isEmpty());
        //limpa lista
        treeCapitais.clear();
        //retorna se o set está vazio ou não
        System.out.println(treeCapitais.isEmpty());

    }
}
