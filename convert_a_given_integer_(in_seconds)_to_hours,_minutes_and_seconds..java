import java.util.*;
public class Class{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int m=s/60;
        s%=60;
        int h=m/60;
        m%=60;
        System.out.printf("H:M:S-%d:%d:%d",h,m,s);
    }
}