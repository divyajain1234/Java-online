import java.util.*;
public class main{
    public static void main(String args[]){
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("the no. is even");
        }
        else{
            System.out.println("the no. is odd");
        }
    }
}
