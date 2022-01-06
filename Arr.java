import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
//        int a[]=new int[11];
//        int i;
//        for(i=1; i<11; i++) {
//            a[i] = i*2;
//            // i=i+1;
//        }
//
//            for (i=1; i<11; i++){
//
//            System.out.print(" " + a[i]);
//        }




         // Any table print using by array

        int n,i;
        System.out.println("Please enter the value");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();

        int a[]=new int[11];
       // int n;

        for (i=1; i<11; i++){
            a[i] = i*n;
        }

        for (i=1; i<11; i++){
            System.out.print(" " +a[i]);

        }


    }
}
