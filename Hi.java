import java.util.Scanner; //importing scanner to take inout
public class Hi
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); //defining scanner function
        System.out.println("What's your name?");// asking user their name
    
        String name=sc.next();//Taking input
    
        System.out.println("Hi,"+name);//result
        
    }
}