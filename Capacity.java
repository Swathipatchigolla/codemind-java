import java.util.*;
public class Class{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("%d KB",(2*t*s*b*512)/1024);
    }
}