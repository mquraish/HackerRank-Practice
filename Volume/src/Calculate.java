import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;
class Calculate{
	  temp output = new temp();
	  Scanner scan = new Scanner(System.in);
	class temp{

		public void display(double volume){
	        System.out.printf("%.3f", volume);
	        System.out.println();
	   }
		
	}

		public int get_int_val(){
	        int n = scan.nextInt();
	        return n;
	    }
	    
	    public double get_double_val(){
	        double n = scan.nextDouble();
	        return n;
	    }
	    
	    public static Calculate do_calc(){
	        Calculate calculate = new Calculate();
	        return calculate;
	    }
	    
	     public double get_volume(int a) throws IOException{
	           if(a<=0) 
	           {
	               throw new NumberFormatException("All the values must be positive");
	           }
	           double vol=0.0;
	           vol = a*a*a;
	            return vol;
	        }
	        
	        public double get_volume(int l, int b, int h) throws IOException{
	            
	            if(l<=0||b<=0||h<=0) 
	           {
	             throw new NumberFormatException("All the values must be positive");
	           }
	          double vol=0.0;
	          vol = l*b*h;
	            return vol;
	        }
	        
	        public double get_volume(double r, double h) throws IOException{
	            if(r<=0 || h<=0) 
	           {
	                throw new NumberFormatException("All the values must be positive");
	           }
	          double vol=0.0;
	          vol=(4/3)*Math.PI*r*r*h;
	          return vol;
	        }
	    
	     public double get_volume(double r) throws IOException{
	            if(r<=0) 
	           {
	              throw new NumberFormatException("All the values must be positive");
	           }
	          double vol=0.0;
	          vol=0.666666666667*Math.PI*r*r*r;
	          return vol;
	        }   
	    }
