import java.util.*;
public class prob_1 {
    public void fn(int a ,int b){
        for(int i=1;i<=b;i++)
            System.out.println(i*a);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x and y ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        prob_1 ob1=new prob_1();
        if(x<=10000&&y<=10000)
            ob1.fn(x,y);
    }

}