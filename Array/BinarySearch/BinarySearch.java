import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
        arr[i] = s.nextInt();
      int target = s.nextInt();
      int low = 0, high = n - 1;
      while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target){
          System.out.print(mid);
          return;
        }
        if (arr[mid] < target)
          low = mid + 1;
        else
          high = mid - 1;
      }
      System.out.print("-1");
    }
}
