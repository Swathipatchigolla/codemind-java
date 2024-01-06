import java.util.*;
public class Class{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int p=0,s=0;
        while(a>0){
            int r=a%10;
            s+=Math.pow(8,p)*r;
            p++;
            a/=10;
        }
        System.out.print(s);
    }
}