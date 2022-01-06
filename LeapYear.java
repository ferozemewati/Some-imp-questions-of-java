import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=in.nextInt();
//        boolean x = (year % 4)==0;
//        boolean y = (year % 100)==0;
//        boolean z = (year % 100==0) && (year % 400 == 0);

        // if (x && (y ||z)){

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){

            System.out.println(year +" This is a leap year");
        }
        else {
            System.out.println(year + " This is not a leap year");
        }
    }
}
