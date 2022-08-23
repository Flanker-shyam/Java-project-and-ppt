import java.util.Scanner;

class Conversion_ques3{

    public static void main(String args[])
    {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter feets: ");
        double feet = myInput.nextDouble();

        System.out.println("Enter minutes: ");
        int minute = myInput.nextInt();

        System.out.println("Enter Horse power: ");
        double horse_power = myInput.nextDouble();

        double meters = (0.3048 * feet);

        int years = (minute)/(365*24*60);
        int rem = (minute)%(365*24*60);
        int days = rem/(24*60);

        double joules = horse_power*745.69;

        System.out.println("Feet to meters = "+meters);
        System.out.print("Year = "+ years);
        System.out.println(" Days= " +days);
        System.out.println("Joules = " + joules);
    }
}