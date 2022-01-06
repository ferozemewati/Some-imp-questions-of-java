import java.util.Scanner;

public class NaturalNumberAndSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number");
        int i,n,sum=0; n=in.nextInt();
        System.out.println("The first n Natural number are : " + n);

        for(i=1;i<=n;i++){
            System.out.print(" " +i );
            sum+=i;
        }
        System.out.println("\n"+"The sum of natural number up to " +n+ " terms : "+sum);

    }
}
