package Youtube;

// https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
// https://youtu.be/mftPR2zgSrE?si=u5eglc1MNnDkCZDo


public class LoopInALinkedList {
    public static void main(String[] args) {
        int n1 = 5;
        int[] values1 = {1, 2, 3, 4, 5, 3};
        int pos = 0;
        ListNode head1 = createLinkedList(values1, pos);
        System.out.println(detectLoop(head1));
    }

    private static boolean detectLoop(ListNode head1) {
        ListNode slow = head1;
        ListNode fast = head1;
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    private static ListNode createLinkedList(int[] values, int pos) {

        if (values.length == 0)
            return null;
        ListNode head = new ListNode(values[0]);
        ListNode tail = head;
        ListNode loopNode = null;
        for (int i = 0; i < values.length; i++) {
            tail.next = new ListNode(values[i]);
            tail = tail.next;

            if (i == pos - 1) {
                loopNode = tail;
            }
        }
        if (pos > 0) {
            tail.next = loopNode;
        }
        return head;
    }
}
