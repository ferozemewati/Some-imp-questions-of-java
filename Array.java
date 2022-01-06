public class Array {
    public static void main(String[] args) {
        char alphabet[]=new char[26];

//        for(int i='a'; i<'z'; i++){
//            a[i]=i+ 26;

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet [c] = (char) (c + 26);
        }

       // for(int i='a'; i<'z'; i++){


        for (char c = 'a'; c <= 'z'; c++) {

            System.out.print(" " + alphabet[c]);
        }

    }
}
