import java.util.*;
import java.lang.Math;
public class Main_ques1
{
	public static void main(String[] args) {
		int x1,x2,y1,y2,x3,x4,y3,y4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Co ordinates of First Line");
		System.out.print("x1 : ");
		x1=sc.nextInt();
		System.out.print("x2 : ");
		x2=sc.nextInt();
		System.out.print("y1 : ");
		y1=sc.nextInt();
		System.out.print("y2 : ");
		y2=sc.nextInt();
		System.out.println("Enter the Co ordinates of Second Line");
		System.out.print("x3 : ");
		x3=sc.nextInt();
		System.out.print("x4 : ");
		x4=sc.nextInt();
		System.out.print("y3 : ");
		y3=sc.nextInt();
		System.out.print("y4 : ");
		y4=sc.nextInt();
		int s1=Math.abs((y2-y1)/(x2-x1));
		int s2=Math.abs((y4-y3)/(x4-x3));
		if(s1==s2)
		{
		    System.out.println("Lines Are not Intersecting !!");
		}
		else
		{
		    System.out.println("Lines Are Intersecting !!");
		}
		sc.close();
	}
}
