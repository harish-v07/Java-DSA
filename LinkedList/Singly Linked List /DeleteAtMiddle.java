/*Example:
Sample Input:
5
10 20 30 40 50
Sample Output:
10 20 40 50



Public Test Cases:
#	INPUT	EXPECTED OUTPUT

3
1 2 3
1 3

4
11 22 33 44
11 33 44 
	
1
99
List is empty

2
7 14
14
*/



import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        MyLinkedList l1 = new MyLinkedList();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            l1.create(num);
        }
        l1.deleteAtMiddle(n);
        l1.display();
    }
}
class Node {
    int data;
    Node next;
    Node(int val) {
        this.data = val;
        this.next = null;
    }
}
class MyLinkedList {
    Node head = null;
    Node tail = null;
    void create(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    void deleteAtMiddle(int n) {
        if(n==2){
          head = head.next; //Delete at beginning for 2 elements
        }
        else if(head==null)
          System.out.print("List is empty");
        else{
          if(head.next == null){
            System.out.print("List is empty");
            head = head.next; 
            return;
          }
          int mid = (n%2==0)?(n/2-1):(n/2);
          Node temp = head;
          for (int i = 0; i < mid - 1; i++) {
            temp = temp.next;
          }
          temp.next = temp.next.next;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
