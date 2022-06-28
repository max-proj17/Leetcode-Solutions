public class revInteger {
    public static int reverse(int x) {
        //take remainder and continuously divide num\
        int n = 1;
        if(x<0)
        {
            n = -1;
        }
        x = Math.abs(x);
        int rev = 0;
        while(x!=0)
        {
            //times 10 adds place for next number
            if(rev*n > Integer.MAX_VALUE/10 || rev*n < Integer.MIN_VALUE/10)
            {
                return 0;
            }
            rev = rev*10 + x%10;
            x = x/10;

        }
        return rev*n;

    }

    public static void main(String [] args)
    {
        System.out.println("Input: 321\nOutput:" + reverse(321));
    }
}
