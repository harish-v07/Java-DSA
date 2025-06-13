/*
Example:
Sample Input:
5
10 20 30 40 50
30

Sample Output:
Found
*/

import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    LinkedList l1 = new LinkedList();
    int n = s.nextInt();
    for(int i=0; i<n; i++){
      int num = s.nextInt();
      l1.create(num);
    }
    int target = s.nextInt();
    l1.find(target);
  }
}
class Node{
  int data;
  Node next;
  Node(int val){
    this.data = val;
    this.next = null;
  }
}
class LinkedList{
    Node head = null, current = null;
    void create(int n){
      Node newnode = new Node(n);
      if(head == null){
        head = newnode;
        current = newnode;
      }
      else{
        current.next = newnode;
        current = newnode;
      }
    }
    void find(int target){
      Node temp = head;
      while(temp!=null){
        if(temp.data == target){
          System.out.print("Found");
          return;
        }
        temp = temp.next;
      }
      System.out.print("Not Found");
    }
}
