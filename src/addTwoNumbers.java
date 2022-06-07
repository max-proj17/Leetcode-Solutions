import java.util.*;
public class addTwoNumbers {

    public static ListNode addTwoNumberss(ListNode l1, ListNode l2) {



        //add each number in list node left->
        //if one is shorter than the other, must carry nums > 9
        //return new Listnode with sum

        ListNode f = l1, s = l2;
        ListNode temp = new ListNode(0);
        ListNode tempTwo = temp;
        int carry = 0;

        while(f!=null || s!=null || carry!=0)
        {
            if(f!=null)
            {
                carry+=f.val;
                f=f.next;
            }
            if(s!=null)
            {
                carry+=s.val;
                s=s.next;
            }

            tempTwo.next = new ListNode(carry % 10); //this sets the current digit to the remainder.
            tempTwo = tempTwo.next;
            carry /= 10; //retrieves the number that is carried over to the next iteration.


        }
        return temp.next; //because temp.val=0 we must return the starting ListNode we created (tempTwo)



    }

    public static void main(String [] args)
    {
        ListNode a =  new ListNode(2);
        ListNode b =  new ListNode(4);
        ListNode c =  new ListNode(3);
        ListNode d =  new ListNode(5);
        ListNode e =  new ListNode(6);
        ListNode f =  new ListNode(4);
        a.next = b;
        b.next = c;



        d.next = e;
        e.next = f;

        ListNode apple = new ListNode(9);
        ListNode bee = new ListNode(9);
        ListNode cat = new ListNode(9);
        ListNode dog = new ListNode(9);
        ListNode egg = new ListNode(9);
        ListNode finch = new ListNode(9);
        ListNode grass = new ListNode(9);


        apple.next = bee;
        bee.next = cat;
        cat.next = dog;
        dog.next = egg;
        egg.next = finch;
        finch.next = grass;


        ListNode a1 = new ListNode(9);
        ListNode b2 = new ListNode(9);
        ListNode c3 = new ListNode(9);
        ListNode d4 = new ListNode(9);
        a1.next = b2;
        b2.next = c3;
        c3.next = d4;

        ListNode test = new ListNode(0);
        ListNode finish = new ListNode(0);

        System.out.println("Input: l1 = [2, 4, 3], l2 = [5, 6, 4]");
        System.out.println("Expected: [7, 0, 8]");
        System.out.println("Output: " + addTwoNumberss(apple, a1).toString());


    }

}
