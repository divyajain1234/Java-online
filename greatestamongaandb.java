import java.util.*;
public class main{
    public static void main(String args[]){
        System.out.println("Enter thevalue of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("a nd b are equal");
        }
        else if(a>b)
        {
            System.out.println("a is greater");
        }
        else
        {
            System.out.println("b is greater");
        }
    }
}
