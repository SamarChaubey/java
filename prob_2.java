import java.util.*;
public class prob_2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the five numbers");
        int []a;
        a=new int[5];
        for(int i=0;i<=4;i++)
          a[i]=sc.nextInt();
        int grt = Integer.MIN_VALUE;
        for (int j : a) {
            if (j > grt) {
                grt = j;
            }
        }
        System.out.println("greatest number is:"+grt);
    }
}