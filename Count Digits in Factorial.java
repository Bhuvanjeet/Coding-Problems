//GFG - to count number of digits in factorial of a number N.
import java.util.*;
class Main {
    public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                int N=sc.nextInt();
                double d=0;
                if(N<0)
                {
                    System.out.println(0);
                    System.exit(0);
                }
                if(N<=1)
                {
                    System.out.println(1);
                    System.exit(0);
                }
                for(int i=2;i<=N;i++)
                {
                    d=d+Math.log10(i);
                }
                int e = (int)(Math.floor(d+1));
                System.out.println(e);
        }
}
    
