import java.util.*;
class Class2{
    int max(int a,int b){
        return a>b?a:b;
    }
}
class Class3{
    int findLcm(int a,int b){
        int i=2;
        Class2 obj=new Class2();
        int max=obj.max(a,b);
        int lcm=max;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                return lcm;
            }
            else lcm=max*i;
            i++;
        }
    }
}
public class Class{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    Class3 obj2=new Class3();
    int lcm=obj2.findLcm(x,y);
    int p=lcm/x;
    int q=lcm/y;
    System.out.print(lcm/(p+q));
    }
}