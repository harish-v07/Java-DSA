import java.util.*;
public class Main {
    static int max(int a, int b, int c) {
      return Math.max(a, Math.max(b, c));
    }
    static int min(int a, int b, int c) {
      return Math.min(a, Math.min(b, c));
    }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
        arr[i] = s.nextInt();
      int currMax = arr[0];
      int currMin = arr[0];
      int maxProd = arr[0];
      for (int i=1; i<n; i++) {
          int temp = max(arr[i], arr[i] * currMax, arr[i] * currMin);
          currMin = min(arr[i], arr[i] * currMax, arr[i] * currMin);
          currMax = temp;
          maxProd = Math.max(maxProd, currMax);
      }
      System.out.print(maxProd);
    }
}
