import java.util.*;

class Main_ques4 {
    public static void main(String[] args) {
        int n;
        
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the length of vectors");
        n = myInput.nextInt();
        
        int []a1 = new int[n];
        int []a2 = new int[n];
        int result=0;
        System.out.println("Enter the coordoinates of first vector");
        for(int i=0;i<n;i++)
        {
            a1[i] = myInput.nextInt();
        }
        System.out.println("Enter the coordoinates of second vector");
        for(int i=0;i<n;i++)
        {
            a2[i] = myInput.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            result += a1[i]*a2[i];
        }
         System.out.println("Dot product of both vectors: "+ result);
         myInput.close();
    }
}