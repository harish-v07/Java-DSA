/*
Input
6
1 2 2 1 3 1

Output
1: 3
2: 2
3: 1
*/


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        TreeMap<Integer, Integer> h1 = new TreeMap<>();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
          a[i] = s.nextInt();
        for(int i=0; i<n; i++){
          h1.put(a[i], h1.getOrDefault(a[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : h1.entrySet()) {
          System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
