/*
In the design of an AI game engine that includes classic puzzles, you're tasked with implementing a solution for the N-Queens problem. The goal is to place N queens on an N x N chessboard such that no two queens attack each other (i.e., no two queens share the same row, column, or diagonal).

Write a program that returns a distinct solutions to the N-Queens puzzle. The solution needs to print the N Queens position in their respective rows.

Input Format:
A single integer n — the size of the chessboard and number of queens.

Output Format:
print the N Queens position in their respective rows (One possible solution), otherwise print "-1".

Constraints:
1 ≤ n ≤ 10


Example:
Sample Input:
4

Sample Output:
2 4 1 3


Public Test Cases:
#	INPUT	EXPECTED OUTPUT
	
2
-1

1
1

7
1 3 5 7 2 4 6 

4
2 4 1 3 

6
2 4 6 1 3 5 
	
4
2 4 1 3 
	
5
1 3 5 2 4 
	
3
-1
*/


import java.util.*;
public class Main{
  static int f = 0;
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    char arr[][] = new char[n][n];
    if(n==2||n==3){
      System.out.print("-1");
      return;
    }
    else if(n==1){
      System.out.print("1");
      return;
    }
    solve(arr,0,n);
  }
  static void solve(char board[][], int row, int n){
    if(row==n && f==0){
      print(board,n);
    }
    for(int col=0; col<n; col++){
      if(isSafe(board,row,col,n)){
        board[row][col] = 'Q';
        solve(board, row+1, n);
        board[row][col] = '.';
      }
    }
  }
  static boolean isSafe(char board[][], int row, int col, int n){
    for(int i=0; i<row; i++){
      if(board[i][col] == 'Q')
        return false;
    }
    
    for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
      if(board[i][j] == 'Q')
        return false;
    }
    for(int i=row-1, j=col+1; i>=0 && j<n; i--,j++){
      if(board[i][j] == 'Q')
        return false;
    }
    return true;
  }
  static void print(char board[][], int n){
    f=1;
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(board[i][j] == 'Q'){
          System.out.print(j+1+" ");
        }
      }
    }
  }
}
