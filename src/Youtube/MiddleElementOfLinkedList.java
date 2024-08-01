package Youtube;
// https://youtu.be/-sGnOw3F42Y?si=9SI9vkk81t2HaKOm


public class MiddleElementOfLinkedList {
    public static void main(String[] args) {
        int n1 = 5;
        int[] values1 = {1, 2, 3, 4, 5, 6, 7};
        int pos = 0;
        ListNode head1 = createLinkedList(values1, pos);
        System.out.println(midElement(head1));
    }

    private static int midElement(ListNode head1) {
        ListNode slow = head1;
        ListNode fast = head1;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow.val;
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
