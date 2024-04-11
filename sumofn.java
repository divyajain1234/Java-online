import java.util.*;
public class main{
    public static void main(String args[]){
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sum=sum+i;
            System.out.println(sum);
           
        }
    }
}
