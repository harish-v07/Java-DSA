/*
Example:
Sample Input:

6
PUSH_REAR 10
PUSH_FRONT 20
FRONT
REAR
POP_FRONT
POP_REAR

Sample Output:

20
10
20
10
*/


import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.nextLine();
    Deque<Integer> q1 = new ArrayDeque<>();
    for(int i=0; i<n; i++){
      String str = s.nextLine();
      String arr[] = str.split(" ");
      if(arr[0].equals("PUSH_FRONT")){
        q1.offerFirst(Integer.parseInt(arr[1]));
      }
      if(arr[0].equals("PUSH_REAR")){
        q1.offerLast(Integer.parseInt(arr[1]));
      }
      else if(arr[0].equals("POP_FRONT")){
        if(q1.isEmpty())
          System.out.println("Deque is Empty");
        else
          System.out.println(q1.pollFirst());
      }
      else if(arr[0].equals("POP_REAR")){
        if(q1.isEmpty())
          System.out.println("Deque is Empty");
        else
          System.out.println(q1.pollLast());
      }
      else if(arr[0].equals("FRONT")){
        if(q1.isEmpty())
          System.out.println("Deque is Empty");
        else{
          System.out.println(q1.peekFirst());
        }
      }
      else if(arr[0].equals("REAR")){
        if(q1.isEmpty())
          System.out.println("Deque is Empty");
        else{
          System.out.println(q1.peekLast());
        }
      }
    }
  }
}
