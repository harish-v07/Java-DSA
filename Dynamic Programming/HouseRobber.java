/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, represented as a non-negative integer in an array.

However, adjacent houses have security systems connected, and robbing two adjacent houses will alert the police.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob without alerting the police.

Input Format:
First line: An integer N, the number of houses.

Second line: N space-separated integers, where each integer is the money in a house.

Output Format:
Print a single integer — the maximum amount of money that can be robbed.


Constraints:
1 ≤ N ≤ 10⁵

0 ≤ nums[i] ≤ 10⁴


Example:
Sample Input:
5
2 7 9 3 1

Sample Output:
12


Explanation:
The robber can rob house 1 (2) + house 3 (9) + house 5 (1) = 12, skipping houses with alarms.


Public Test Cases:
#	INPUT	EXPECTED OUTPUT

6
6 7 1 30 8 2
39

1
10
10
	
2
10 20
20
	
5
100 1 100 1 100
300
	
7
2 10 14 8 1 9 3
27
	
4
1 2 3 1
4
	
3
2 1 1
3
*/



import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		  arr[i] = s.nextInt();
		if(n==1){
		  System.out.print(arr[n-1]);
		  return;
		}
		int prev2 = arr[0];
	  int prev1 = Math.max(arr[0], arr[1]);
	  for(int i=2; i<n; i++){
	    int current = Math.max(prev1, prev2+arr[i]);
	    prev2 = prev1;
	    prev1 = current;
	  }
	  System.out.print(prev1);
	}
}
