import java.util.Scanner;

class ModeOps_ques2{
    
    public static void main(String args[])
    {
        Scanner myInput = new Scanner(System.in);
        int n = myInput.nextInt();

        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int value = (i*j)%n;
                System.out.print(" "+value);
            }
            System.out.println();
        }
    }

}