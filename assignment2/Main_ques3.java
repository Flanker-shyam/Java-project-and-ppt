
import java.util.*;
class Main_ques3 {
    
    public static int gcd_num_rec(int a,int b)
    {
        if(b==0) return a;
        return gcd_num_rec(b,a%b);
    }
    
    public static int gcd_num_nonRec(int a, int b)
    {
        int i,gcd=1;
        for(i=1;i<=a && i<=b ; i++)
        {
            if((a%i==0) && (b%i)==0)
            {
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
      int a, b;
      
      Scanner myInput = new Scanner(System.in);
      System.out.println("Enter two numbers");
      a = myInput.nextInt();
      b = myInput.nextInt();
      
      int gcd_rec = gcd_num_rec(a,b);
       System.out.println("Gcd using recursion= " + gcd_rec);
       
       int gcd_nonRec = gcd_num_nonRec(a,b);
       System.out.println("Gcd using non-recursion method= " + gcd_nonRec);
       myInput.close();
    }
}
