import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");

    String sen= sc.nextLine();
    System.out.println("Original String: " + sen);

    sen = input.replaceAll("\\s", "");
    System.out.println("Final String: " + input);
    sc.close();
  }
}
