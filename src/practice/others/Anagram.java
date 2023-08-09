package practice.others;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1:::");
        String input = sc.nextLine();
        System.out.println("Enter String2:::");
        String input2 = sc.nextLine();
        String s1 = input.replaceAll(" ", "").toLowerCase();
        String s2 = input2.replaceAll(" ", "").toLowerCase();
        if(s1.length() != s2.length())
            System.out.println("Not anagram");
        else{
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1, c2))
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }
}
