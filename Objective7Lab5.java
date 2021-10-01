import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] arg){
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      System.out.println("____Menu____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();

      if(selection == 1)
      System.out.println(" Hello World ");

      if(selection == 2)
      System.out.println(" Apple, Banana, Coconut ");

      if(selection == 3)
      break;

      //the instructions were different from the actual expected output.
      //Hello World was Hello Human, and there was no Goodbye at the break.






    }

    scanner.close();
  }
}
