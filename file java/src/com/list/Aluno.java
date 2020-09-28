package com.list;

public class Aluno {
   private String name;
   private int age;

   public Aluno(String name, int age) {
      this.name = name;
      this.age = age;
   }

   @Override
   public String toString() {
      return "Aluno(a): " + "Name: " + this.name + ", " + " idade: " + this.age;
   }

   public String getName() {
      return this.name;
   }

}
