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
    traverseInOrder(root);
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
  static void traverseInOrder(Node node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(node.data + " ");
        traverseInOrder(node.right);
    }
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
