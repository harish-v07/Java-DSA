import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++)
      arr[i] = s.nextInt();
    int low = 0, mid = 0, high = n-1;
    while(mid <= high){
      switch(arr[mid]){
        case 0:
          int temp0 = arr[low];
          arr[low++] = arr[mid];
          arr[mid++] = temp0;
          break;
        case 1:
          mid++;
          break;
        case 2:
          int temp2 = arr[mid];
          arr[mid] = arr[high];
          arr[high--] = temp2;
      }
    }
    for(int i=0; i<n; i++)
      System.out.print(arr[i]+" ");
  }
}
