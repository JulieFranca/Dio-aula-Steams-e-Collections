package br.com.dio.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set <Double> notasAlunos = new HashSet<>();

        //adicionando notas
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        //exibe as notas dos alunos
        System.out.println(notasAlunos);
        //removendo nota de valor especifico
        notasAlunos.remove(3.8);
        //exibe as notas dos alunos
        System.out.println(notasAlunos);
        //exibe a quantidade de notas
        System.out.println(notasAlunos.size());
        //navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Double nota:notasAlunos) {
            System.out.println(nota);
        }
        //limpa lista
        notasAlunos.clear();

        //retorna se o set está vazio ou não
        System.out.println(notasAlunos.isEmpty());
        System.out.println(notasAlunos);
    }
}
