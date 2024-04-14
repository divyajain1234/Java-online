import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        float v = sc.nextFloat();
        float u=sc.nextFloat();
        float a= sc.nextFloat();
        float s = sc.nextFloat();
       float k = ((v*v)-(u*u)/2f*a*s);
       
        System.out.println(k );
        
    }
}
