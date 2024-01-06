import java.util.*;
public class Class{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=Math.abs(a-b)/(a*1.0);
        System.out.printf("%.2f",c*100);
    }
}