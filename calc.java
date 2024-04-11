import java.util.*;
public class main{
    public static void main(String args[]){
        System.out.println("Choose case");
        Scanner sc = new Scanner(System.in);
        int Calc = sc.nextInt();
        int a = sc.nextInt();
        int b= sc.nextInt();
        switch (Calc){
        case 1 :
            {
            int c=a+b;
             System.out.println(c);
             break;
            }
            case 2:
                {
            int c=a-b;
                System.out.println(c);
                break;
                }
           case 3:
               {
                  int c=a*b;
                   System.out.println(c);
                   break;
               }
               case 4:
                   {
                     int  c=a/b;
                       System.out.println(c);
                       break;
                   }
                  default:
                  System.out.println("Invalid");
    }
}
}
