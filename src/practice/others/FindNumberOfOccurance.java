package practice.others;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FindNumberOfOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:::");
        String input = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charInput = input.toCharArray();
        for(char c: charInput){
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        for(Map.Entry<Character, Integer> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }
}
