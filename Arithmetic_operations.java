import java.util.*;
public class Solution{
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Sum:"+(a+b));
        System.out.println("Difference:"+(a-b));
        System.out.println("Product:"+(a*b));
        System.out.println("Quotient:"+(a/b));
        System.out.println("Remainder:"+(a%b));
    }
}