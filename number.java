import java.util.*;
public class number
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        double num=sc.nextDouble();
        if(num<0)
        System.out.println("Negative");
        if(num==0)
        System.out.println("Neutral");
        if(num>0)
        System.out.println("Positive");
    }
}