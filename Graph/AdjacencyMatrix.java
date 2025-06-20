/*
Example:
Sample Input 1:
4 5
undirected
0 1
0 2
1 2
1 3
2 3

Sample Output 1:
0 1 1 0
1 0 1 1
1 1 0 1
0 1 1 0

Sample Input 2:
3 3
directed
0 1
1 2
2 0

Sample Output 2:
0 1 0
0 0 1
1 0 0
*/


import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int adjacency[][] = new int[n][n];
    String str = s.next();
    for(int i=0; i<m; i++){
      int u = s.nextInt();
      int v = s.nextInt();
      adjacency[u][v] = 1;
      if(str.equals("undirected"))
        adjacency[v][u] = 1;
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(j!=n-1)
          System.out.print(adjacency[i][j]+" ");
        else
          System.out.print(adjacency[i][j]);
      }
      System.out.println();
    }
  }
}
