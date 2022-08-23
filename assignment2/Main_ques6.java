

import java.util.Scanner;
public class Main_ques6
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    float a,r,n;
	    
        System.out.print("a = ");
	    a=sc.nextFloat();
        System.out.print("r = ");
	    r=sc.nextFloat();
        System.out.print("n = ");
	    n=sc.nextFloat();
	    
	    float rn=1;
	    
        System.out.println("\nGeometric Progression upto n terms :- ");
        for(int i=1;i<=n;i++)
        {
            float t=a*rn;
            System.out.print(t + " ");
            rn*=r;
        }
        sc.close();
	}
}