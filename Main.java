import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println(
        "Misses Benny: Hello new students, my names Ms.Benny and I will be your teacher for this year. I would like to get to know your names!");
    // This is just like a script of Ms. Benny introducing herself

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // This is the seat numbers
    String[] names = new String[15];
    // This represents 15 students
    Scanner scan = new Scanner(System.in);
    // This scanner is to get the students names
    for (int i = 0; i < 15; i++) {
      System.out.println("What's are your name?");
      names[1] = scan.next();
    }
    System.out.println("Ms.Benny: Nice to meet you all now we shall assign new seats to everyone!");

    /*while (numbers[] < 15; names[] < 15) {
      System.out.println(names[] + "You'll sit in" + numbers[]);*/
    }
  }
