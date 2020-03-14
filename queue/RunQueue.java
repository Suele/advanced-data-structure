import java.util.Scanner;

public class RunQueue {

  public static void main(String[] args) {
    QueueStudent person = new QueueStudent();

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