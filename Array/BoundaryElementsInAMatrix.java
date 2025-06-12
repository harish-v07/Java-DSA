import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int r = s.nextInt();
    int c = s.nextInt();
    int arr[][] = new int[r][c];
    for(int i=0; i<r; i++){
      for(int j=0; j<c;j++){
        arr[i][j] = s.nextInt();
      }
    }
    int top = 0, left =0, right = c-1, bottom=r-1;
    while(top<=bottom && left<= right){
      if(top>0){
        return;
      }
      for(int i=left; i<=right; i++){
        System.out.print(arr[top][i]+" ");
      }
      top++;
      for(int i=top; i<=bottom; i++){
        System.out.print(arr[i][right]+" ");
      }
      right--;
      if(top<=bottom){
        for(int j=right; j>=left;j--){
          System.out.print(arr[bottom][j]+" ");
        }
        bottom--;
      }
      if(left<=right){
        for(int j=bottom; j>=top;j--){
          System.out.print(arr[j][left]+" ");
        }
        left++;
      }
    }
  }
}
