import java.util.Scanner;
class leapyear{
    public static void main (String args[]){
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year");
        year=sc.nextInt();
        if(year%400==0 && year%100==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not a Leap year");
        }
    }
}