import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = 6;

    System.out.println("Please enter a number:");
    num = scan.nextInt();

    if(num % 2 == 0)
    System.out.println("The number is even");

    if(num % 2 != 0)
    System.out.println("The number is odd");

    }
  }
