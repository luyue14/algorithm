package list;

public class Reverse {
    public static ListNode commonReverse(ListNode node) {
        if (node == null) {
            return node;
        }
        ListNode p1 = node;
        ListNode p2 = node.next;
        node.next = null;
        ListNode p3;

        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }

    // public static ListNode recursionReverse(ListNode node) {
    //
    // }
}
