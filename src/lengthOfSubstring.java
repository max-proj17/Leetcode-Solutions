import java.util.*;
public class lengthOfSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Queue<Character> longest = new LinkedList();
        Map<Character, Integer> contains  = new HashMap<>();
        char [] letters = s.toCharArray();
        int pointer = 0;
        int len = 0;

        while(pointer < s.length())
        {
            if(contains.get(letters[pointer]) == null || contains.get(letters[pointer]) == 0)
            {
                longest.add(letters[pointer]);
                contains.put(letters[pointer], 1);
                if(longest.size() > len)
                {
                    len = longest.size();
                }

                pointer+=1;

            }else
            {

                char c = longest.remove();
                contains.put(c, 0);
            }
        }

        return len;

    }
    public static void main(String [] args)
    {
        System.out.println("input: abcabcbb \noutput: " + lengthOfLongestSubstring("abcabcbb"));
    }
}
