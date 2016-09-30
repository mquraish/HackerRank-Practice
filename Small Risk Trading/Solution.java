package solution;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution<E> {
private final List<E> set;
    private final int max;
    private int index;
    public Solution(List<E> originalList) {
        set = originalList;
        max = (1 << set.size());
        index = 0;
    }
    public boolean hasNext() {
        return index < max;
    }
    public List<E> next() {
        List<E> newSet = new ArrayList<E>();
        int flag = 1;      
        for (E element : set) {
            if ((index & flag) != 0) {
                newSet.add(element);
            }
            flag <<= 1;
        }
        ++index;
        return newSet;
    }
    public static double makeMoney(double p, double x, double y){
        double profit = p*(x+y)-y;
        DecimalFormat df = new DecimalFormat("#.##");      
        profit = Double.valueOf(df.format(profit));

       // System.out.println(profit);
        return profit;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        double[] p = new double[n];
        double[] x = new double[n];
        double[] y = new double[n];
        
        double money=0.0;
        
        for(int i=0; i<n; i++)
           p[i]=scan.nextDouble();
        
        for(int i=0; i<n; i++)
           x[i]=scan.nextDouble();
        
        for(int i=0; i<n; i++)
           y[i]=scan.nextDouble();
        
      List<Integer> set = new ArrayList<Integer>();
     
        int i=0;
        while(i<n){
        	set.add(i++);
        }
       
        Solution<Integer> it = new Solution<Integer>(set);
        while(it.hasNext()){
        	List<Integer> index = new ArrayList<Integer>();
        	double temp=0.0;
        	index=it.next();
        	if(index.size()<=k){
            for(int j=0; j<index.size(); j++){
        		temp=temp+makeMoney(p[index.get(j)], x[index.get(j)], y[index.get(j)]);
        	}
            }
        	if (temp>money)
        		money=temp;
           }
        
        System.out.printf("%.2f",money);
        }
    }

