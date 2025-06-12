import java.util.*;
public class Main {
    public static int countSmallerThanOrEqual(int row[], int target){
      int low = 0, high = row.length;
      while(low<high){
        int mid = (low+high)/2;
        if(row[mid] <= target)
          low = mid+1;
        else
          high = mid;
      }
      return low;
    }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int r = s.nextInt();
      int c = s.nextInt();
      int arr[][] = new int[r][c];
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
          arr[i][j] = s.nextInt();
          if(arr[i][j]<min){
            min = arr[i][j];
          }
          if(arr[i][j]>max){
            max = arr[i][j];
          }
        }
      }
      int desired = (r*c+1)/2;
      while(min<max){
        int mid = (min+max)/2;
        int place = 0;
        for(int i=0; i<r; i++){
          place += countSmallerThanOrEqual(arr[i], mid);
        }
        if(place < desired){
          min = mid + 1;
        }
        else{
          max = mid;
        }
      }
      System.out.print(min);
    }
}
