package com.list;

public class Main {

    public static void main(String[] args) {
    String name = "Suele";
    int age = 30;
    int size = 5;

    Aluno aluno1 = new Aluno(name, age);
    Alunos alunos = new Alunos(size);
    alunos.add(aluno1);

    Aluno aluno2 = new Aluno("Maria", 67);
    alunos.add(aluno2);

    Aluno aluno3 = new Aluno("Suara", 37);
    alunos.add(aluno3);

    Aluno aluno4 = new Aluno("Vando", 63);
    alunos.add(aluno4);

    Aluno aluno5 = new Aluno("Sonia", 71);
    alunos.add(aluno5);

    Aluno aluno7 = new Aluno("Abraa", 71);
    alunos.add(aluno7);

    System.out.println("Lista de alunos" + alunos);
    alunos.seach(aluno1);
    System.out.println("Lista de alunos" + alunos);

    }

}


