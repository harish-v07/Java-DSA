/*Two strings are called anagrams if they contain the same characters in any order, ignoring case and character positions. For example, "Listen" and "Silent" are anagrams. Your task is to write a program that checks if two input strings are anagrams of each other in a case-insensitive manner. Spaces, digits, and special characters should not be considered — only alphabetic characters are compared. This problem tests your understanding of character frequency counting, ASCII manipulation, and string processing in C. You should preprocess the strings to filter out only alphabetic characters, convert them to the same case, and then compare the character counts to determine if they are anagrams.

Input Format:
Two lines: each line contains one string.

Output Format:
Print "Anagram" if the strings are anagrams.
Otherwise, print "Not Anagram".


Constraints:
1 ≤ Length of each string ≤ 1000
Strings may include letters, digits, spaces, or symbols
Only letters are considered for anagram check


Example:
Sample Input:
Listen
Silent

Sample Output:
Anagram
*/



import java.util.*;

public class Main {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    String str = s.nextLine().toLowerCase().replaceAll("[^a-z]", "");
    String str1 = s.nextLine().toLowerCase().replaceAll("[^a-z]", "");
    char[] arr1 = str.toCharArray();
    char[] arr2 = str1.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if (Arrays.equals(arr1, arr2)) {
      System.out.print("Anagram");
    } else {
      System.out.print("Not Anagram");
    }
  }
}
