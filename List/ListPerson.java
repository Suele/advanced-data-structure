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

    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i] == null) {
        nomes[i] = nome;
      }
    }
  }

  public void showList() {
    for (int i = 0; i < nomes.length; i++) {
      if (isEmpty() == true) {
        System.out.println("Lista está vazia.");
      } else {
        System.out.println(nomes[i]);
      }
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