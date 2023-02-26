
    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

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
