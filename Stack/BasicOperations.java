import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int size = s.nextInt();
    s.nextLine();
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < n; i++) {
      String str = s.nextLine().trim();
      String[] arr = str.split(" ");
      switch (arr[0]) {
          case "push":
              if (st.size() == size) {
                  System.out.println("Stack Overflow");
              } else {
                  int val = Integer.parseInt(arr[1]);
                  st.push(val);
                  System.out.println("Pushed: " + val);
              }
              break;
          case "pop":
              if (st.isEmpty()) {
                  System.out.println("Stack Underflow");
              } else {
                  int popped = st.pop();
                  System.out.println("Popped: " + popped);
              }
              break;
          case "peek":
              if (st.isEmpty()) {
                  System.out.println("Stack is empty");
              } else {
                  System.out.println("Top element: " + st.peek());
              }
              break;
          case "display":
              if (st.isEmpty()) {
                  System.out.println("Stack is empty");
              } else {
                  System.out.print("Stack contents: ");
                  for (int j = st.size() - 1; j >= 0; j--) {
                      System.out.print(st.get(j) + " ");
                  }
                  System.out.println();
              }
              break;
            }
        }
    }
}
