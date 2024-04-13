import java.util.Scanner;
public class Divya{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths");
        int m=sc.nextInt();
         System.out.println("Enter the marks of Science");
        int s=sc.nextInt();
         System.out.println("Enter the marks of Social studies");
        int sst=sc.nextInt();
         System.out.println("Enter the marks of Hindi");
        int h=sc.nextInt();
         System.out.println("Enter the marks of English");
        int e=sc.nextInt();
        int percentage=(m+s+sst+h+e)/5;
        System.out.print("the Percentage of student is :");
        System.out.println(percentage);
    }
}
