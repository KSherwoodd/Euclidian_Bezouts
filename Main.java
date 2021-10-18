import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

class Main {
  public static int HCF(int[][] a, int[][] b) {
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
    System.out.println("\nBezout's Identity: ");
    System.out.println(s.peek() + " " + t.peek());
    return a;
  }
  public static void main(String[] args) {
    /*Scanner input = new Scanner(System.in);
    System.out.println("A: ");
    int a = input.nextInt();
    System.out.println("B: ");
    int b = input.nextInt();
    input.close();*/ 
    int[][] a = new int[5][2];
    int[][] b = new int[4][2];
    //3x^4 + 5x^3 + 2x^2 + x + 9 => {{3,4},{5,3},{2,2},{1,1},{9,0}}
    //In the form [coefficient][indice]
    int hcf = HCF(a, b);
    System.out.println("\nHighest Common Factor: ");
    System.out.println(hcf);
  }
}