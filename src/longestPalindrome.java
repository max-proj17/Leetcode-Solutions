public class longestPalindrome {
    public static String longestPalindrome(String s)
    {
        int strlen = s.length();
        String str = s;
        if(strlen < 2)
        {
            return s;
        }

        int maxLen = 1;

        int start = 0, high =0, low  = 0;

        for(int i=0; i<strlen; i++)
        {

            high = i + 1;
            low = i - 1;

            while(high < strlen && str.charAt(high) == str.charAt(i))
            {
                high++;
            }
            while(low >=0 && str.charAt(low) == str.charAt(i))
            {
                low--;
            }
            while(low>=0 && high<strlen && str.charAt(high) == str.charAt(low))
            {
                high++;
                low--;
            }

            int currLen = high - low - 1;
            if(maxLen < currLen)
            {
                maxLen = currLen;
                start = low + 1;

            }

        }
        String final_str =  str.substring(start, start+maxLen);
        return final_str;
    }
    public static void main(String [] args)
    {

        String a = "baaabdhvji";
        String b = "aaaaa";
        String c = "mooomkjkjuuuhh";
        String d = b + c;

        System.out.println("Input: " + a);
        System.out.println("Output: " + longestPalindrome(a));


        System.out.println("Input: " + b);
        System.out.println("Output: " + longestPalindrome(b));


        System.out.println("Input: " + c);
        System.out.println("Output: " + longestPalindrome(c));


        System.out.println("Input: " + d);
        System.out.println("Output: " + longestPalindrome(d));

    }
}
