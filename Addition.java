import java.util.Scanner;
public class Addition
{
    public static void main(String [] args)
{
    int x,y,sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of x:");
     x=sc.nextInt();
     System.out.println("Enter the value of y:");
     y=sc.nextInt();
    sum= sum(x,y);
    System.out.println("The sum is:"+sum);
}
public static int sum(int x, int y)
{
     int sum=x+y;
    return sum;
}
}
