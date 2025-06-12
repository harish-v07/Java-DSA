/* You are given a r x c matrix where each row is sorted in ascending order. Your task is to find the median of all the elements in the matrix. Since the rows are sorted, but the overall matrix is not, the median is not necessarily at the center of the matrix. The median is defined as the middle value when all elements are sorted. If the total number of elements is odd, it's the middle one; if even, return the lower middle one. Instead of flattening and sorting the entire matrix, you can use a binary search between the minimum and maximum values and count how many elements are ≤ mid to find the correct median efficiently in O(32 * r * log c) time.

Input Format:
First line: Two integers r and c — rows and columns of the matrix
Next r lines: Each line contains c space-separated integers (row-wise sorted)

Output Format:
Print a single integer — the median value of the matrix


Constraints:
1 ≤ r, c ≤ 500
1 ≤ matrix[i][j] ≤ 10⁹
Each row is sorted in ascending order
Total number of elements (r × c) is always odd


Example:
Sample Input:
3 3
1 3 5
2 6 9
3 6 9

Sample Output:
5
*/


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
