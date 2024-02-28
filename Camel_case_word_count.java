import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=1;
        char[] ca=s.toCharArray();
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)>=65&&s.charAt(i)<=90){
                c++;
            }
        }
        if(c==0&&(s.length()!=0)){
            c++;
        }
        System.out.println(c);
    }
}