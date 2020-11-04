import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  
  String[] names = new String[15];
  
  for (int i=0; i<16; i++ ){
    System.out.println( names[i] );
  }
  Scanner scan = new Scanner(System.in);
    System.out.println("What are you're guys names?");
  String name = scan.next();

    System.out.println(name);
  }
}