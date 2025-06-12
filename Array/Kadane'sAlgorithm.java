import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[] = new int[n];
    for(int i=0; i<n; i++)
      a[i] = s.nextInt();
    int currSum = a[0];
    int maxSum = a[0];
    for(int i=1; i<n; i++){
      currSum = Math.max(currSum+a[i], a[i]);
      maxSum = Math.max(currSum, maxSum);
    }
    System.out.print(maxSum);
  }
}
