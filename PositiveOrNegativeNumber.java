import java.util.Scanner;
public class PositiveOrNegativeNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Input Number");

        int input=in.nextInt();

        if(input > 0) {
            System.out.println("Number is positive");
        }
        else if(input<0) {
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");


        }


    }


}




