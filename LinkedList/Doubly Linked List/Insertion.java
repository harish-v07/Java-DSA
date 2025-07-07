/*
Implement a program to perform insertion operations in a doubly linked list. The supported insertion operations are:

Insert at the beginning
Insert at the end
Insert at a given position (1-based index)
Input Format:

First line: An integer n representing the number of operations.
Next n lines: Each line contains:
Operation type: 1 (beginning), 2 (end), or 3 (specific position)
Value to insert
(If operation is type 3) Position at which to insert
Output Format:

After each operation, print the list from head to tail in a single line with space-separated values.

Example:
Sample Input:
4
1 10
2 20
3 15 2
1 5
Sample Output:
10
10 20
10 15 20
5 10 15 20
*/




import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    DoublyLinkedList l1 = new DoublyLinkedList();
    for(int i=0; i<n; i++){
      int op = s.nextInt();
      if(op == 1){
        int val = s.nextInt();
        l1.insertAtBeginning(val);
        l1.display();
        System.out.println();
      }
      else if(op == 2){
        int val = s.nextInt();
        l1.insertAtEnd(val);
        l1.display();
        System.out.println();
      }
      else{
        int val = s.nextInt();
        int pos = s.nextInt();
        l1.insertAtPosition(val, pos);
        l1.display();
        System.out.println();
      }
    }
  }
}
class Node{
  int data;
  Node next, prev;
  Node(int val){
    this.data = val;
    this.next = null;
    this.prev = null;
  }
}
class DoublyLinkedList{
  Node head = null;
  Node tail = null;
  void insertAtBeginning(int data){
    Node temp = new Node(data);
    if (head == null) {
        head = temp;
        tail = temp;
    }
    else {
        temp.next = head;
        head.prev = temp;
        head = temp;
    }
  }
  void insertAtEnd(int val){
    Node newNode = new Node(val);
    if (head == null) {
        head = newNode;
        tail = newNode;
    } 
    else{
        tail.next = newNode;
        newNode.prev = tail; 
        tail = newNode;
    }
  }
  void insertAtPosition(int data, int position){
    Node temp = new Node(data);
    if(position == 1){
      insertAtBeginning(data);
    }
    else{
      Node current = head;
      int currPosition = 1;
      while(current != null && currPosition < position){
        current = current.next;
        currPosition++;
      }
      if(current == null){
        insertAtEnd(data);
      }
      else{
        temp.next = current;
        temp.prev = current.prev;
        current.prev.next = temp;
        current.prev = temp;
      }
    }
  }
  void display(){
    Node current = head;
    while(current!=null){
      if(current.next!= null)
        System.out.print(current.data+" ");
      else
        System.out.print(current.data);
      current = current.next;
    }
  }
}
