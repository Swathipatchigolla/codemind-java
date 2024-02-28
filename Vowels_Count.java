import java.util.Scanner;
public class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s=sc.nextLine();
        String ans="aeiouAEIOU";
        for(int i=0;i<s.length();i++){
            if(ans.contains(s.charAt(i)+"")){
                c++;
            }
        }
        System.out.println(c);
    }
}