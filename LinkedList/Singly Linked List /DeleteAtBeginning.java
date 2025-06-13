/*Example:
Sample Input:
4
10 20 30 40

Sample Output:
20 30 40
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
    l1.deleteAtBeginning();
    l1.display();
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
    void deleteAtBeginning(){
      if(head==null){
        System.out.print("List is empty");
      }
      else{
        if(head.next==null){
          System.out.print("List is empty");
        }
        head = head.next;
      }
    }
    void display(){
      Node current = head;
      while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
      }
    }
}
