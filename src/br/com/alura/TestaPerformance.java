package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

//        Collection<Integer> numeros = new ArrayList<Integer>(); - > descomente para testar a velocidade do código com uma lista

        Collection<Integer> numeros = new HashSet<>(); // -> estamos testando a velocidade do códico com um hashset, comente essa linha para testar com a lista a cima

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 150000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}