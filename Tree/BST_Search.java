/*
Example:
Sample Input:
6
50 30 70 20 40 60
3
60
25
30

Sample Output
Found
Not Found
Found

Explanation:
BST built from insertions:

        50
       /  \
     30    70
    / \    /
  20  40  60

Search 60 → Found

Search 25 → Not Found

Search 30 → Found
*/


import java.util.*;
public class Main{
  static Node root = null;
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i=0; i<n; i++){
      int val = s.nextInt();
      insert(val);
    }
    int m = s.nextInt();
    for(int i=0; i<m; i++){
      int val = s.nextInt();
      if(search(root, val))
        System.out.println("Found");
      else
        System.out.println("Not Found");
    }
  }
  static void insert(int data){
    Node temp = root;
    Node newNode = new Node(data);
    if(root == null){
      root =newNode;
    }
    else{
      while(true){
        if(temp.data > data){
          if(temp.left != null){
            temp = temp.left;
          }
          else{
            temp.left = newNode;
            break;
          }
        }
        else{
          if(temp.right != null){
            temp = temp.right;
          }
          else{
            temp.right = newNode;
            break;
          }
        }
      }
    }
  }
  static boolean search(Node root, int num){
    if(root == null)
      return false;
    if(root.data == num)
      return true;
    else if(root.data > num)
      return search(root.left, num);
    else
      return search(root.right, num);
  }
}
public class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.left = null;
    this.data = data;
    this.right = null;
  }
}
