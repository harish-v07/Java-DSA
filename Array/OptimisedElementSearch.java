/* You are given a r x c matrix where every row and every column is sorted in ascending order. Your task is to determine whether a given number x exists in the matrix. Instead of scanning the entire matrix, you can use a smart search technique starting from the top-right or bottom-left corner. From there, you can eliminate a row or column in each step based on the comparison with x. This approach ensures an efficient search in O(r + c) time complexity. You must print "YES" if x is found and "NO" otherwise. This problem tests your ability to apply logical optimization techniques to matrix-based search problems.

Input Format:
First line: two integers r and c (number of rows and columns)
Next r lines: each contains c integers (sorted row-wise and column-wise)
Last line: an integer x to be searched

Output Format:
Print "YES" if x is found, otherwise print "NO"


Constraints:
1 ≤ r, c ≤ 1000
-10⁶ ≤ matrix[i][j], x ≤ 10⁶
Each row and each column is sorted in non-decreasing order


Example:
Sample Input:
3 3
1 4 7
2 5 8
3 6 9
5
 
Sample Output:
YES

Public Test Cases:
#	INPUT	EXPECTED OUTPUT
	
1 5
1 3 5 7 9
3
YES
	
4 4
10 20 30 40
15 25 35 45
27 29 37 48
32 33 39 50
29
YES

3 3
1 2 3
4 5 6
7 8 9
10
NO
	
3 3
1 2 3
4 5 6
7 8 9
11
NO

4 2
1 2
3 4
5 6
7 8
6
YES

1 4
10 20 30 40
25
NO
7	
3 3
-5 -2 0
1 2 3
4 6 8
6
YES

3 4
1 2 8 9
2 4 9 12
4 7 10 13
7
YES

2 2
1 3
2 4
5
NO
	
2 3
1 3 5
2 4 6
4
YES
*/



import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int r = s.nextInt();
      int c = s.nextInt();
      int arr[][] = new int[r][c];
      for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
          arr[i][j] = s.nextInt();
        }
      }
      int target = s.nextInt();
      int i=0, j=c-1;
      while(i<r && j>=0){
        if(arr[i][j]>target)
          j--;
        else if(arr[i][j]<target)
          i++;
        else{
          System.out.print("YES");
          return;
        }
      }
      System.out.print("NO");
    }
}
