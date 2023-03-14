package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        Aluno a4 = new Aluno("Paulo Silveira", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem é o aluno com matricula 17645?");
        Aluno aluno = javaColecoes.buscaMatriculado(17645);
        System.out.println("aluno: " + aluno);

        Map<Integer, Set<Aluno>> matriculaParaAlunos;
    }

}
