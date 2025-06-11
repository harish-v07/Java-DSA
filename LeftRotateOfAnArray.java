import java.util.*;
public class Main{
  public static void reverse(int arr[], int start, int end){
    while(start<end){
      int temp = arr[start];
      arr[start++] = arr[end];
      arr[end--] = temp;
    }
  }
  public static void leftrotate(int arr[], int d, int n){
    d = d % n;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
  }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int d = s.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = s.nextInt();
    leftrotate(arr,d,n);
    for(int i=0; i<n; i++)
      System.out.print(arr[i]+" ");
  }
}
