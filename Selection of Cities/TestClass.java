package practice;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class TestClass {
	
	public static int factorial(int n){
		if(n==1 || n==0) return 1;
		else return n*factorial(n-1);
	}
	
	public static int combination(int n, int k){
		if(k>n) System.out.println("Invalid Input");
		return (int)factorial(n)/(factorial(k)*factorial(n-k));
	}
  public static void main(String args[] ) throws Exception {
      
	  Scanner scan = new Scanner(System.in);
      int k=scan.nextInt();
      int[] cases = new int[k];
      
      for(int i=0; i<k; i++)
    	  cases[i]=scan.nextInt();
      
      for(int i=0; i<cases.length; i++){
      int result=0;
    	 
      for(int j=1; j<=cases[i]; j++)
      result = result+combination(cases[i],j);
      System.out.println(result);
      }
      	
      }
      
      
      
  }

