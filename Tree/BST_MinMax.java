/*
Example:
Sample Input
6
50 30 70 20 40 60

Sample Output
20 70


Explanation:
BST formed:

        50
       /  \
     30    70
    / \    /
  20  40  60

Minimum value: Leftmost node = 20

Maximum value: Rightmost node = 70
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
    Min(root);
    Max(root);
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
  static void Min(Node root){
    int min = root.data;
    while(root.left!=null){
      min = root.left.data;
      root = root.left;
    }
    System.out.print(min+" ");
  }
  static void Max(Node root){
    int max = root.data;
    while(root.right!=null){
      max = root.right.data;
      root = root.right;
    }
    System.out.print(max);
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
