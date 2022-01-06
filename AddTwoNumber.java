import java.util.Scanner;

public class AddTwoNumber {
    public static float addtwonumber(float a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float first=sc.nextFloat();
        int second=sc.nextInt();
//        AddTwoNumber obj=new AddTwoNumber();
        System.out.println(addtwonumber(first,second));
    }
}
