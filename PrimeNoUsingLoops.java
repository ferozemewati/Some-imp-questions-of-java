import java.util.Scanner;
public class PrimeNoUsingLoops {
    public static void main(String[] args) {

        int n,count=0;
        System.out.println("Enter any Number");
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();

        for(int i=1; i<=n;)
        {
            if(n%i==0) {
            }
               count++;
            }

        }
    }



