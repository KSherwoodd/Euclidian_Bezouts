import java.util.Scanner;import java.util.Queue;import java.util.LinkedList;import java.util.List;

class Main {
  public static int HCF(int a, int b) {
    Queue<Integer> s = new LinkedList<>(List.of(1, 0));
    Queue<Integer> t = new LinkedList<>(List.of(0, 1));
    int quot=0;
    while (b != 0) {
      int x = b;
      b = a % b;
      if (b != 0) {quot = a / x;}
      s.add(s.remove()-quot*s.peek());
      t.add(t.remove()-quot*t.peek());
      a = x;
      /*System.out.println();
      System.out.println(quot + " " + s.peek() + " " + t.peek());*/
    }
    return a;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("A and B: ");
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println(HCF(a, b));
    input.close();
  }
}