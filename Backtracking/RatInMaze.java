/*
You are given an n x n maze where:
1 represents a valid path,
0 represents a blocked cell.

The rat starts at position (0, 0) and wants to reach (n-1, n-1). It can move in 4 directions: Down (D) and Right (R) but only onto cells with value 1.

Your task is to print the first path you find from the source to the destination. If no path exists, print "NO PATH".

Input Format:
First line: An integer n (the size of the grid).
Next n lines: Each line contains n space-separated integers (0 or 1) representing the maze.
Output Format:
A single string of directions representing the path.
Or "NO PATH" if no path exists.

Constraints:
1 ≤ n ≤ 10

The rat can move only to cells with value 1.

The rat cannot visit the same cell twice in one path.


Example:
Sample Input:
4
1 0 0 0
1 1 0 1
1 1 0 0
0 1 1 1

Sample Output:
DDRDRR


Public Test Cases:
#	INPUT	EXPECTED OUTPUT

3
0 1 1
1 1 0
1 1 1
NO PATH

3
1 1 1
1 1 1
1 1 0
NO PATH
	
3
1 1 1
1 0 1
1 1 1
RRDD
	
4
1 0 0 0
1 1 0 1
1 1 0 0
0 1 1 1
DRDDRR
	
2
1 1
0 1
RD
	
4
1 0 0 0
1 1 0 1
1 1 0 0
0 1 1 1
DRDDRR
	
2
1 0
0 1
NO PATH
	
2
1 1
0 1
RD
*/



import java.util.*;
public class Main{
  static boolean found = false;
  static String res = "";
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int maze[][] = new int[n][n];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        maze[i][j] = s.nextInt();
      }
    }
    boolean visited[][] = new boolean[n][n];
    if(maze[0][0] != 1 || maze[n-1][n-1] == 0){
      System.out.print("NO PATH");
      return;
      
    }
    if(maze[0][0]==1){
      path(0,0,maze,visited,n,"");
    }
    if(found)
      System.out.print(res);
      
    else
      System.out.print("NO PATH");
  }
  static void path(int i, int j, int maze[][], boolean visited[][], int n, String path){
    if(i==n-1&&j==n-1){
      found = true;
      res = path;
      return;
    }
    if(i<0 || j<0 || i>=n || j>=n ||maze[i][j] == 0 || visited[i][j])
      return;
    visited[i][j] = true;
    path(i+1, j, maze, visited, n, path+"D");
    path(i, j+1, maze, visited, n, path+"R");
    
    visited[i][j] = false;
  }
}
