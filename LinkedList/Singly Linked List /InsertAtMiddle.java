/*Example:
Sample Input:
4
1 2 3 4
99
Sample output:
1 2 99 3 4
*/



import java.util.*;
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
    void insertAtMiddle(int val, int n){
      Node newnode = new Node(val);
      if(head == null){
        head = newnode;
        current = newnode;
      }
      int mid = n/2;
      Node current = head;
      int i=0;
      while(i<mid-1){
        i++;
        current = current.next;
      }
      newnode.next = current.next;
      current.next = newnode;
    }
    void display(){
      Node current = head;
      while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
      }
    }
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    LinkedList l1 = new LinkedList();
    int n = s.nextInt();
    for(int i=0; i<n; i++){
      int num = s.nextInt();
      l1.create(num);
    }
    int n1 = s.nextInt();
    l1.insertAtMiddle(n1,n);
    l1.display();
  }
}
}
