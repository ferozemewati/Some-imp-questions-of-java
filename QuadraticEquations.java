import java.util.Scanner;
public class QuadraticEquations {
    public static void main(String[] args){
        int a,b,c,x,y;
        Scanner in=new Scanner(System.in);
        System.out.println("enmter a  = ");
         a=in.nextInt();
        System.out.println("enyter b");
         b=in.nextInt();
        System.out.println("enter c");
         c=in.nextInt();

        x= (int) (b+Math.sqrt((b*b-(4*a*c))))/(2*a);

        System.out.println(x);


    }
}
