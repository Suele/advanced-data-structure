package com.list;

import java.util.Arrays;

public class Alunos {
   private Aluno[] alunos;
   private int size;

   public Alunos(int size) {
      this.size = size;
      this.alunos = new Aluno[this.size];
   }

   public void add(Aluno aluno) {
      for (int i = 0; i < this.alunos.length; i++) {
         if (this.alunos[i] == null) {
            this.alunos[i] = aluno;
            break;
         }
      }
   }

   public void seach(Aluno aluno) {
      for (int i = 0; i < this.alunos.length; i++) {
         if (this.alunos[i].getName().equals(aluno.getName())) {
            System.out.println("O aluno existe");
            break;
         }
         System.out.println("O Aluno não existe");
         break;
      }
   }

   @Override
   public String toString() {
      return " Alunos{" +
            "alunos=" + Arrays.toString(this.alunos) +
            ", size=" + size +
            '}';
   }
}
