import java.util.*;
public class Class{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=Math.pow(a*a+b*b,0.5);
        System.out.printf("%.2f",c);
    }
}