import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length();
        String B = "";
        for (int i=len-1; i>=0; i--){
            B += A.charAt(i);
        }
        if(A.compareTo(B)==0)  System.out.println("Yes");
        else   System.out.println("No");
        
    }
}



