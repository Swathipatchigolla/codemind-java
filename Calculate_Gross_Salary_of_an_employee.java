import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        double pf,gs,sal,hra,da;
        Scanner sc=new Scanner(System.in);
        sal=sc.nextFloat();
        hra=sc.nextFloat();
        da=sc.nextFloat();
        pf=0.12*sal;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",sal+pf+hra+da);
    }
}