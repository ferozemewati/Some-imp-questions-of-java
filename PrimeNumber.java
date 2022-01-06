public class PrimeNumber{
    public static void main(String[] args) {
            int n=13;
            boolean flage=false;
            if (n == 0 || n == 1){
                System.out.println("not prime no");
            } else {
                int half = n/ 2;
                for (int i=2 ;i <= half; i++){
                    if (n % i == 0) {
                        flage = true;
                        break;
                    }

                }
            }
            if (flage==true)
                System.out.println("not prime no.");
            else
                System.out.println("its prime no.");
        }

    }



