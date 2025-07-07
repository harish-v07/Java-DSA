/*
Example:
Sample Input:
3 3
1 2 3
4 0 6
7 8 9

Sample Output:
1 0 3
0 0 0
7 0 9
*/




import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int c = s.nextInt();
    int arr[][] = new int[r][c];
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++)
        arr[i][j] = s.nextInt();
    }
    boolean[] rows = new boolean[r];
    boolean[] cols = new boolean[c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (arr[i][j] == 0) {
          rows[i] = true;
          cols[j] = true;
        }
      }
    }

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {  
        if (rows[i] || cols[j]) {
          arr[i][j] = 0;
        }
      }
    }
    
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        if(j!=c-1)
          System.out.print(arr[i][j]+" ");
        else
          System.out.print(arr[i][j]);
      }
      System.out.println();
    }
  }
}
