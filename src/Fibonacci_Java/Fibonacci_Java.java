package Fibonacci_Java;
import java.util.Scanner;
public class Fibonacci_Java {

	public static void main(String[] args) {
		 
        System.out.print("Entra el numero per la serie de fibonnaci: ");
        int number = new Scanner(System.in).nextInt();
 
        System.out.println("\n\nSerie de fibonacci fins a: " + number);
        
        for(int i=1; i<=number; i++){
            System.out.print(fibonacciRecusion(i) +" ");
        }
	}
	 public static int fibonacciRecusion(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	 
	        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); 
	    }
	 public static int fibonacciLoop(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	        int fibo1=1, fibo2=1, fibonacci=1;
	        for(int i= 3; i<= number; i++){
	            fibonacci = fibo1 + fibo2; 
	            fibo1 = fibo2;
	            fibo2 = fibonacci;
	 
	        }
	        return fibonacci; 
	    }     
}
