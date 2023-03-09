package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções do Java", "Paulo Silveira");
//
//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);
//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
//        System.out.println(aulas == javaColecoes.getAulas());

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22));

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(javaColecoes.getAulas());


    }
}
