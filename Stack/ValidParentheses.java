/*
Example:
Sample Input:

3
()[]
([{}])
([)]

Sample Output:

Balanced
Balanced
Not Balanced
*/


import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.nextLine();
    for (int j = 0; j < n; j++) {
      String str = s.nextLine();
      char arr[] = str.toCharArray();
      Stack<Character> st = new Stack<>();
      boolean isBalanced = true;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
          st.push(arr[i]);
        } else {
          if (!st.empty() &&
              ((st.peek() == '(' && arr[i] == ')') ||
               (st.peek() == '{' && arr[i] == '}') ||
               (st.peek() == '[' && arr[i] == ']'))) {
            st.pop();
          } else {
            isBalanced = false;
            break;
          }
        }
      }
      if (isBalanced && st.isEmpty()) {
        System.out.println("Balanced");
      } else {
        System.out.println("Not Balanced");
      }
    }
  }
}
