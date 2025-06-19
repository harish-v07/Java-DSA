/*
Input
6
ENQUEUE 1
ENQUEUE 2
ENQUEUE 3
DEQUEUE
DEQUEUE
DISPLAY

Output
1
2
3
*/



import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.nextLine();
    Queue<Integer> q1 = new LinkedList<>();
    for(int i=0; i<n; i++){
      String str = s.nextLine();
      String arr[] = str.split(" ");
      if(arr[0].equals("ENQUEUE")){
        q1.add(Integer.parseInt(arr[1]));
      }
      else if(arr[0].equals("DEQUEUE")){
        if(q1.isEmpty())
          System.out.println("Queue is empty");
        else
          System.out.println(q1.poll());
      }
      else if(arr[0].equals("DISPLAY")){
        if(q1.isEmpty())
          System.out.println("Queue is empty");
        else{
          Iterator iterator = q1.iterator();
          while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
          }
        }
      }
      // else if(arr[0].equals("FRONT")){
      //   if(q1.isEmpty())
      //     System.out.println("Queue is Empty");
      //   else{
      //     System.out.println(q1.peek());
      //   }
      // }
    }
  }
}
