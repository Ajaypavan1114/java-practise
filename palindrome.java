//Write a Java program to check whether a number is palindrome or not. 
class palindrome{  
      int num,rev=0,digit,temp;
        
        System.out.println("enter number");
        Scanner sc = new Scanner (System.in);
        num=sc.nextInt(); 
  temp=num;    
  while(num>0){    
   rev=num%10;  
   sum=(sum*10)+r;
   num=num/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}