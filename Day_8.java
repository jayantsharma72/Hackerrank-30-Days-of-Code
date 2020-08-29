import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, String> map = new HashMap<>();
        StringBuilder stb = new StringBuilder();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, String.valueOf(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.get(s) != null)
                stb.append(s).append("=").append(map.get(s)).append("\n");
            else
                stb.append("Not found\n");            
        }
        System.out.print(stb);
        in.close();
    }
}