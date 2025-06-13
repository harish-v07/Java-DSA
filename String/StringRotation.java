/*
Example:
Sample Input:
ABCD
CDAB

Sample Output:
Yes
*/



import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    String str1 = s.next();
    String str2 = s.next();
    String res = str1+str1;
    if(res.contains(str2))
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}
