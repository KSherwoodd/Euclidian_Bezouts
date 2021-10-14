import java.util.Scanner;
class Main {
  public static int HCF(int a, int b) {
    while (b != 0) {
      int x = b;
      b = a % b;
      a = x;
    }
    return a;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println(HCF(a, b));
  }
}