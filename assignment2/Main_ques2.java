import java.util.*;
import java.lang.Math;
public class Main_ques2
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int r, c1,c2,a1,a2;
		System.out.println("Enter the Radius of circle");
		r=sc.nextInt();
		System.out.println("Enter the Co ordinates of the circle : ");
		System.out.print("C1 : ");
		c1=sc.nextInt();
		System.out.print("C2 : ");
		c2=sc.nextInt();
		System.out.println("Enter the Arbitary Point : ");
		System.out.print("A1 : ");
		a1=sc.nextInt();
		System.out.print("A2 : ");
		a2=sc.nextInt();
		double dis=Math.sqrt((c1-a1)*(c1-a1)+(c2-a2)*(c2-a2));
		if(dis < r )
		{
		    System.out.println("Point is Inside the circle !!! ");
		}
		else if( dis > r )
		{
		    System.out.println("Point is Outside the circle !!! ");
		}
		else{
		    System.out.println("Point is on the  the circle !!! ");
		}
        sc.close();
	}
}