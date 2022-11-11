import java.util.Scanner; //importing scanner function
public class Hello
{
    public static void main(String [] args) //main method
    {
        Scanner sc=new Scanner(System.in); // defining scanner function
        System.out.println("What's your name?"); //asking user input 
        String name=sc.next();//providing input
        System.out.println("Hello,"+name);//result
    
    }
}
