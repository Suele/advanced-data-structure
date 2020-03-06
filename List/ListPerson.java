import java.util.Scanner;

public class ListPerson {

  public String nomes[] = new String[4];

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
    Scanner input = new Scanner(System.in);

    System.out.println("Nome: ");
    String nome = input.nextLine();

  }

  public void showList() {
    if (isEmpty() != true) {
      for (int i = 0; i < nomes.length; i++) {
        System.out.print("lista" + nomes[i]);
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
    System.out.println("A lista está vazia " + person.isEmpty());
  }
}