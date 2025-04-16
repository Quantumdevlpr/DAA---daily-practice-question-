public class MergeLL {
    public static void main(String[] args) {
        ListNode head1 = createList(new int[]{1, 3, 5});
        ListNode head2 = createList(new int[]{2, 4, 6});
        ListNode mergedHead = mergeTwoLists(head1, head2);
        printList(mergedHead); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6
    }
    
    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    // Helper to create linked list
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
    
}
