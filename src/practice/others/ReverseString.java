package practice.others;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:::");
        String input = sc.next();
        System.out.println("output using recursion: " + recursion(input));
        System.out.println("output using method: " + reverse(input));
    }
    public static String recursion(String s){
        if((null == s) || s.length()<=1 )
            return s;
        return recursion(s.substring(1)) + s.charAt(0);
    }

    public static String reverse(String s){
        char[] c = s.toCharArray();
        for(int i=0; i< c.length/2 ; i++){
            char tmp = c[i];
            c[i] = c[c.length-i-1];
            c[c.length-i-1] = tmp;
        }
        System.out.println(c);
        return new String(c);
    }
}
