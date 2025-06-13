/*You are tasked with developing a simple program that manages a list of tasks for a project. The program will use a singly linked list to represent the tasks. Each task will have a description (e.g., "Write documentation", "Test the module"), and the program should be able to:

Add a new task at the end of the list.
Display all tasks in the list.
Write a program to create a singly linked list and display its elements.

Input Format:
First input consists of n number of elements to be stored inside linked list
Next n line of elements are the values, present in the list

Output Format:
Print the singly linked list in the given output format

Example:
Sample Input:
5
10
20
30
40
50
Sample Output:
10 20 30 40 50
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
    void display(){
      Node current = head;
      while(current!=null){
        System.out.print(current.data+" ");
        current = current.next;
      }
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
    l1.display();
  }
}

