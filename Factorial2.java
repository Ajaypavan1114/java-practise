import java.util.*;
class Factorial2
{
    public static void main(String args[])
    {
        int n,i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter factorial Value");
        n=sc.nextInt();
        
        for(;n>=1;n--)
        {
            
            fact=fact*n;
            
        }    
            System.out.println("Enter factorial  Value "+fact);
            
        
        
    }
}
            
        
    
    
