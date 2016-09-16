import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max=0;
        for(int i=0; i<word.length(); i++)
        {
        
        int m=word.charAt(i)-'a';
        if(h[m]>max) max=h[m];
        
        }
        int area=word.length()*max;
        System.out.print(area);
    }
}
