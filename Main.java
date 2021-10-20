/*https://en.wikipedia.org/wiki/Synthetic_division#Expanded_synthetic_division
depreciates most all of the work i was going to do

But not completely, going to implement full synth division*/

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

class Main {
  public static int[] poly_remainder(int[] a, int[] b) {
    Queue<Integer> remainder = new LinkedList<>();
    int highest = b[0];
    for (int i;i<b.length;i++) {b[i]*=-1;}
    int coef = 1;
    for (int i : a) {
      if (i != highest) {
        remainder.add((double) a[coef]/highest);
        
      }
    }
  }

  public static int[] HCF(int[] a, int[] b) {
    Queue<Integer> s = new LinkedList<>(List.of(1, 0));
    Queue<Integer> t = new LinkedList<>(List.of(0, 1));
    int quot=0;
    while (b != 0) {
      int x = b;
      //b = a % b; depreciated by Poly_Remainder
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
    int[] a = {3,5,2,1,9};
    int[] b = {4,6,7,2};
    //3x^4 + 5x^3 + 2x^2 + x + 9 => {{3,4},{5,3},{2,2},{1,1},{9,0}}
    //In the form [coefficient][indice]
    //or skip the indicies entirely, just use the length then it can be 1D
    //{3,5,2,1,9}
    int[] hcf = HCF(a, b);
    System.out.println("\nHighest Common Factor: ");
    System.out.println(hcf);
  }
}