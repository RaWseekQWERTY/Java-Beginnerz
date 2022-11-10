import java.util.Scanner; //importing scanner function
public class Addition
{
    public static void main(String [] args)  //main method
{
    int x,y,sum; //variables declaration
    Scanner sc=new Scanner(System.in);//defining function
    System.out.println("Enter the value of x:");//asking user for the value of x
     x=sc.nextInt();
     System.out.println("Enter the value of y:");
     y=sc.nextInt();
    sum= sum(x,y);//return function
    System.out.println("The sum is:"+sum);//result
}
public static int sum(int a, int b)//finding the sum
{
    int sum=a+b;
    return sum;
}
}
