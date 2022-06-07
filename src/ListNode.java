public class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public String toString()
    {
        String final_s = "[ " + this.val + ", ";
        ListNode current = this;
        while(current.next != null)
        {
            final_s = final_s + current.next.val + " ";
            current = current.next;

        }
        final_s = final_s + "]";
        return final_s;
    }
}

