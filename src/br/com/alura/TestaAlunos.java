package br.com.alura;

import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
     Collection<String> alunos = new HashSet<>(); //- > você pode colocar a interface mãe Collection ou a filha HashSet
     alunos.add("Rodrigo Turini");
     alunos.add("Alberto Souza");
     alunos.add("Nico Steppat");
     alunos.add("Sergio Lopez");
     alunos.add("Renan Saggio");
     alunos.add("Mauricio Aniche");
     alunos.add("Mauricio Aniche");

     boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");

     alunos.remove("Sergio Lopez");

        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

     System.out.println(alunos);

     List<String> alunosEmLista = new ArrayList<>(alunos);

    }
}
