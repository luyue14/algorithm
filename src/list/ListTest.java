package list;

public class ListTest {
    public static void main(String[] args) {
        int[] array = { 1, 2, 423, 4, 22, 42 };

        printList(Reverse.commonReverse((buildList(array))));
    }

    public static ListNode buildList(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        ListNode first = new ListNode(array[0]);
        ListNode pre = first;
        for (int i = 1; i < array.length; i++) {
            ListNode temp = new ListNode(array[i]);
            pre.next = temp;
            pre = pre.next;
        }
        return first;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }
}
