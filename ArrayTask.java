public class ArrayTask {
    public static void main(String[] args) {
        int a[] = new int[50];

        for (int i=0; i<50; i++){
            a[i]=i+50;
        }
        for(int i=0;i<=50;i++){
            System.out.print(" " + a[i]);
        }
    }
}
