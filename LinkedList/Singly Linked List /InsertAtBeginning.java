/*Example:
Sample Input:
4
10 20 30 40
5

Sample Output:
5 10 20 30 40
*/




import java.util.*;
public class Main{
    class Node{
        int data;
        Node next;
    }
    public Node head = null;
    public void append(int data){
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        if(head==null)
            head = newnode;
        else{
            Node temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = newnode;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertAtBeginning(int val){
        // Write your logic
        Node newnode = new Node();
        newnode.data=val;
        newnode.next=head;
        head=newnode;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main obj = new Main();
        int n = sc.nextInt();
        int val;
        for(int i=0;i<n;i++){
            val = sc.nextInt();
            obj.append(val);
        }
        int new_val = sc.nextInt();
        obj.insertAtBeginning(new_val);
        obj.display();
    }
}
