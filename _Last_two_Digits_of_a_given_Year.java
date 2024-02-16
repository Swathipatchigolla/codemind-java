import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        int year=new Scanner(System.in).nextInt();
        int r=year%100;
        if(r<10){
            System.out.println("0"+r);
        }
        else{
            System.out.println(r);
        }
    }
}