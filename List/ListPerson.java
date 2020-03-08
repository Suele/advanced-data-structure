import java.util.Scanner;

public class ListPerson {

  private String nomes[] = new String[4];
  private Scanner input = new Scanner(System.in);

  public int totalElements() {
    return nomes.length;
  }

  public boolean isEmpty() {
    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i] != null) {
        return false;
      }
    }
    return true;
  }

  public void addElement() {

    for (int i = 0; i < nomes.length; i++) {
      if (nomes[i] == null) {

        System.out.print("Digite um nome: ");
        String nome = input.nextLine();

        nomes[i] = nome;
        break;
      } else {
        System.out.println("A lista está cheia.");
      }
    }

  }

  public void remove() {
    System.out.println("metodo remover.");
  }

  public void showList() {

    System.out.println("\n");
    System.out.println("Lista de elementos\n");
    if (!isEmpty()) {
      for (int i = 0; i < nomes.length; i++) {
        System.out.println(nomes[i]);
      }
    } else {
      System.out.println("Não há elementos na lista.");
    }

  }

  public static void main(String[] args) {

    ListPerson person = new ListPerson();

    Scanner input = new Scanner(System.in);
    int opcao = 0;

    System.out.println("\n");
    System.out.println("-----------------------------------------------------");
    System.out.println("Fila de nomes\n");
    System.out.println("5 - Finalizar o programa");
    System.out.println("1 - Adicionar");
    System.out.println("2 - Remover");
    System.out.println("3 - Visualizar os elementos da fila.");
    System.out.println("-----------------------------------------------------");
    System.out.println("\n");

    while (opcao != 5) {
      System.out.print("Digite uma opção: ");
      opcao = input.nextInt();
      System.out.println("\n");

      switch (opcao) {
        case 1:
          opcao = 0;
          System.out.println("------------");
          person.addElement();
          System.out.println("------------");
          break;

        case 2:
          opcao = 0;
          System.out.println("------------");
          person.remove();
          System.out.println("------------");
          break;

        case 3:
          opcao = 0;
          System.out.println("------------");
          person.showList();
          System.out.println("------------");
          break;
      }
    }

  }
}