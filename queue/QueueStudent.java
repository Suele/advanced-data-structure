import java.util.Scanner;

public class QueueStudent {

  private Student studentO;
  private Student student[];
  private Scanner input = new Scanner(System.in);

  public QueueStudent() {
    student = new Student[4];
  }

  public boolean isEmpty() {
    for (int i = 0; i < student.length; i++) {
      if (student[i] != null) {
        return false;
      }
    }
    return true;
  }

  public void addElement() {

    for (int i = 0; i < student.length; i++) {
      if (student[i] == null) {

        studentO = new Student();

        System.out.print("Digite o nome do aluno: ");
        String name = input.nextLine();
        studentO.insertName(name);

        System.out.print("Digite a graduação: ");
        String graduation = input.nextLine();
        studentO.insertGraduation(graduation);

        student[i] = studentO;

        name = null;
        graduation = null;
        break;
      } else {
        System.out.println("A fila está cheia.");
      }
    }

  }

  public void remove() {

    if (!isEmpty()) {
      student[0] = null;
      showList();

      for (int i = 0; i < student.length; i++) {
        if (student[i] != null) {
          student[i - 1] = student[i];
          student[i] = null;
        }
      }
      showList();
    }
  }

  public void showList() {

    if (!isEmpty()) {
      System.out.println("Elementos na fila\n");
      for (int i = 0; i < student.length; i++) {
        System.out.println(student[i]);
      }
    } else {
      System.out.println("Não há elementos na fila.");
    }

  }

}