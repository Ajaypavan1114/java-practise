import java.util.*;
public class minele{
    public static void main (String args[]){
        int i,n,min=o;
        System.out.println("enter size of an array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int a[];
         System.out.println("enter elements of an array");
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         for(i=0;i<n;i++)
         {
             if(min<a[i]){
                 min=a[i];
             }
              System.out.println("tha min element is " +min);
         }
    }
}