package Youtube;

public class NthElementFromLast {
    public static void main(String[] args) {
        int n1 = 5;
        int[] values1 = {1, 2, 3, 4, 5, 6, 7};
        int pos = 0;
        ListNode head1 = createLinkedList(values1, pos);
        int n = 5;
        System.out.println(NthElemnetfromlast(head1, n));
    }

    private static int NthElemnetfromlast(ListNode head1, int n) {
        ListNode first = head1;
        ListNode second = head1;
        while (second != null) {
            if (n == 0) {
                break;
            }
            second = second.next;
            n--;
        }
        if (n > 0) {
            return -1;
        }
        while (second != null) {
            first = first.next;
            second = second.next;

        }
        return first.val;
    }

    private static ListNode createLinkedList(int[] values, int pos) {

        if (values.length == 0)
            return null;
        ListNode head = new ListNode(values[0]);
        ListNode tail = head;
        ListNode loopNode = null;
        for (int i = 1; i < values.length; i++) {
            tail.next = new ListNode(values[i]);
            tail = tail.next;
        }
        return head;
    }
}
