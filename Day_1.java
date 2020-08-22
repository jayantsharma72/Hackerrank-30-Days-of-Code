import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        StringBuilder stb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.0");

        int j = scan.nextInt();
        double e = scan.nextDouble();
        scan.nextLine();
        String st = scan.nextLine();

        stb.append(i+j).append("\n");
        stb.append(df.format(d+e)).append("\n");
        stb.append(s).append(st);
        System.out.print(stb);

        scan.close();
    }
}