import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input The 1st Number");
        int number1=in.nextInt();
        System.out.println("Input The 2nd Number");
        int number2=in.nextInt();
        System.out.println("Input The 3rd Number");
        int number3=in.nextInt();

        if(number1>number2)
            if(number1>number3)
                System.out.println("The Greatest Number is :" + number1);

        if(number2>number1)
            if(number2>number3)
                System.out.println("The Greatest Number is :" + number2);

        if(number3>number1)
            if(number3>number2)
                System.out.println("The Greatest Number is :" + number3);

    }
}
