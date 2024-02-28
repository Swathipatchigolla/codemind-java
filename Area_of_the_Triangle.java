import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextInt();
        float s=(a+b+c)/2;
        System.out.printf("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}