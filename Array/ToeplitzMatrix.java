import java.util.*;
public class Main{
  
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int c = s.nextInt();
    int arr[][] = new int[r][c];
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        arr[i][j] = s.nextInt();
      }
    }
    for(int i=0; i<r-1; i++){
      for(int j=0; j<c-1; j++){
        if(arr[i][j] != arr[i+1][j+1]){
          System.out.print("false");
          return;
        }
      }
    }
    System.out.print("true");
  }
}
