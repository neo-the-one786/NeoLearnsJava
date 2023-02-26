

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
        if (head == null || head.next == null) {
            return;
        }
        Node<Integer> curr = head, alt = head.next;
        while (alt != null) {
            curr.next = alt.next;
            curr = alt.next;
            if (alt.next == null) {
                break;
            }
            alt = alt.next.next;
        }
    }
}
