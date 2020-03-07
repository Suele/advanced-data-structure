import java.util.Scanner;

public class ListPerson {

  public String nomes[] = new String[4];
  public Scanner input = new Scanner(System.in);

  public int totalElements() {
    return nomes.length;
  }

  public boolean isEmpty() {
    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i] == null) {
        return true;
      }
    }
    return false;
  }

  public void addElement() {

    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i] == null) {

        System.out.print("Digite um nome: ");
        String nome = input.nextLine();

        nomes[i] = nome;
      } else {
        System.out.println("A lista está cheia.");
      }
    }

  }

  public void showList() {
    if (isEmpty() != true) {
      for (int i = 0; i < nomes.length; i++) {
        System.out.println(nomes[i]);
      }
    } else {
      System.out.println("A lista está fazia.");
    }
  }

  public static void main(String[] args) {
    ListPerson person = new ListPerson();
    System.out.println("A lista está vazia " + person.isEmpty());
    System.out.println("tamanho da lista: " + person.totalElements());

    person.addElement();

    person.showList();
    System.out.println("\nA lista está vazia: " + person.isEmpty());
  }
}