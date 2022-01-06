import java.sql.SQLOutput;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        /*  int i, fact=1;
            int number=5;

            //initialization
            // declaration
            // increase/decrease

            for (i=1; i<=number; i++){
            fact = fact * i;
        }
        System.out.println(fact);

        }
  }


        // While loop

        int i=5;
        while (i<=5*10) {

            System.out.println(i);
            i=i+5;
        }

    }
 } */


        // Do While loop

        int fact=1;
        int i=1;

        Scanner sc =new Scanner(System.in) ;
        System.out.println("Enter a number whose factorial is to be found:");
        int number=sc.nextInt();

        do {
            fact = fact * i;
            i++;

        }while(i<=number);

        System.out.println("\nFactorial Of " + number + " is : " +fact);

        }
    }

