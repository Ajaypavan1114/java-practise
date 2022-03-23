/**
 * Java Program - Factorial
 * Factorial of n is n! = 1.2.3....(n-1).n
 * n should be >= 0
 */
 
public class Nfactorial {
 
    public static void main(String[] args) {
        int n = 5;
         
        int factorial = 1;
         
        
        int i=1;
        while(i<=n) {
            factorial *= i; //factorial = factorial * i
            i++;
        }
         
        System.out.print(n+"! = "+factorial);
    }
}
