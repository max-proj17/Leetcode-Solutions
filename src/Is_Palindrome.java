public class Is_Palindrome {
    static boolean isPalindrome(int x) {
        int reverseNum = 0;
        int tmp =x;
        while(tmp > 0) //Int reverse computation from palindrome problem!
        {
            reverseNum = reverseNum*10 + tmp%10;
            tmp/=10;
        }
        return x == reverseNum;
    }
    public static void main(String [] args)
    {
        int n = 50;
        
        System.out.println("input: " + n);
        System.out.println("output: " + isPalindrome(n));
        n = 456787654;
        System.out.println("input: " + n);
        System.out.println("output: " + isPalindrome(n));


    }
}
