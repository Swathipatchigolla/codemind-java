import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.equals(s2))
        System.out.println("Strings are Equal");
        else System.out.println("Strings are not Equal");
    }
}