package basics;

import java.io.*;

public class InputUsingBufferedReader {
    /*
    bufferedReader is better than Scanner in terms of input size, it can take large inputs
    reads input faster than Scanner
    when using multiple threads synchronisation is provided by bufferedReader
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String s = br.readLine();
        System.out.println("s = " + s);

        System.out.print("Enter an integer: ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("i = " + i);

    }
}
