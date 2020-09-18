import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try
        {
            int num = Integer.parseInt(S);
            System.out.print(num);
        }
        catch(Exception ex)
        {
            System.out.print("Bad String");
        }
    }
}
