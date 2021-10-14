import java.util.Scanner;import java.util.Queue;import java.util.LinkedList;import java.util.List;

class Main {
  public static int HCF(int a, int b) {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> r = new LinkedList<>();
    Queue<Integer> s = new LinkedList<>(List.of(1, 0));
    Queue<Integer> t = new LinkedList<>(List.of(0, 1));
    int i=0;
    while (b != 0) {
      int x = b;
      b = a % b;
      int r = b;
      r.add(r);
      if (b != 0) {int quot = a / b;q.add(q);}
      a = x;
      s.add(s.poll()-q.peek());
      i++;
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