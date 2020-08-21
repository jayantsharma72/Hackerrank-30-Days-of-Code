import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
	public static void main(String[] args) {
        StringBuilder stb=new StringBuilder();
		Scanner scan = new Scanner(System.in); 
        String inputString = scan.nextLine();	
        stb.append("Hello, World.").append("\n").append(inputString);	 
		System.out.print(stb);
        scan.close();
	}
}
