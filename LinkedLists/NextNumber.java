public class Solution
{    
    // This function mainly uses addOneUtil().
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        // Reverse linked list
        head = reverse(head);

        // Add one from left to right of reversed
        // list
        head = addOneUtil(head);

        // Reverse the modified list
        return reverse(head);
    }
    public static LinkedListNode<Integer> addOneUtil(LinkedListNode<Integer> head)
    {
        // res is head node of the resultant list
        LinkedListNode<Integer> res = head, temp = null, prev = null;
 
        int carry = 1, sum;
 
        while (head != null) // while both lists exist
        {
            // Calculate value of next digit in resultant
            // list. The next digit is sum of following
            // things (i) Carry (ii) Next digit of head list
            // (if there is a next digit)
            sum = carry + head.data;
 
            // update carry for next calculation
            carry = (sum >= 10) ? 1 : 0;
 
            // update sum if it is greater than 10
            sum = sum % 10;
 
            // Create a new node with sum as data
            head.data = sum;
 
            // Move head and second pointers to next nodes
            temp = head;
            head = head.next;
        }
 
        // if some carry is still there, add a new node to
        // result list.
        if (carry > 0)
            temp.next = new LinkedListNode<Integer>(carry);
 
        // return head of the resultant list
        return res;
    }
    /* Function to reverse the linked list */
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head)
    {
        LinkedListNode<Integer> prev = null, current = head,  next = null;
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
