import java.util.Scanner;import java.util.Queue;import java.util.LinkedList;import java.util.List;

class Main {
  public static int HCF(int a, int b) {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> r = new LinkedList<>();
    Queue<Integer> s = new LinkedList<>(List.of(1, 0));
    Queue<Integer> t = new LinkedList<>(List.of(0, 1));
    //int i=0;
    while (b != 0) {
      int x = b;
      b = a % b;
      int rema = b;
      r.add(rema);
      if (b != 0) {int quot = a / b;q.add(quot);}
      a = x;
      s.add(s.remove()-q.peek()*s.peek());
      t.add(t.remove()-q.peek()*t.peek());
      //i++;
    }
    System.out.println(s.poll() + " " + t.poll());
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