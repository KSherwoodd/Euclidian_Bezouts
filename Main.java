import java.util.Scanner;import java.util.Queue;import java.util.LinkedList;
class Main {
  public static int HCF(int a, int b) {
    Queue<Integer> quotients = new Queue<Integer>(new int[] {0, 1});
    Queue<Integer> remainders = new LinkedList<>();
    while (b != 0) {
      int x = b;
      b = a % b;
      quotients.add(b);
      if (b != 0) {int q = a / b;}
      a = x;
    }
    return a;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("A and B: ");
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println(HCF(a, b));
  }
}