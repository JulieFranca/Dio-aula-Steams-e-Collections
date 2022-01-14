package br.com.dio.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ex2LinkedList {
    public static void main(String[] args) {
        Queue <String> filaBanco = new LinkedList<>();

        //adcionando informações

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        filaBanco.add("Carlos");
        System.out.println(filaBanco);

        //exibir primeiro a ser atendido e remove da fila de atendimento
        String clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);
        //exibir primeiro a ser atendido sem remover da fila de atendimento
        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //buscar primeiro cliente se vazio erro
        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        //adcionando outro cliente
        filaBanco.add("Rodrigo");
        //buscando cliente na fila
        int posicao = ((LinkedList<String>) filaBanco).indexOf("Rodrigo");
        System.out.println(posicao);

        //exibindo a fila foreach
        for (String cliente:filaBanco) {
            System.out.println(cliente);
            
        }
        //exibindo usando iterator
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("==> " + iteratorFilaBanco.next());
        }
        //tamanho da fila
        System.out.println(filaBanco.size());
        //booleano para caso fila vazia se vazia retorna true
        System.out.println(filaBanco.isEmpty());
        //booleano de pesquisa de nome se possui nome informado retorna true
        boolean temCarlos = filaBanco.contains("Carlos");
        System.out.println(temCarlos + " Carlos");

    }
}