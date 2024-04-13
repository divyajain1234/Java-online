import java.util.Scanner;
public class Divya{
    public static void main(String[] args){
        System.out.println("Enter the value to convert kilometer into miles");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float convert=n*0.621371f;
        System.out.println(convert +" miles");
    }}
