import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String bin = Integer.toBinaryString(n);
        int c = 0;
        int x = n;
        while(x != 0)
        {
            x = x & (x << 1);
            c += 1;
        }
        System.out.print(c);
        scanner.close();
    }
}
