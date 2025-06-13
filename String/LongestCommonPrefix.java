/*
Input
4
flower
flight
flute
flow

Output
fl
*/




import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String a[] = new String[n];
    for(int i=0; i<n; i++)
      a[i] = s.next();
    String prefix = a[0];
    for (int i = 1; i < a.length; i++) {
      while (a[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) {
          System.out.print("");
          return;
        }
      }
    }
    System.out.print(prefix);
  }
}
