import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stb1 = new StringBuilder();
        StringBuilder stb2 = new StringBuilder();
        int t = Integer.parseInt(read.readLine());
        while(--t >= 0)
        {
            String str = read.readLine().trim();
            for(int i=0;i<str.length();i++)
            {
                if(i % 2 == 0)
                    stb1.append(str.charAt(i));
                else
                    stb2.append(str.charAt(i));
            }
            System.out.print(stb1+" "+stb2+"\n");
            stb1.setLength(0);
            stb2.setLength(0);
        }
    }
}