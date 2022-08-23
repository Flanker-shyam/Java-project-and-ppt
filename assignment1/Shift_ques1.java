import java.util.Scanner;

class Shift_ques1
{
    public static void main(String args[])
    {
        Scanner myInput = new Scanner(System.in);
        int n = myInput.nextInt();

        int leftShifted = n<<12;
        int rightShifted = n>>10;

        System.out.println("4096n value of inputed integer is: "+ leftShifted);
        System.out.println("(1/1024)n value of inputed integer is: "+ rightShifted);
    }
}