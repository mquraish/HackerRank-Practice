import java.math.BigInteger;
import java.util.Scanner;
public class FastFactorial {
//Part of the solution is inspired from an example in StackOverFlow
		public static BigInteger factorial(long a){
			if(a<2){
				if(a>=0)
				return BigInteger.ONE; //if a is 0 or 1, result is 1
				else throw new IllegalArgumentException("Negative Input not allowed");
			}
			return MultiplyRange(2,a);
		}

//The multiply function divides multiplication into two halves to perform faster calculation		
		public static BigInteger MultiplyRange(long a, long b){
			if(b-a==0) return BigInteger.valueOf(a);
			if(b-a==1) return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
			if(b-a==2) return BigInteger.valueOf(a).multiply(BigInteger.valueOf(a+1)).multiply(BigInteger.valueOf(b));
			
			//if a and b are apart more than 2, we split the multiplication and make recursive call
			long mid = a+(b-a)/2;
			return MultiplyRange(a,mid).multiply(MultiplyRange(mid+1,b));
		}
		

		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			long a=scan.nextLong();
			scan.close();
			System.out.print(factorial(a));
			
			
		}
		
	}


