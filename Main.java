import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] names = new String[15];
    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < 15; i++) {
      System.out.println("What are you're guys names?");
      names[1]  = scan.next();
    }

  }
}